/**
 * Created by wanglei on 2017/12/13.
 */

function showContent(url) {
    $("#work").load(url);
}

$(document).ready(function () {
    //初始化用户名
    $.post("/service/getLoginName",'',function (data) {
        if ('true' == data['result']) {
            $("#s-id_loginName").text(data['message']);
        } else {
            alert(data['message']);
        }
    },"json");
});

function logout() {
    $("#confirmModel").modal('show');
}

function zx() {
    $("#confirmModel").modal('hide');
    window.location.href = '/service/logout';
}







