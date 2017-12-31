/**
 * Created by wanglei on 2017/12/16.
 */

function submit() {

    var prjNumCode = $("#项目编号").val();
    if(typeof(prjNumCode) == 'undefined' || '' == prjNumCode) {
        alert("请输入项目编号");
        return;
    }
    var pointNumCode = $("#点位编号").val();
    if(typeof(pointNumCode) == 'undefined' || '' == pointNumCode) {
        alert("请输入点位编号");
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
    $("#月").val(now.getMonth());
    $("#日").val(now.getDate());
    $("#时").val(now.getHours());
    $("#分").val(now.getMinutes());

    //初始化时间段
});


