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
    $("#div-id-table_boilerInfo").hide();

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
 *
 * 根据项目编码查询点位信息-大气样品查询
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
    $.post("/service/大气样品查询",param,function (data) {
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
        $("#div-id-table_boilerInfo").show();
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



