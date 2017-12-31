/**
 * Created by wanglei on 2017/11/18.
 */

$(document).ready(function () {
    //定义表格的列
    var columns = [
        {'field':'funcId','title':'菜单ID'},
        {'field':'name','title':'菜单名称'},
        {'field':'parentId','title':'父菜单ID'},
        {'field':'moduleEntId','title':'菜单权限ID'},
        {'field':'funcLevel','title':'菜单层次'},
        {'field':'funSeq','title':'菜单顺序号'},
        {'field':'dllPath','title':'菜单路径'},
        {'field':'state','title':'状态'}
    ];
    //生成表格对象并初始化
    new TableObject('tab_menu_id',columns).Init();

    //加载菜单数据
    $.post("/service/queryMenu","",function (data) {
        //将查询出来的菜单数据加载到表格当中，调用公共方法loadData。第一个参数为表格的对象，第二个参数为加载的数据，是json格式，必须是[]形式
        loadData($("#tab_menu_id"),data);

        //初始化父菜单的下拉列表
        var topMenuArray = [];
        for(var i = 0; i < data.length; i++) {
            if(data[i]['parentId'] == -1) {
                var item ={
                    value:data[i]['funcId'],
                    desc:data[i]['name']
                };
                topMenuArray.push(item);
            }
        }
        $("#parentId").selectLoad(topMenuArray);
    },"json");

    //新增按钮事件
    $("#btn_work_add").click(function () {
        $("#menu-info_id").formClear();
        $("#menuModal").modal();
    });
    //删除按钮事件
    $("#btn_delete").click(function () {
        var selectRows = $('#tab_menu_id').bootstrapTable('getSelections');
        if(selectRows.length == 0) {
            alert("没有需要操作的数据！");
            return;
        }

        //确认提示
        BootstrapDialog.show({
            title: '删除确认',
            message: '确定要删除菜单吗？',
            buttons: [{
                label: '取消',
                action: function(dialog) {
                    dialog.close();
                }
            }, {
                label: '确定',
                action: function(dialog) {
                    var funcIdListInfo = "";
                    for (var i = 0; i < selectRows.length; i++) {
                        if(i > 0) {
                            funcIdListInfo += ',';
                        }
                        funcIdListInfo += selectRows[i]['funcId'];
                    }
                    $.post("/service/delMenu","funcIdList="+funcIdListInfo,function (data) {
                        dialog.close();
                        alert("删除成功！");
                    },"json");
                }
            }]
        });
    });
    //菜单下架
    $("#btn_undercarriage").click(function () {
        var selectRows = $('#tab_menu_id').bootstrapTable('getSelections');
        if(selectRows.length == 0) {
            alert("没有需要操作的数据！");
            return;
        }
        BootstrapDialog.show({
            title: '菜单下架确认',
            message: '确定要下架菜单吗？',
            buttons: [{
                label: '取消',
                action: function(dialog) {
                    dialog.close();
                }
            }, {
                label: '确定',
                action: function(dialog) {
                    var funcIdListInfo = "";
                    for (var i = 0; i < selectRows.length; i++) {
                        if(i > 0) {
                            funcIdListInfo += ',';
                        }
                        funcIdListInfo += selectRows[i]['funcId'];
                    }
                    $.post("/service/undercarriageMenu","funcIdList="+funcIdListInfo,function (data) {
                        dialog.close();
                        alert("下架成功！");
                    },"json");
                }
            }]
        });
    });
    //菜单上架
    $("#btn_oncarriage").click(function () {
        var selectRows = $('#tab_menu_id').bootstrapTable('getSelections');
        if(selectRows.length == 0) {
            alert("没有需要操作的数据！");
            return;
        }
        BootstrapDialog.show({
            title: '菜单上架确认',
            message: '确定要上架菜单吗？',
            buttons: [{
                label: '取消',
                action: function(dialog) {
                    dialog.close();
                }
            }, {
                label: '确定',
                action: function(dialog) {
                    var funcIdListInfo = "";
                    for (var i = 0; i < selectRows.length; i++) {
                        if(i > 0) {
                            funcIdListInfo += ',';
                        }
                        funcIdListInfo += selectRows[i]['funcId'];
                    }
                    $.post("/service/oncarriageMenu","funcIdList="+funcIdListInfo,function (data) {
                        dialog.close();
                        alert("上架成功！");
                    },"json");
                }
            }]
        });
    });
});

/**
 * 搜索查询
 */
function searchMenu() {
    var cond = $("#form-menu-qry_id").serialize();
    $.post("/service/searchMenu",cond,function (data) {
        loadData($("#tab_menu_id"),data);
    },"json");
}

//表格行的双击事件
$("#tab_menu_id").on('dbl-click-row.bs.table', function(e,row, element) {
    console.log(row);
    //表单控制
    $("#menu-info_id").formInfoFilled(row);

    //打开模态对话框
    $("#menuModal").modal();
});

/**
 * 提交操作
 */
function menuCommit() {
    var cond = $("#menu-info_id").serialize();
    $.post("/service/addMenu",cond,function (data) {
        //loadData($("#tab_menu_id"),data);
        alert("添加成功！");
    },"json");
}


