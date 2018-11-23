(function( factory ) {
	if ( typeof define === "function" && define.amd ) {
		define( ["jquery", "../jquery.validate"], factory );
	} else if (typeof module === "object" && module.exports) {
		module.exports = factory( require( "jquery" ) );
	} else {
		factory( jQuery );
	}
}(function( $ ) {

/*
 * Translated default messages for the jQuery validation plugin.
 * Locale: ZH (Chinese, 中文 (Zhōngwén), 汉语, 漢語)
 */
$.extend( $.validator.messages, {
	required: "<font size='1' color='red'>这是必填字段</font>",
	remote: "<font size='1' color='red'>请修正此字段</font>",
	email: "<font size='1' color='red'>请输入有效的电子邮件地址</font>",
	url: "<font size='1' color='red'>请输入有效的网址</font>",
	date: "<font size='1' color='red'>请输入有效的日期</font>",
	dateISO: "<font size='1' color='red'>请输入有效的日期 (YYYY-MM-DD)</font>",
	number: "<font size='1' color='red'>请输入有效的数字</font>",
	digits: "<font size='1' color='red'>只能输入数字</font>",
	creditcard: "<font size='1' color='red'>请输入有效的信用卡号码</font>",
	equalTo: "<font size='1' color='red'>你的输入不相同</font>",
	extension: "<font size='1' color='red'>请输入有效的后缀</font>",
	maxlength: $.validator.format( "最多可以输入 {0} 个字符" ),
	minlength: $.validator.format( "最少要输入 {0} 个字符" ),
	rangelength: $.validator.format( "请输入长度在 {0} 到 {1} 之间的字符串" ),
	range: $.validator.format( "请输入范围在 {0} 到 {1} 之间的数值" ),
	max: $.validator.format( "请输入不大于 {0} 的数值" ),
	min: $.validator.format( "请输入不小于 {0} 的数值" )
} );
return $;
}));