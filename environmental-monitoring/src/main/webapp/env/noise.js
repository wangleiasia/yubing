/**
 * Created by wanglei on 2017/12/19.
 */

function submit() {

    //关键值不能为空
    var prjNumCode = $("#项目编号").val();
    if(typeof(prjNumCode) == 'undefined' || '' == prjNumCode) {
        alert("项目编号不能为空");
        return;
    }
    var pointNumCode = $("#点位编号").val();
    if(typeof(pointNumCode) == 'undefined' || '' == pointNumCode) {
        alert("点位编号不能为空");
        return;
    }
    var taskNum = $("#任务单号").val();
    if(typeof(taskNum) == 'undefined' || '' == taskNum) {
        alert("任务单号不能为空");
        return;
    }

    var param = $("#form-id_noise").serialize();
    $.post("/service/修改监测点",param,function (data) {
        if('true' == data['result']) {
            alert("监测点修改成功");
            $("#form-id_noise").formClear();
        }else {
            alert("提交失败："+data['message']);
        }
    },"json");
    
}

/**
 * 根据项目编号和点位信息，查询监测点信息
 */
function queryMonitorPoint() {
    var prjNumCode = $("#q_项目编号").val();
    if(typeof(prjNumCode) == 'undefined' || '' == prjNumCode) {
        alert("请输入项目编号");
        return;
    }
    var pointNumCode = $("#q_点位编号").val();
    if(typeof(pointNumCode) == 'undefined' || '' == pointNumCode) {
        alert("请输入点位编号");
        return;
    }

    var param = $("#form-id_query_cond").serialize();
    $.post("/service/监测点查询",param,function (data) {
        if('false' == data['result']) {
            alert(data['message']);
            return;
        }
        data[0].Ld = data[0]['ld'];
        data[0].Ln = data[0]['ln'];
        data[0].Ldn = data[0]['ldn'];
        //form表单初始化
        $("#form-id_noise").formInfoFilled(data[0]);
    },"json");
}


