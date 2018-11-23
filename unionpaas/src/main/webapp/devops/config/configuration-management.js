/**
 * Created by wanglei on 2018/11/19.
 */

$(document).ready(function () {
    var columns = [
        {'field': 'configId', 'title': '配置ID'},
        {'field': 'dmpId', 'title': 'DMP单号'},
        {'field': 'fileName', 'title': '文件路径'},
        {'field': 'createDate', 'title': '提交时间'},
        {'field': 'dmpDate', 'title': 'DMP创建时间'},
        {'field': 'configContext', 'title': '配置内容','visible':false},
        {'field': 'configDescription', 'title': '配置描述','visible':false},
        {'field': 'submitter', 'title': '提交人'}
    ];
    //生成表格对象并初始化
    new RadioTableObject('tab-id_config', columns).Init();

    //初始化日历组件
    $(function () {
        $('#datetimepicker-beginDate').datetimepicker({
            locale: 'zh-cn',
            format: 'YYYY-MM-DD HH:mm:ss',
            dayViewHeaderFormat: 'YYYY MMMM',
            sideBySide: true
        });
        $('#datetimepicker-endDate').datetimepicker({
            locale: 'zh-cn',
            format: 'YYYY-MM-DD HH:mm:ss',
            dayViewHeaderFormat: 'YYYY MMMM',
            sideBySide: true
        });
    });

    //表单验证
    var formValidate = $( "#form-id_configInfo" ).validate({
        rules: {
            dmpId: "required",
            fileName:"required",
            configContext:"required",
            configDescription:"required"
        },
        messages:{
            dmpId: {
                required: "请输入DMP编号"
            },
            fileName:{
                required: "请输入文件路径"
            }
        }
    });
    $("#id_submit-addConfig").click(function() {
        if(formValidate.form()) {
            addConfig();
        }
    });

    //查询
    $("#id_btn-queryConfigInfo").click(function() {
        queryConfigInfo();
    });

    //删除
    $("#id-btn_delConfigInfo").click(function () {
        var rowObj = $("#tab-id_config").bootstrapTable('getSelections',function (row) {
            return row;
        });
        if(rowObj.length == 0) {
            alert("请选择需要删除的行！");
            return;
        }
        var configId = rowObj[0]['configId'];
        var param = "configId="+configId;
        $.post("/service/deleteConfigInfo",param,function (data) {
            if('false' == data['result']) {
                alert(data['message']);
                return;
            }
            //删除行数据
            $("#tab-id_config").bootstrapTable('remove',{
                field:'configId',
                values:[configId]
            });
            alert('删除成功！');
        },"json");
    });

    //导出
    $("#id-btn_exportConfigInfo").click(function () {
        var param = $("#id-form_cond").serialize();
        /*$.post("/service/exportConfigInfo",param,function (data) {
            if('false' == data['result']) {
                alert(data['message']);
                return;
            }
        },"json");*/
        var url = '/service/exportConfigInfo?'+param;
        window.open(url);
    });


});



//表格行的单击事件
$("#tab-id_config").on('click-row.bs.table', function(e,row, element) {
    $("#d_configId").html(getVal(row,"configId"));
    $("#d_dmpId").html(getVal(row,"dmpId"));
    $("#d_fileName").html(getVal(row,"fileName"));
    $("#d_createDate").html(getVal(row,"createDate"));
    $("#d_dmpDate").html(getVal(row,"dmpDate"));
    $("#d_configContext").html(getVal(row,"configContext"));
    $("#d_configDescription").html(getVal(row,"configDescription"));
    $("#d_submitter").html(getVal(row,"submitter"));
    $("#id_dia-showConfigInfo").modal('show');
});

function getVal(row,key) {
    var value = row[key];
    if(typeof(value) == "undefined" || "" == value) {
        return "-";
    }else{
        return value;
    }
}

function showConfigInfoDia(operType) {
    $("#id_configDialog").modal('show');
}

function addConfig() {
    var param = $("#form-id_configInfo").serialize();
    $.post("/service/saveConfigInfo",param,function (data) {
        if('false' == data['result']) {
            alert(data['message']);
            return;
        }
        $('#id_configDialog').modal('hide');
        //追加数据
        appendData($("#tab-id_config"),data);
    },"json");
}

function queryConfigInfo() {
    var param = $("#id-form_cond").serialize();
    $.post("/service/queryConfigInfo",param,function (data) {
        for(var i = 0; i < data.length; i++) {
            data[i]['configContext'] = replace(data[i]['configContext']);
        }
        loadData($("#tab-id_config"),data);
    },"json");
}

function replace(str) {
    var re1 = new RegExp("<","g");
    var re2 = new RegExp(">","g");
    var newStr = str.replace(re1, "&lt;");
    newStr = newStr.replace(re2, "&gt;");
    return '<pre>'+newStr+'</pre>';
}

function editConfig() {
    $("#id_configDialog").modal('show');
}




