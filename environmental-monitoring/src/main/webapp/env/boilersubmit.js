/**
 * Created by wanglei on 2017/12/19.
 */
//保存大气样品信息
var airTemplateData;
var rowId;
$(document).ready(function () {

    //定义大气样品
    var columns = [
        {'field': '项目编号', 'title': '项目编号'},
        {'field': '点位编号', 'title': '点位编号'},
        {'field': '样品编号', 'title': '样品编号'},
        {'field': '分类', 'title': '分类'},
        {'field': '样品类别', 'title': '样品类别'},
        {'field': '检测类别', 'title': '检测类别'},
        {'field': '时间段', 'title': '时间段'},
        {'field': '检测日期', 'title': '检测日期'},
        {'field': '勾选', 'title': '是否已上传'}
    ];
    //生成表格对象并初始化
    new RadioTableObject('tab-id_pointInfo', columns).Init();
    //隐藏文件上传区域
    $("#div-id_fileInput").hide();

    var boilerInfoColumns = [
        {'field': '项目编号', 'title': '项目编号'},
        {'field': '点位编号', 'title': '点位编号'},
        {'field': '样品编号', 'title': '样品编号'},
        {'field': '序号', 'title': '序号'},
        {'field': '时间段', 'title': '时间段'},
        {'field': '项目名称', 'title': '项目名称'},
        {'field': '检测结果', 'title': '检测结果'},
        {'field': '方法代码', 'title': '方法代码'},
        {'field': '单位', 'title': '单位'},
        {'field': '仪器编号', 'title': '仪器编号'},
        {'field': '检测人', 'title': '检测人'}
    ];
    //生成表格对象并初始化
    new RadioTableObject('tab-id_boilerInfo', boilerInfoColumns).Init();
    //隐藏锅炉数据区域
    // $("#div-id-table_boilerInfo").hide();

    //用户项目编号下拉列表展示
    $.post("/service/pointManage/airPointManagePageInit",'',function (data) {
        var prjArray = [];
        if('false' == data['result']) {
            $("#项目编号").selectLoad(prjArray);
            return;
        }
        var prjList = data['项目信息'];
        //加载数据
        for(var i = 0; i < prjList.length; i++) {
            var item ={
                value:prjList[i],
                desc:prjList[i]
            };
            prjArray.push(item);
        }
        $("#项目编号").selectLoad(prjArray);
    },"json");

    //初始化：锅炉模板下拉列表展示
    initBoilerTemplate();

    $('#form-id_noisesubmit').bootstrapValidator({
        message: 'This value is not valid',
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            设计工况: {
                validators: {
                    notEmpty: {
                        message: '设计工况不能为空'
                    },
                    numeric:{
                        message: '设计工况必须为数组'
                    }
                }
            },
            运行工况: {
                validators: {
                    notEmpty: {
                        message: '运行工况不能为空'
                    },
                    numeric:{
                        message: '运行工况必须为数组'
                    }
                }
            },
            单位: {
                validators: {
                    notEmpty: {
                        message: '单位不能为空'
                    }
                }
            }
        }
    });
});

/**
 * 初始化锅炉模板下拉列表展示
 */
function initBoilerTemplate() {
    $.post("/service/queryBoilerTemplate",'',function (data) {
        var prjArray = [];
        if('false' == data['result']) {
            $("#锅炉模板").selectLoad(prjArray);
            return;
        }
        //加载数据
        for(var i = 0; i < data.length; i++) {
            var v = JSON.stringify(data[i]);
            var item ={
                value:v,
                desc:data[i]['项目名称']
            };
            prjArray.push(item);
        }
        $("#锅炉模板").selectLoad(prjArray);
    },"json");
}

/**
 *
 * 根据项目编码查询点位信息-样品查询
 *
 */
function queryPointByPrjCode() {
    //隐藏文件上传区域
    $("#div-id_fileInput").hide();
    var prjNumCode = $("#项目编号").val();
    if(typeof(prjNumCode) == 'undefined' || '-1' == prjNumCode || null == prjNumCode) {
        alert("请选择项目编号");
        return;
    }

    //定义提示对话框
    var dialog = createLoading();
    dialog.open();
    var param = $("#form-id_query").serialize();
    //加載沒有上传过的数据
    param+='&勾选=y&样品类别=有组织废气';
    $.post("/service/样品查询",param,function (data) {
        dialog.close();
        if('false' == data['result']) {
            alert(data['message']);
            return;
        }
        airTemplateData = data;
        //加载数据
        loadData($("#tab-id_pointInfo"),data);
    },"json");
}

/**
 * 表格行的单击事件
 */
$("#tab-id_pointInfo").on('click-row.bs.table', function(e,row, element) {
    // console.log(e);
    // console.log(row);
    // console.log(element);

    //清空工况回传表单
    $('#form-id_noisesubmit').formClear();
    $("#form-id_noisesubmit").data('bootstrapValidator').resetForm();

    rowId = element.data('index');
    //如果当前选择记录已经被上传，则不允许在上传
    var isHavedUpload = row["勾选"];
    if(typeof isHavedUpload != undefined && 'y' == isHavedUpload) {
        alert("当前检测点已上传！");
        //隐藏文件上传区域
        $("#div-id_fileInput").hide();
        //当前行不选择
        $('#tab-id_pointInfo').bootstrapTable('uncheck',element.data('index'));
        return;
    }
    //显示文件上传区域
    $("#div-id_fileInput").show();
});
/**
 * 回调函数，用于文件上传时获取额外的参数
 * @returns {*}
 */
