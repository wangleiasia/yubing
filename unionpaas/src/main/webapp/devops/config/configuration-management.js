/**
 * Created by wanglei on 2018/11/19.
 */

$(document).ready(function () {
    var columns = [
        {'field': 'dmpId', 'title': 'DMP单号'},
        {'field': 'emmploy', 'title': '提交人员'},
        {'field': 'configName', 'title': '配置文件'},
        {'field': 'submitTime', 'title': '提交时间'},
        {'field': 'operType', 'title': '操作类型'},
        {'field': 'context', 'title': '修改内容'}
    ];
    //生成表格对象并初始化
    new RadioTableObject('tab-id_config', columns).Init();

    //测试数据
    var data = [
        {"dmpId":"wewewee","emmploy":"wewewee","configName":"wewewee","submitTime":"wewewee","operType":"新增","context":"wewewee"},
        {"dmpId":"wewewee","emmploy":"wewewee","configName":"wewewee","submitTime":"wewewee","operType":"新增","context":"wewewee"},
        {"dmpId":"wewewee","emmploy":"wewewee","configName":"wewewee","submitTime":"wewewee","operType":"新增","context":"wewewee"},
        {"dmpId":"wewewee","emmploy":"wewewee","configName":"wewewee","submitTime":"wewewee","operType":"新增","context":"wewewee"},
        {"dmpId":"wewewee","emmploy":"wewewee","configName":"wewewee","submitTime":"wewewee","operType":"新增","context":"wewewee"},
        {"dmpId":"wewewee","emmploy":"wewewee","configName":"wewewee","submitTime":"wewewee","operType":"新增","context":"wewewee"},
        {"dmpId":"wewewee","emmploy":"wewewee","configName":"wewewee","submitTime":"wewewee","operType":"新增","context":"wewewee"},
        {"dmpId":"wewewee","emmploy":"wewewee","configName":"wewewee","submitTime":"wewewee","operType":"新增","context":"wewewee"},
        {"dmpId":"wewewee","emmploy":"wewewee","configName":"wewewee","submitTime":"wewewee","operType":"新增","context":"wewewee"},
        {"dmpId":"wewewee","emmploy":"wewewee","configName":"wewewee","submitTime":"wewewee","operType":"新增","context":"wewewee"},
        {"dmpId":"wewewee","emmploy":"wewewee","configName":"wewewee","submitTime":"wewewee","operType":"新增","context":"wewewee"},
        {"dmpId":"wewewee","emmploy":"wewewee","configName":"wewewee","submitTime":"wewewee","operType":"新增","context":"wewewee"},
        {"dmpId":"wewewee","emmploy":"wewewee","configName":"wewewee","submitTime":"wewewee","operType":"新增","context":"wewewee"},
        {"dmpId":"wewewee","emmploy":"wewewee","configName":"wewewee","submitTime":"wewewee","operType":"新增","context":"wewewee"},
        {"dmpId":"wewewee","emmploy":"wewewee","configName":"wewewee","submitTime":"wewewee","operType":"新增","context":"wewewee"},
        {"dmpId":"wewewee","emmploy":"wewewee","configName":"wewewee","submitTime":"wewewee","operType":"新增","context":"wewewee"},
        {"dmpId":"wewewee","emmploy":"wewewee","configName":"wewewee","submitTime":"wewewee","operType":"新增","context":"wewewee"},
        {"dmpId":"wewewee","emmploy":"wewewee","configName":"wewewee","submitTime":"wewewee","operType":"新增","context":"wewewee"},
        {"dmpId":"wewewee","emmploy":"wewewee","configName":"wewewee","submitTime":"wewewee","operType":"新增","context":"wewewee"},
        {"dmpId":"wewewee","emmploy":"wewewee","configName":"wewewee","submitTime":"wewewee","operType":"新增","context":"wewewee"},
        {"dmpId":"wewewee","emmploy":"wewewee","configName":"wewewee","submitTime":"wewewee","operType":"新增","context":"wewewee"},
        {"dmpId":"wewewee","emmploy":"wewewee","configName":"wewewee","submitTime":"wewewee","operType":"新增","context":"wewewee"},
        {"dmpId":"wewewee","emmploy":"wewewee","configName":"wewewee","submitTime":"wewewee","operType":"新增","context":"wewewee"},
        {"dmpId":"wewewee","emmploy":"wewewee","configName":"wewewee","submitTime":"wewewee","operType":"新增","context":"wewewee"}
        ];
    loadData($("#tab-id_config"),data);

    //初始化日历组件
    $(function () {
        $('#datetimepicker-beginDate').datetimepicker({
            locale: 'zh-cn',
            format: 'YYYY-MM-DD HH:mm:ss',
            dayViewHeaderFormat: 'YYYY MMMM',
            sideBySide: true
        });
        $('#datetimepicker-endDate').datetimepicker({
            locale: 'zh-cn',
            format: 'YYYY-MM-DD HH:mm:ss',
            dayViewHeaderFormat: 'YYYY MMMM',
            sideBySide: true
        });
    });
});

function addConfig() {
    $("#id_configDialog").modal('show');
}

function editConfig() {
    $("#id_configDialog").modal('show');
}



