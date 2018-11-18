/**
 * Created by wanglei on 2017/12/13.
 */

function showContent(url) {
    if('/sonar/importillegalcodeinfo.html' == url) {
        //校验是否有权限导入
        $.post("/service/checkImportEntity",'',function (data) {
            if('false' == data['result']) {
                alert(data['message']);
                return;
            }else{
                $("#work").load(url);
            }
        },"json");
    }else{
        $("#work").load(url);
    }
}

$(document).ready(function () {
    //初始化用户名
    $.post("/service/getLoginName",'',function (data) {
        if ('true' == data['result']) {
            $("#loginName").text(data['message']);
        } else {
            alert(data['message']);
        }
    },"json");
});







