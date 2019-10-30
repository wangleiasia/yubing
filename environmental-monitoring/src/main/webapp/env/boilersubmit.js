/**
 * Created by wanglei on 2017/12/19.
 */
//保存大气样品信息
var airTemplateData;
var rowId;
var glDataG;
var oper='';

var yqbh;


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
        {'field': '检测人', 'title': '检测人'},
        {'field': '检测日期', 'title': '检测日期'},
        {'field': '时间', 'title': '检测时间'},
        {'field': '复核', 'title': '复核'}
    ];
    //生成表格对象并初始化
    new RadioTableObject('tab-id_boilerInfo', boilerInfoColumns).Init();
    //隐藏锅炉数据区域
    // $("#div-id-table_boilerInfo").hide();

    //工况数据回显区域
    var gkColumns = [
        {'field': '项目编号', 'title': '项目编号'},
        {'field': '点位编号', 'title': '点位编号'},
        {'field': '设计工况', 'title': '设计工况'},
        {'field': '运行工况', 'title': '运行工况'},
        {'field': '百分比', 'title': '百分比'},
        {'field': '单位', 'title': '单位'},
        {'field': '检测结果', 'title': '检测结果'},
        {'field': '时间段', 'title': '时间段'}
    ];
    new RadioTableObject('tab-id_gkInfos', gkColumns).Init();

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

    //初始化一起编号数据
    $.post("/service/pointManage/queryEquipmentForAir",'',function (data) {
        var equipmentArray = [];
        if('false' == data['result']) {
            $("#设备编号").selectLoad(equipmentArray);
            return;
        }
        //加载数据
        for(var i = 0; i < data.length; i++) {
            var descV = '['+data[i]['设备编号']+']['+data[i]['设备名称']+']';
            var item ={
                value:data[i]['设备编号'],
                desc:descV
            };
            equipmentArray.push(item);
        }

        yqbh = equipmentArray;

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
        //$("#锅炉模板").selectLoad(prjArray);

        initGlHtml(data);
        glDataG = data;

        $("#myModal").modal('show');

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
    var sjd = row.时间段;
    var param = "项目编号="+row.项目编号;
    param += "&点位编号="+row.点位编号;
    param += "&样品编号="+row.样品编号;
    $.post("/service/查询工况信息",param,function (data) {
        loadData($("#tab-id_gkInfos"),data);
    },"json");

    $("#时间段").val(sjd);

    //初始化锅炉数据
    $.post("/service/查询锅炉数据",param,function (data) {
        if('false' == data['queryParam']) {
            alert(data['message']);
            alert('ddfs');
            return;
        }
        //加载数据
        loadData($("#tab-id_boilerInfo"),data);
    },"json");

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
        loadData($("#tab-id_gkInfos"),data);
        alert("工况回传成功！");
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
            alert('ddfs');
            return;
        }
        //加载数据
        loadData($("#tab-id_boilerInfo"),data);
    },"json");
}

//批量新增
function mutiAdd() {
    //初始化：锅炉模板下拉列表展示
    initBoilerTemplate();
}

var recordLen = 0;
function initGlHtml(glData) {
    var html = "";
    recordLen = glData.length;
    for(var i = 0; i < glData.length; i++) {
        html += getGlHtml(i,glData[i]);
    }
    $("#airResultForm").append(html);

    var yqbhSelectHtml = getYqbhHtml();

    for(var i = 0; i < glData.length; i++) {
        //初始化日期控件
        var dataId = '检测日期'+i;
        var timeId = '时间'+i;
        $("#"+dataId).datetimepicker({
            format: 'yyyy-mm-dd',
            minView: "month",
            language:  'zh-CN',
            todayBtn:  1,
            autoclose: 1
        }).on('changeDate',function(ev) {
            //日期回调函数
            // debugger
            var id = ev.currentTarget.id;
            var time = $("#"+id).val();
            for(var i = 0; i < recordLen; i++) {
                $("#检测日期"+i).val(time);
            }
        });
        $("#"+timeId).datetimepicker({
            // dateFormat: 'yyyy-mm-dd',//日期显示格式
            format:'hh:ii:ss',//时间显示格式
            minView: "0",
            language:  'zh-CN',
            todayBtn:  1,
            autoclose: 1,
            minuteStep:1
        }).on('changeDate',function(ev) {
            //日期回调函数
            // debugger
            var id = ev.currentTarget.id;
            if('时间0' == id) {
                var time = $("#" + id).val();
                for (var i = 0; i < recordLen; i++) {
                    $("#时间" + i).val(time);
                }
            }
        });

        //初始化模版数据
        var v = JSON.stringify(glData[i]);
        var glDataId = 'glData'+i;
        $("#"+glDataId).attr("value",v);

        // debugger
        var yqbhId = '仪器编号'+i;
        $("#"+yqbhId).html(yqbhSelectHtml)
    }
}

