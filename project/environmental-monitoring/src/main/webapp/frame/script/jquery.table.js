/**
 * Created by wanglei on 2017/11/18.
 *
 * 自定义插件 - table
 *
 */


(function ($) {

})(jQuery);

/**
 * 表对象定义
 *
 * columns列的定义，为json格式，[{field:title},{field:title}]
 *
 *
 * @param tableId
 * @param columns
 * @returns {Object}
 * @constructor
 *
 */
var TableObject = function(tableId,cols) {

    var colsJson = [];
    colsJson.push({'checkbox' : true});
    for (var i = 0; i < cols.length; i++) {
        colsJson.push(cols[i])
    }

    var oTableInit = new Object();
    //初始化Table
    oTableInit.Init = function() {
        //先销毁表格
        $('#'+tableId).bootstrapTable('destroy');
        $('#'+tableId).bootstrapTable({
            method : 'get', //请求方式（*），默认为get方式
            //toolbar : '#toolbar', //工具按钮用哪个容器
            dataType : "json", //返回的数据类型
            striped : true, //是否显示行间隔色
            cache : false, //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
            pagination : true, //是否显示分页（*）
            sortable : false, //是否启用排序
            sortOrder : "asc", //排序方式
            queryParams : oTableInit.queryParams,//传递参数（*）
            //sidePagination : "server", //分页方式：client客户端分页，server服务端分页（*）
            pageNumber : 1, //初始化加载第一页，默认第一页
            pageSize : 10, //每页的记录行数（*）
            pageList : [ 10, 15, 20 ], //可供选择的每页的行数（*）
            search : false, //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
            strictSearch : false, //设为true，开启精确搜索
            //showColumns : true, //是否显示所有的列
            //showRefresh : true, //是否显示刷新按钮
            minimumCountColumns : 2, //最少允许的列数
            clickToSelect : true, //是否启用点击选中行
            //height : 500, //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
            //uniqueId : "ID", //每一行的唯一标识，一般为主键列
            showToggle : false, //是否显示详细视图和列表视图的切换按钮
            cardView : false, //是否显示详细视图
            detailView : false, //是否显示父子表
            columns : colsJson
        });
    };

    //得到查询的参数
    oTableInit.queryParams = function(params) {
        var temp = { //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
            limit : params.limit, //页面大小
            offset : params.offset, //页码
        };
        return temp;
    };
    return oTableInit;
};

var RadioTableObject = function(tableId,cols) {

    var colsJson = [];
    colsJson.push({'radio' : true});
    for (var i = 0; i < cols.length; i++) {
        colsJson.push(cols[i])
    }

    var oTableInit = new Object();
    //初始化Table
    oTableInit.Init = function() {
        //先销毁表格
        $('#'+tableId).bootstrapTable('destroy');
        $('#'+tableId).bootstrapTable({
            method : 'get', //请求方式（*），默认为get方式
            //toolbar : '#toolbar', //工具按钮用哪个容器
            dataType : "json", //返回的数据类型
            striped : true, //是否显示行间隔色
            cache : false, //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
            pagination : true, //是否显示分页（*）
            sortable : false, //是否启用排序
            sortOrder : "asc", //排序方式
            queryParams : oTableInit.queryParams,//传递参数（*）
            //sidePagination : "server", //分页方式：client客户端分页，server服务端分页（*）
            pageNumber : 1, //初始化加载第一页，默认第一页
            pageSize : 10, //每页的记录行数（*）
            pageList : [ 10, 15, 20 ], //可供选择的每页的行数（*）
            search : false, //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
            strictSearch : false, //设为true，开启精确搜索
            //showColumns : true, //是否显示所有的列
            //showRefresh : true, //是否显示刷新按钮
            minimumCountColumns : 2, //最少允许的列数
            clickToSelect : true, //是否启用点击选中行
            //height : 500, //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
            //uniqueId : "ID", //每一行的唯一标识，一般为主键列
            showToggle : false, //是否显示详细视图和列表视图的切换按钮
            cardView : false, //是否显示详细视图
            detailView : false, //是否显示父子表
            columns : colsJson
        });
    };

    //得到查询的参数
    oTableInit.queryParams = function(params) {
        var temp = { //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
            limit : params.limit, //页面大小
            offset : params.offset, //页码
        };
        return temp;
    };
    return oTableInit;
};

//表格加载数据
function loadData(obj,data) {
    obj.bootstrapTable('load', data);
}