uploadExtendParam = function () {
    //将点位信息回传
    var selectRows = $('#tab-id_pointInfo').bootstrapTable('getSelections');
    var obj = selectRows[0];
    obj.项目编号 = $("#项目编号").val();
    return selectRows[0];
};
/**
 *
 * 回调函数：文件上传成功后
 *
 */
$('#file-0').on('fileuploaded', function(event, data, previewId, index) {
    var selectRows = $('#tab-id_pointInfo').bootstrapTable('getSelections');
    var obj = selectRows[0];
    obj.项目编号 = $("#项目编号").val();

    //设置是否上传标识
    airTemplateData[rowId].勾选='y';
    //$('#tab-id_pointInfo').bootstrapTable('refresh',airTemplateData);
    loadData($("#tab-id_pointInfo"),airTemplateData);
    //$('#tab-id_pointInfo').bootstrapTable('updateCell','勾选','y');
    // $('#tab-id_pointInfo').bootstrapTable('refresh',{query:airTemplateData});

    //上传成功后，显示数据
    $.post("/service/查询锅炉数据",obj,function (data) {
        if('false' == data['result']) {
            alert(data['message']);
            return;
        }
        // $("#div-id-table_boilerInfo").show();
        //加载数据
        loadData($("#tab-id_boilerInfo"),data);
    },"json");
});

/**
 *
 * 工况回传
 *
 */
function operatingModeSubmit() {

    // var aa = $("#form-id_noisesubmit").data("bootstrapValidator").validate();
    //手动验证
    if(!$('#form-id_noisesubmit').data('bootstrapValidator').isValid()){
        return ;
    }

    var param = $("#form-id_noisesubmit").serialize();
    var selectRows = $('#tab-id_pointInfo').bootstrapTable('getSelections');
    if(selectRows.length == 0) {
        alert("请先选择点位信息！");
        return;
    }
    var pointCode = selectRows[0]["点位编号"];
    var prjCode = $("#项目编号").val();
    param += "&项目编号="+prjCode;
    param += "&点位编号="+pointCode;
    $.post("/service/工况回传",param,function (data) {
        alert(data['message']);
    },"json");
}

function calculate() {
    var v1 = $("#设计工况").val();
    var v2 = $("#运行工况").val();
    if(typeof(v1) == 'undefined' || '' == v1 || null == v1) {
        return;
    }
    if(typeof(v2) == 'undefined' || '' == v2 || null == v2) {
        return;
    }
    var result = (v2/v1)*100;
    //取整数
    var r1 = parseInt(result);
    var temp = (result % 1)*100;
    var r2 = parseInt(temp);
    if(0 == r2) {
        $("#负荷百分比").val(r1);
    }else{
        if(r2 < 10) {
            r2 = '0'+r2;
        }
        $("#负荷百分比").val(r1+'.'+r2);
    }
}

function commitAirResult() {
    var selectRows = $('#tab-id_pointInfo').bootstrapTable('getSelections');
    if(selectRows.length == 0) {
        alert("请先选择样品！");
        return;
    }

    var boilerTemplateStr = $("#锅炉模板").val();
    if(typeof(boilerTemplateStr) == 'undefined' || '-1' == boilerTemplateStr || null == boilerTemplateStr) {
        alert("请选择锅炉模板");
        return;
    }
    var boilerTemplateJson = JSON.parse(boilerTemplateStr);

    var obj = selectRows[0];
    var param = '项目编号='+obj['项目编号'];
    param += '&点位编号='+obj['点位编号'];
    param += '&样品编号='+obj['样品编号'];
    param += '&序号='+boilerTemplateJson['序号'];
    param += '&时间段='+obj['时间段'];
    param += '&项目名称='+boilerTemplateJson['项目名称'];
    var checkResult = $("#项目值").val();
    if(typeof(checkResult) == 'undefined') {
        checkResult = '';
    }
    param += '&检测结果='+checkResult;
    param += '&方法代码='+boilerTemplateJson['方法代码'];
    param += '&单位='+boilerTemplateJson['单位'];
    param += '&仪器编号='+boilerTemplateJson['仪器编号'];

    var checkDate = $("#检测日期").val();
    var regDate = /^\d{8}$/;
    if (!regDate.test(checkDate)) {
        alert("请输入8位有效日期！")
        return;
    }
    param += '&检测日期In='+checkDate;

    var checkTime = $("#时间").val();
    var regTime = /^\d{6}$/;
    if (!regTime.test(checkTime)) {
        alert("请输入6位有效时间！")
        return;
    }
    if(typeof(checkTime) == 'undefined') {
        checkTime = '';
    }
    param += '&时间In='+checkTime;

    $.post("/service/saveBoilerResult",param,function (data) {
        alert(data['message']);
        if('false' == data['result']) {
            return;
        }else{
            $("#项目值").val('');
            $("#锅炉模板").val('-1');
            $("#myModal").modal('hide');
        }
    },"json");

    //显示锅炉数据
    $.post("/service/查询锅炉数据",obj,function (data) {
        if('false' == data['queryParam']) {
            alert(data['message']);
            return;
        }
        //加载数据
        loadData($("#tab-id_boilerInfo"),data);
    },"json");
}