function valueChg() {
    for(var i = 1; i < recordLen; i++) {
        $("#仪器编号"+i).val($("#仪器编号0").val());
    }
}

function getYqbhHtml() {
    var html = '<option value = "">--请选择--</option>';
    for (var i = 0; i < yqbh.length; i++) {
        html += '<option value = "'+yqbh[i].value+'">'+yqbh[i].desc+'</option>';
    }
    return html;
}

function getGlHtml(i,data) {
    // var v = JSON.stringify(data);
    var html = "";

    var template = data['项目名称'];

    html += '<div class="form-group">\n' +
        '        <input type="text" class="form-control" style="width:200px;" id="锅炉模板'+i+'" placeholder="锅炉模板" value="'+template+'">\n' +
        '        </div>\n' +
        '        <div class="form-group">\n' +
        '        <input type="text" class="form-control" style="width:150px;" id="项目值'+i+'" placeholder="项目值">\n' +
        '        </div>\n' +
        '        <div class="form-group">\n' +
        '        <input type="text" class="form-control" style="width:150px;" id="检测日期'+i+'" placeholder="检测日期，例如输入：20180101">\n' +
        '        </div>\n' +
        '        <div class="form-group">\n' +
        '        <input type="text" class="form-control" style="width:150px;" id="时间'+i+'" placeholder="检测时间，例如输入：123056">\n' +
        '        </div>';
    if(i == 0) {
        html += '<div class="form-group">\n' +
            '        <select class="form-control" style="width:150px;" onchange="valueChg()" id="仪器编号'+i+'" placeholder="仪器编号"></select>\n' +
            '        </div>';
    }else{
        html += '<div class="form-group">\n' +
            '        <select class="form-control" style="width:150px;" id="仪器编号'+i+'" placeholder="仪器编号"></select>\n' +
            '        </div>';
    }
    html += '<div class="form-group" style="display: none">\n' +
        '        <input type="text" class="form-control" id="glData'+i+'" placeholder="检测时间，例如输入：123056">\n' +
        '        </div>';
    return html;
}
//初始化一起编号下拉列表
function initYqbh() {
    $.post("/service/pointManage/queryEquipmentForAir",'',function (data) {
        var equipmentArray = [];
        debugger
        if('false' == data['result']) {
            $("#设备编号").selectLoad(equipmentArray);
            return;
        }
        //加载数据
        for(var i = 0; i < data.length; i++) {
            var descV = '['+data[i]['设备编号']+']['+data[i]['设备名称']+']';
            var item ={
                value:data[i]['设备编号'],
                desc:descV
            };
            equipmentArray.push(item);
        }

        for (var i = 0; i < recordLen; i++) {
            $("#仪器编号"+i).selectLoad(equipmentArray);
        }

    },"json");
}

function validSubmit() {
    var glDataId = '';
    var result = true;
    for(var i = 0; i < glDataG.length; i++) {
        // var checkResult = $("#项目值"+i).val();
        // if(typeof(checkResult) == 'undefined') {
        //     checkResult = '';
        // }
        // if('' == checkResult) {
        //     alert('检测结果不能为空！');
        //     result = false;
        //     break;
        // }
        var checkData = $("#检测日期"+i).val();
        if(typeof(checkData) == 'undefined') {
            checkData = '';
        }
        if('' == checkData) {
            alert('检测日期不能为空！');
            result = false;
            break;
        }
        var checkTime = $("#时间"+i).val();
        if(typeof(checkTime) == 'undefined') {
            checkTime = '';
        }
        if('' == checkTime) {
            alert('时间不能为空！');
            result = false;
            break;
        }
    }
    return result;
}


function commitAirResult2() {
    var selectRows = $('#tab-id_pointInfo').bootstrapTable('getSelections');
    if(selectRows.length == 0) {
        alert("请先选择样品！");
        return;
    }

    var obj = selectRows[0];

    //校验输入的内容是否空
    if(!validSubmit()) {
        return;
    }

    var jsonData = getGlJsonData();
    // console.log(jsonData);
    // console.log(JSON.stringify(jsonData));

    $.ajax({
        // headers必须添加，否则会报415错误
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        type: 'POST',
        dataType: "json", //表示返回值类型，不必须
        data: JSON.stringify(jsonData),
        url: '/service/saveBoilerResult2',
        success: function(data){
            alert('提交成功');
            $("#myModal").modal('hide');
            //显示锅炉数据
            $.post("/service/查询锅炉数据",obj,function (data) {
                if('false' == data['queryParam']) {
                    alert(data['message']);
                    alert('ddfs');
                    return;
                }
                //加载数据
                loadData($("#tab-id_boilerInfo"),data);
            },"json");
        }

    });

}

