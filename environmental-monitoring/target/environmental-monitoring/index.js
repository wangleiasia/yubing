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

    //浏览器高度
    var height = $(document).height();
    var workHeight = height-50-5-27;
    $("#work").height(workHeight);

});







