/**
 * Created by wanglei on 2017/12/19.
 */

$(document).ready(function () {
    //定义表格的列
    var columns = [
        {'field': '点位编号', 'title': '点位编号'},
        {'field': '样品编号', 'title': '样品编号'},
        {'field': '分类', 'title': '分类'},
        {'field': '样品类别', 'title': '样品类别'},
        {'field': '时间段', 'title': '时间段'},
        {'field': '检测类别', 'title': '检测类别'},
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
        {'field': '序号', 'title': '序号'},
        {'field': '次序', 'title': '次序'},
        {'field': '项目名称', 'title': '项目名称'},
        {'field': '检测结果', 'title': '检测结果'},
        {'field': '方法代码', 'title': '方法代码'},
        {'field': '对应项目', 'title': '对应项目'},
        {'field': '单位', 'title': '单位'},
        {'field': '仪器编号', 'title': '仪器编号'}
    ];
    //生成表格对象并初始化
    new RadioTableObject('tab-id_boilerInfo', boilerInfoColumns).Init();
    //隐藏锅炉数据区域
    $("#div-id-table_boilerInfo").hide();

    //用户项目编号下拉列表展示
    $.post("/service/queryUserPointMangage",'',function (data) {
        if('false' == data['result']) {
            return;
        }
        //加载数据
        var topMenuArray = [];
        for(var i = 0; i < data.length; i++) {
            var item ={
                value:data[i]['项目编号'],
                desc:data[i]['项目编号']
            };
            topMenuArray.push(item);
        }
        $("#项目编号").selectLoad(topMenuArray);
    },"json");
});

//根据项目编码查询点位信息-大气样品查询
function queryPointByPrjCode() {
    //隐藏文件上传区域
    $("#div-id_fileInput").hide();
    var prjNumCode = $("#项目编号").val();
    if(typeof(prjNumCode) == 'undefined' || '' == prjNumCode || null == prjNumCode) {
        alert("请输入项目编号");
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
        //加载数据
        loadData($("#tab-id_pointInfo"),data);
    },"json");
}

//表格行的单击事件
$("#tab-id_pointInfo").on('click-row.bs.table', function(e,row, element) {
    // console.log(e);
    // console.log(row);
    // console.log(element);
    //如果当前选择记录已经被上传，则不允许在上传
    var isHavedUpload = row["勾选"];
    if(typeof isHavedUpload != undefined && 'Y' == isHavedUpload) {
        alert("当前检测点已上传！");
        $("#div-id_fileInput").hide();
        //当前行不选择
        $('#tab-id_pointInfo').bootstrapTable('uncheck',element.data('index'));
        return;
    }
    //显示文件上传区域
    $("#div-id_fileInput").show();
});
//回调函数，用于文件上传时获取额外的参数
uploadExtendParam = function () {
    //将点位信息回传
    var selectRows = $('#tab-id_pointInfo').bootstrapTable('getSelections');
    var obj = selectRows[0];
    obj.项目编号 = $("#项目编号").val();
    return selectRows[0];
};
//回调函数：文件上产成功后
$('#file-0').on('fileuploaded', function(event, data, previewId, index) {
    var selectRows = $('#tab-id_pointInfo').bootstrapTable('getSelections');
    var obj = selectRows[0];
    obj.项目编号 = $("#项目编号").val();

    var param = "项目编号="+obj.项目编号;
    param = "点位编号="+obj.点位编号;
    param = "样品编号="+obj.样品编号;
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

//工况回传
function operatingModeSubmit() {
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