function getGlJsonData() {
    var glDataId = '';
    var glJsonArray=[];

    var selectRows = $('#tab-id_pointInfo').bootstrapTable('getSelections');
    var obj = selectRows[0];
    for(var i = 0; i < glDataG.length; i++) {
        glDataId = 'glData'+i;
        var boilerTemplateStr = $("#"+glDataId).val();
        var boilerTemplateJson = JSON.parse(boilerTemplateStr);

        var item={};
        item.项目编号=obj['项目编号'];
        item.点位编号=obj['点位编号'];
        item.样品编号=obj['样品编号'];
        item.序号=boilerTemplateJson['序号'];
        item.时间段=obj['时间段'];
        item.项目名称=boilerTemplateJson['项目名称'];

        var checkResult = $("#项目值"+i).val();
        if(typeof(checkResult) == 'undefined') {
            checkResult = '';
        }

        item.检测结果=checkResult;
        item.方法代码=boilerTemplateJson['方法代码'];
        item.单位=boilerTemplateJson['单位'];
        //item.仪器编号=boilerTemplateJson['仪器编号'];

        var checkData = $("#检测日期"+i).val();
        if(typeof(checkData) == 'undefined') {
            checkData = '';
        }
        item.s检测日期=checkData;

        var checkTime = $("#时间"+i).val();
        if(typeof(checkTime) == 'undefined') {
            checkTime = '';
        }
        item.时间=checkTime;


        var yqbhVal = $("#仪器编号"+i).val();
        if(typeof(yqbhVal) == 'undefined') {
            yqbhVal = '';
        }
        item.仪器编号=yqbhVal;

        glJsonArray.push(item);
    }

    return glJsonArray;
}

var updateRow ;
$("#tab-id_boilerInfo").on('dbl-click-row.bs.table', function(e,row, element) {
    // console.log(e);
    // console.log(row);
    // console.log(element);

    //已审核的数据，不能在进行修改
    // debugger
    var shr = row.复核;
    if(shr != '') {
        alert('当前数据已经审核，不允许修改！');
        return;
    }

    initDatePickerForUp();

    $("#仪器编号").html(getYqbhHtml());

    $("#项目名称").val(row.项目名称);
    $("#检测结果").val(row.检测结果);
    $("#检测日期").val(row.检测日期);
    $("#时间").val(row.时间);
    $("#仪器编号").val(row.仪器编号);

    updateRow = row;

    oper='edit';
    $("#UpMyModal").modal('show');
});

function updateGlsj() {
    var selectRows = $('#tab-id_pointInfo').bootstrapTable('getSelections');
    if(selectRows.length == 0) {
        alert("请先选择样品！");
        return;
    }
    var obj = selectRows[0];

    var url = '';
    var jsonData = '';
    var msg = '';
    var modelId = '';
    if('add' == oper) {
        url = '/service/saveBoilerResult2';
        if(!validSubmitForAddSignle()) {
            return;
        }
        jsonData = getGlJsonDataForAdd();
        msg = '新增成功';
        modelId = 'AddMyModal';
    }else if('edit' == oper) {
        url = '/service/updateGlsj';
        if(!validSubmitFoUpdate()) {
            return;
        }
        jsonData = getGlJsonDataForUp();
        msg = '更新成功';
        modelId = 'UpMyModal';
    }
    $.ajax({
        // headers必须添加，否则会报415错误
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        type: 'POST',
        dataType: "json", //表示返回值类型，不必须
        data: JSON.stringify(jsonData),
        // data: item,
        url: url,
        success: function(data){
            alert(msg);
            $("#"+modelId).modal('hide');
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

    });

}

function getGlJsonDataForUp() {
    var glJsonArray=[];
    var selectRows = $('#tab-id_pointInfo').bootstrapTable('getSelections');
    var obj = selectRows[0];

    var item={};
    item.项目编号=obj['项目编号'];
    item.点位编号=obj['点位编号'];
    item.样品编号=obj['样品编号'];
    item.序号=updateRow.序号;
    item.时间段=obj['时间段'];
    item.项目名称=updateRow.项目名称;

    item.方法代码=updateRow.方法代码;
    item.单位=updateRow.单位;
    //item.仪器编号=updateRow.仪器编号;
    item.仪器编号=$("#仪器编号").val();

    item.检测结果=$("#检测结果").val();
    item.s检测日期=$("#检测日期").val();
    item.时间=$("#时间").val();

    glJsonArray.push(item);


    return glJsonArray;
}


function validSubmitFoUpdate() {
    var glDataId = '';
    var result = true;

    // var checkResult = $("#检测结果").val();
    // if(typeof(checkResult) == 'undefined') {
    //     checkResult = '';
    // }
    // if('' == checkResult) {
    //     alert('检测结果不能为空！');
    //     result = false;
    // }
    var checkData = $("#检测日期").val();
    if(typeof(checkData) == 'undefined') {
        checkData = '';
    }
    if('' == checkData) {
        alert('检测日期不能为空！');
        result = false;
    }
    var checkTime = $("#时间").val();
    if(typeof(checkTime) == 'undefined') {
        checkTime = '';
    }
    if('' == checkTime) {
        alert('时间不能为空！');
        result = false;
    }

    return result;
}

function validSubmitForAddSignle() {
    var result = true;
    var boilerTemplateStr = $("#a_项目名称").val();
    if(typeof(boilerTemplateStr) == 'undefined') {
        boilerTemplateStr = '-1';
    }
    if('-1' == boilerTemplateStr) {
        alert('请选择项目名称！');
        result = false;
        return result;
    }
    var checkData = $("#a_检测日期").val();
    if(typeof(checkData) == 'undefined') {
        checkData = '';
    }
    if('' == checkData) {
        alert('检测日期不能为空！');
        result = false;
    }
    var checkTime = $("#a_时间").val();
    if(typeof(checkTime) == 'undefined') {
        checkTime = '';
    }
    if('' == checkTime) {
        alert('时间不能为空！');
        result = false;
    }

    return result;
}

function addGlsjSignle() {
    oper = 'add';
    initDatePickerForAdd();

    //初始化模版
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
        $("#a_项目名称").selectLoad(prjArray);

    },"json");

    $("#a_仪器编号").html(getYqbhHtml());

    // $('#项目名称').removeAttr("readonly");
    $("#AddMyModal").modal('show');
}

