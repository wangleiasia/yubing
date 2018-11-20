/**
 * Created by wanglei on 2017/12/13.
 */

function showContent(id,name,uri,closable) {
    if('/sonar/importillegalcodeinfo.html' == uri) {
        //校验是否有权限导入
        $.post("/service/checkImportEntity",'',function (data) {
            if('false' == data['result']) {
                alert(data['message']);
                return;
            }else{
                add(id,name,uri,closable);
            }
        },"json");
    }else{
        add(id,name,uri,closable);
    }
}

function add(id,name,uri,closable){
    var item = {'id':id,'name':name,'url':uri,'closable':closable};
    closableTab.addTab(item);
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







