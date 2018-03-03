/**
 * Created by wanglei on 2017/11/21.
 */


(function ($) {

    //为下拉列表装载数据
    $.fn.selectLoad = function(data) {
        this.empty();
        var innerHtml = "<option value='-1'>--请选择--</option>";
        //var innerHtml = "";
        for (var i = 0; i < data.length; i++) {
            innerHtml += "<option value='"+data[i]['value']+"'>"+data[i]['desc']+"</option>";
        }
        this.append(innerHtml);
    };

})(jQuery);