function initDatePickerForUp() {
    //初始化日期控件
    $("#检测日期").datetimepicker({
        format: 'yyyy-mm-dd',
        minView: "month",
        language:  'zh-CN',
        todayBtn:  1,
        autoclose: 1
    }).on('changeDate',function(ev) {
    });
    $("#时间").datetimepicker({
        // dateFormat: 'yyyy-mm-dd',//日期显示格式
        format:'hh:ii:ss',//时间显示格式
        minView: "0",
        language:  'zh-CN',
        todayBtn:  1,
        autoclose: 1,
        minuteStep:1
    }).on('changeDate',function(ev) {
    });
}
function initDatePickerForAdd() {
    //初始化日期控件
    $("#a_检测日期").datetimepicker({
        format: 'yyyy-mm-dd',
        minView: "month",
        language:  'zh-CN',
        todayBtn:  1,
        autoclose: 1
    }).on('changeDate',function(ev) {
    });
    $("#a_时间").datetimepicker({
        // dateFormat: 'yyyy-mm-dd',//日期显示格式
        format:'hh:ii:ss',//时间显示格式
        minView: "0",
        language:  'zh-CN',
        todayBtn:  1,
        autoclose: 1,
        minuteStep:1
    }).on('changeDate',function(ev) {
    });
}


function getGlJsonDataForAdd() {
    var glDataId = '';
    var glJsonArray=[];

    var selectRows = $('#tab-id_pointInfo').bootstrapTable('getSelections');
    var obj = selectRows[0];

    var boilerTemplateStr = $("#a_项目名称").val();
    var boilerTemplateJson = JSON.parse(boilerTemplateStr);

    var item={};
    item.项目编号=obj['项目编号'];
    item.点位编号=obj['点位编号'];
    item.样品编号=obj['样品编号'];
    item.序号=boilerTemplateJson['序号'];
    item.时间段=obj['时间段'];
    item.项目名称=boilerTemplateJson['项目名称'];

    var checkResult = $("#a_检测结果").val();
    if(typeof(checkResult) == 'undefined') {
        checkResult = '';
    }

    item.检测结果=checkResult;
    item.方法代码=boilerTemplateJson['方法代码'];
    item.单位=boilerTemplateJson['单位'];
    //item.仪器编号=boilerTemplateJson['仪器编号'];
    item.仪器编号=$("#a_仪器编号").val();

    var checkData = $("#a_检测日期").val();
    if(typeof(checkData) == 'undefined') {
        checkData = '';
    }
    item.s检测日期=checkData;

    var checkTime = $("#a_时间").val();
    if(typeof(checkTime) == 'undefined') {
        checkTime = '';
    }
    item.时间=checkTime;

    glJsonArray.push(item);

    return glJsonArray;
}

