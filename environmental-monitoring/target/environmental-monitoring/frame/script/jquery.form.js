/**
 * Created by wanglei on
 *
 * 自定义表单插件
 *
 */


(function ($) {

    //用于为form表单初始化值
    $.fn.formInfoFilled = function (d) {
        //获取所有的input输入框，并且为每个输入框赋值
        var beanAttr = this.find("input");
        beanAttr.each(function(){
            //先清空
            this.value = "";
            var ex = "d."+this.name;
            var value = eval(ex);
            if(typeof(value) != 'undefined') {
                this.value=value;
            }
        });

        //获取文本域
        var beanAttr = this.find("textarea");
        beanAttr.each(function(){
            this.value = "";
            var ex = "d."+this.name;
            var value = eval(ex);
            if(typeof(value) != 'undefined') {
                this.value=value;
            }
        });
    };

    //将每个输入框设置为只读
    $.fn.formReadOnly = function() {
        var beanAttr = this.find("input");
        beanAttr.each(function(){
            $(this).attr("disabled","disabled");
        });

        var beanAttr = this.find("textarea");
        beanAttr.each(function(){
            $(this).attr("disabled","disabled");
        });
    };

    //将每个输入框设置为可编辑
    $.fn.formEdit = function() {
        var beanAttr = this.find("input");
        beanAttr.each(function(){
            $(this).removeAttr("disabled");
        });

        var beanAttr = this.find("textarea");
        beanAttr.each(function(){
            $(this).removeAttr("disabled");
        });
    };

    //将表单内容清空
    $.fn.formClear = function() {
        var beanAttr = this.find("input");
        beanAttr.each(function(){
            this.value="";
        });

        var beanAttr = this.find("textarea");
        beanAttr.each(function(){
            this.value="";
        });
    };

})(jQuery);

