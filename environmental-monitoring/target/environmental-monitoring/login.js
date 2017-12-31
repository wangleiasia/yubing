/**
 * Created by wanglei on 2017/12/14.
 */

$(document).ready(function () {
    //浏览器高度
    var height = $(document).height();
    var workHeight = height-67;
    $("#work").height(workHeight);
});

function login() {
    //必须输入用户名
    var userName = $("#userName").val();
    if(typeof userName == undefined || '' == userName) {
        alert("请输入用户名");
        return;
    }
    var loginParam = $("#form-id_login").serialize();
    // var dialog = createLoading();
    // dialog.open();
    $.post("/service/login",loginParam,function (data) {
        // dialog.close();
        if ('true' == data['result']) {
            window.open("/index.html","_self");
        } else {
            alert(data['message']);
        }
    },"json");
}



