/**
 * Created by wanglei on 2017/12/25.
 */


function createLoading() {
    var dialog = new BootstrapDialog({
        title:"提示信息",
        closable:false,
        message: $('<div></div>').load('/frame/loading.html')
    });
    return dialog;
}
