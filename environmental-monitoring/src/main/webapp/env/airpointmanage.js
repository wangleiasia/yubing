/**
 * Created by wanglei on 2018/1/14.
 */

var pointInfo;
$(document).ready(function () {
    //初始化页面信息
    $.post("/service/pointManage/airPointManagePageInit",'',function (data) {
        var prjArray = [];
        var pointArray = [];
        if('false' == data['result']) {
            $("#q_项目编号").selectLoad(prjArray);
            $("#q_点位编号").selectLoad(pointArray);
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
        $("#q_项目编号").selectLoad(prjArray);
        pointInfo = data['点位信息'];
        $("#q_点位编号").selectLoad(pointArray);
    },"json");

    //初始化设备信息
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
        $("#设备编号").selectLoad(equipmentArray);
    },"json");

    //初始化用户名
    $(document).ready(function () {
        //初始化用户名
        $.post("/service/getLoginNameExt",'',function (data) {
            if ('true' == data['result']) {
                $("#信息上传").val(data['message']);
            } else {
                alert(data['message']);
            }
        },"json");

    });

});

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
 * 项目编号修改时，修改点位信息
 */
function showPointInfo() {
    var pointArray = [];
    var prjNumCode = $("#q_项目编号").val();
    if(typeof(prjNumCode) == 'undefined' || '' == prjNumCode || '-1' == prjNumCode) {
        $("#q_点位编号").selectLoad(pointArray);
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
    $("#q_点位编号").selectLoad(pointArray);
}

/**
 * 根据项目编号和点位信息，查询监测点信息
 */
function queryMonitorPoint() {
    var prjNumCode = $("#q_项目编号").val();
    if(typeof(prjNumCode) == 'undefined' || '' == prjNumCode || '-1' == prjNumCode) {
        alert("请选择项目编号");
        return;
    }
    var pointNumCode = $("#q_点位编号").val();
    if(typeof(pointNumCode) == 'undefined' || '' == pointNumCode || '-1' == pointNumCode) {
        alert("请选择点位编号");
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

function getLocation() {
    if (navigator.geolocation) {
        navigator.geolocation.getCurrentPosition(function (position) {
            var coords = position.coords;
            // 纬度[N]
            var v = coords.latitude;
            // 经度[E]
            var s = coords.longitude
            //alert(changeToDFM(v,'N') + '---' + changeToDFM(s,'E'));
            $("#坐标").val(changeToDFM(v,'N') + ' ' + changeToDFM(s,'E'));
        }, function (error) {
            switch(error.code) {
                case error.TIMEOUT:
                    showError("A timeout occured! Please try again!");
                    break;
                case error.POSITION_UNAVAILABLE:
                    showError('We can\'t detect your location. Sorry!');
                    break;
                case error.PERMISSION_DENIED:
                    showError('Please allow geolocation access for this to work.');
                    break;
                case error.UNKNOWN_ERROR:
                    showError('An unknown error occured!');
                    break;
            }
        }, {
            // 指示浏览器获取高精度的位置，默认为false
            enableHighAcuracy: true,
            // 指定获取地理位置的超时时间，默认不限时，单位为毫秒
            timeout: 5000,
            // 最长有效期，在重复获取地理位置时，此参数指定多久再次获取位置。
            maximumAge: 3000
        });
    } else {
        alert("Your browser does not support Geolocation!");
    }
}

function showError(info) {
    alert(info);
}

function changeToDFM(du,item){
    var duL = parseInt(du/1);
    var fen,miao;

    var temp = du % 1;
    temp = temp *60;
    fen = parseInt(temp/1);
    temp = (temp % 1) * 60;
    miao = parseInt(temp/1);
    temp = (temp % 1) * 60;
    var miaoE = parseInt(temp/1);

    miao = miao+"."+miaoE;

    return item+duL+"°"+fen+"'"+miao+"\"";
}



