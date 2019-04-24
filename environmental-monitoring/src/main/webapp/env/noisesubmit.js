/**
 * Created by wanglei on 2017/12/16.
 */

var pointInfo;
$(document).ready(function () {
    //初始化页面信息
    $.post("/service/pointManage/noisePageInit",'',function (data) {
        var prjArray = [];
        var pointArray = [];
        var sampleArray = [];
        if('false' == data['result']) {
            $("#项目编号").selectLoad(prjArray);
            $("#点位编号").selectLoad(pointArray);
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
        pointInfo = data['点位信息'];
        $("#点位编号").selectLoad(pointArray);
        $("#样品编号").selectLoad(sampleArray);
    },"json");

    //初始化方法代码
    $.post("/service/methodCode/queryMethodCodes",'',function (data) {
        var methodCodeArray = [];
        if('false' == data['result']) {
            $("#方法代码").selectLoad(methodCodeArray);
            return;
        }
        //加载数据
        for(var i = 0; i < data.length; i++) {
            var item ={
                value:'['+data[i]['方法代码']+']'+data[i]['检测方法'],
                desc:data[i]['方法代码']
            };
            methodCodeArray.push(item);
        }
        $("#方法代码").selectLoad(methodCodeArray);
    },"json");

    //初始化设备信息
    $.post("/service/pointManage/queryEquipmentForNoise",'',function (data) {
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
        $("#设备编号").selectLoad(equipmentArray);
    },"json");
});

/**
 * 项目编号修改时，修改点位信息
 */
function showPointInfo() {
    var pointArray = [];
    var prjNumCode = $("#项目编号").val();
    if(typeof(prjNumCode) == 'undefined' || '' == prjNumCode || '-1' == prjNumCode) {
        $("#点位编号").selectLoad(pointArray);
        return;
    }
    var pointList = pointInfo[prjNumCode];
    for(var i = 0; i < pointList.length; i++) {
        var item ={
            value:pointList[i],
            desc:pointList[i]
        };
        pointArray.push(item);
    }
    $("#点位编号").selectLoad(pointArray);

    //初始化样品编号
    initSampleCode();
}

function submit() {
    var prjNumCode = $("#项目编号").val();
    if(typeof(prjNumCode) == 'undefined' || '' == prjNumCode || '-1' == prjNumCode) {
        alert("请选择项目编号");
        return;
    }
    var pointNumCode = $("#点位编号").val();
    if(typeof(pointNumCode) == 'undefined' || '' == pointNumCode || '-1' == pointNumCode) {
        alert("请选择点位编号");
        return;
    }
    var methodCode = $("#方法代码").val();
    if(typeof(methodCode) == 'undefined' || '' == methodCode || '-1' == methodCode) {
        alert("请选择方法代码");
        return;
    }

    var param = $("#form-id_noisesubmit").serialize();
    $.post("/service/保存现场噪声监测记录",param,function (data) {
        if('true' == data['result']) {
            alert("保存现场噪声监测记录成功");
            $("#form-id_noisesubmit").formClear();
        }else {
            alert("提交失败："+data['message']);
        }
    },"json");
}

$(document).ready(function () {
   //初始化表单信息
    var now = new Date();
    var sMonth;
    var month = now.getMonth()+1;
    if(month < 10) {
        sMonth = '0'+month;
    }else{
        sMonth = month+'';
    }
    $("#月").val(sMonth);
    $("#日").val(now.getDate());
    $("#时").val(now.getHours());
    $("#分").val(now.getMinutes());

    //初始化时间段
});

//根据项目编号、点位编号查询样品编号
function initSampleCode() {
    var sampleCodeArray = [];
    var prjNumCode = $("#项目编号").val();
    if(typeof(prjNumCode) == 'undefined' || '' == prjNumCode || '-1' == prjNumCode) {
        $("#样品编号").selectLoad(sampleCodeArray);
        return;
    }
    var pointNumCode = $("#点位编号").val();
    if(typeof(pointNumCode) == 'undefined' || '' == pointNumCode || '-1' == pointNumCode) {
        $("#样品编号").selectLoad(sampleCodeArray);
        return;
    }
    var param = '项目编号='+prjNumCode+'&点位编号='+pointNumCode;

    $.post("/service/样品查询",param,function (data) {
        if('false' == data['result']) {
            return;
        }
        for(var i = 0; i < data.length; i++) {
            var d = '['+data[i]['样品编号']+']['+data[i]['样品类别']+'&'+data[i]['分类']+']';
            var item ={
                value:data[i]['样品编号'],
                desc:d
            };
            sampleCodeArray.push(item);
        }
        $("#样品编号").selectLoad(sampleCodeArray);
    },"json");
}


