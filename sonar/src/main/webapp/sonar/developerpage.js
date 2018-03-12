/**
 * Created by wanglei on 2018/3/1.
 */

var codeRowIndex;
var developerRowIndex;

$(document).ready(function () {
    var columns = [
        {'field': 'developer', 'title': '开发人员'},
        {'field': 'blocker', 'title': '阻断违规数量'},
        {'field': 'critical', 'title': '严重违规数量'},
        {'field': 'major', 'title': '主要违规数量'},
        {'field': 'minor', 'title': '次要违规数量'},
        {'field': 'info', 'title': '提示违规数量'},
        {'field': 'hasModify', 'title': '已修改'},
        {'field': 'surplus', 'title': '剩余修改'},
        {'field': 'createDate', 'title': '导入时间'},
        {'field': 'batchNumber', 'title': '批次编号'}
    ];
    //生成表格对象并初始化
    new RadioTableObject('tab-id_dev_ill', columns).Init();

    //初始化下拉列表信息
    $.post("/service/initSelect",'',function (data) {
        var batchInfoArray = [];
        var developerArray = [];
        //加载数据
        var batchInfos = data['BatchInfo'];
        if(null == batchInfos) {
            $("#batchInfo").selectLoad(batchInfoArray);
        }else{
            for(var i = 0; i < batchInfos.length; i++) {
                var item ={
                    value:batchInfos[i]['batchNumber'],
                    desc:batchInfos[i]['createDate']
                };
                batchInfoArray.push(item);
            }
            $("#batchInfo").selectLoad(batchInfoArray);
        }
        var developers = data['developers'];
        if(null == developers) {
            $("#developer").selectLoad(developerArray);
        }else{
            for(var i = 0; i < developers.length; i++) {
                var item ={
                    value:developers[i]['developer'],
                    desc:developers[i]['developer']
                };
                developerArray.push(item);
            }
            $("#developer").selectLoad(developerArray);
        }

    },"json");

    var codeColumns = [
        {'field': 'illegalId', 'title': 'ID'},
        {'field': 'developer', 'title': '提交人'},
        {'field': 'modular', 'title': '模块名称'},
        {'field': 'codeUrl', 'title': '代码路径'},
        {'field': 'codeLine', 'title': '代码行'},
        {'field': 'illegalLevel', 'title': '违规等级'},
        {'field': 'batchNumber', 'title': '批次号'},
        {'field': 'modifyState', 'title': '是否修改'},
        {'field': 'bugSerial', 'title': '处理单号'},
        {'field': 'revisingSuggestions1', 'title': '修改建议','visible':false},
        {'field': 'remark', 'title': '备注','visible':true}
    ];
    //生成表格对象并初始化
    new RadioTableObject('tab-id_ill_code', codeColumns).Init();

    /**
    $('#form-id_bugSerial').bootstrapValidator({
        message: 'This value is not valid',
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            bugSerial: {
                validators: {
                    notEmpty: {
                        message: '处理单号不能为空'
                    }
                }
            }
        }
    });
     **/

});

function search() {
    var batchNumber = $("#batchInfo").val();
    if(typeof(batchNumber) == 'undefined' || '-1' == batchNumber || null == batchNumber) {
        alert("请选择批次编号");
        return;
    }
    var developer = $("#developer").val();
    if(typeof(developer) == 'undefined' || '-1' == developer || null == developer) {
        developer='-1';
    }
    var param = 'batchNumber='+batchNumber;
    param += '&developer='+developer;
    $.post("/service/queryDeveloperIllegalInfos",param,function (data) {
        if('false' == data['result']) {
            alert(data['message']);
            return;
        }
        //加载数据
        loadData($("#tab-id_dev_ill"),data);
    },"json");
}

/**
 * 表格行的单击事件
 */
$("#tab-id_dev_ill").on('click-row.bs.table', function(e,row, element) {
    // console.log(e);
    // console.log(row);
    // console.log(element);

    developerRowIndex = element.data('index');
    var batchNumber = row["batchNumber"];
    var developer = row["developer"];
    //查询违规代码列表信息
    var param = 'batchNumber='+batchNumber;
    param += '&developer='+developer;
    $.post("/service/queryIllegalCodeInfos",param,function (data) {
        if('false' == data['result']) {
            alert(data['message']);
            return;
        }
        //加载数据
        loadData($("#tab-id_ill_code"),data);
    },"json");
});

$("#tab-id_ill_code").on('click-row.bs.table', function(e,row, element) {
    codeRowIndex = element.data('index');
    $("#d_illegalId").html(row["illegalId"]);
    $("#d_developer").html(row["developer"]);
    $("#d_modular").html(row["modular"]);
    $("#d_codeUrl").html(row["codeUrl"]);
    $("#d_codeLine").html(row["codeLine"]);
    $("#d_illegalLevel").html(row["illegalLevel"]);
    $("#d_batchNumber").html(row["batchNumber"]);
    $("#d_revisingSuggestions").html(row["revisingSuggestions1"]);
    $("#bugSerial").val(row["bugSerial"]);
    $("#remark").val(row["remark"]);
    $("#myModal").modal('show');
});

function commitBugSerial() {
    var illegalId = $("#d_illegalId").html();
    var bugSerial = $("#bugSerial").val();
    var remark = $("#remark").val();
    var modifyState = $("#modifyState").val();

    if(typeof(bugSerial) == 'undefined' || '' == bugSerial || null == bugSerial) {
        bugSerial='';
    }

    var param = $("#form-id_bugSerial").serialize();
    param += '&illegalId='+illegalId;
    $.post("/service/commitBugSerial",param,function (data) {
        alert("提交成功！");
        $('#myModal').modal('hide');

        //更新
        var developerCodeInfo = data['DeveloperIllegalInfo'];
        if(typeof(developerCodeInfo) == 'undefined' || null == bugSerial) {
            return;
        }
        var rows = {
            index : developerRowIndex,  //更新列所在行的索引
            field : "hasModify", //要更新列的field
            value : developerCodeInfo['hasModify'] //要更新列的数据
        }//更新表格数据
        $('#tab-id_dev_ill').bootstrapTable("updateCell",rows);
        var rows = {
            index : developerRowIndex,  //更新列所在行的索引
            field : "surplus", //要更新列的field
            value : developerCodeInfo['surplus'] //要更新列的数据
        }//更新表格数据
        $('#tab-id_dev_ill').bootstrapTable("updateCell",rows);

    },"json");

    var rows = {
        index : codeRowIndex,  //更新列所在行的索引
        field : "bugSerial", //要更新列的field
        value : bugSerial //要更新列的数据
    }//更新表格数据
    $('#tab-id_ill_code').bootstrapTable("updateCell",rows);
    var rows = {
        index : codeRowIndex,  //更新列所在行的索引
        field : "remark", //要更新列的field
        value : remark //要更新列的数据
    }//更新表格数据
    $('#tab-id_ill_code').bootstrapTable("updateCell",rows);
    //modifyState
    var rows = {
        index : codeRowIndex,  //更新列所在行的索引
        field : "modifyState", //要更新列的field
        value : modifyState //要更新列的数据
    }//更新表格数据
    $('#tab-id_ill_code').bootstrapTable("updateCell",rows);
}

