
$(document).ready(function () {

});

//定时器
var timmer;
//是否正在抽奖
var isStart = false;
//员工-json
var jsonEmplouees = [];

var ch1 = 0;

function start() {
	if(isStart) {
		return;
	}
	if(typeof(jsonEmplouees) == 'undefined' || jsonEmplouees.length < 1) {
		return;
	}
	isStart = true;
	timmer = setInterval("show()",50);
}

function stop() {
	isStart = false;
	window.clearInterval(timmer);

	remove();
}

function remove() {
	var temp = [];
	var index=0;
	for(var i=0; i<jsonEmplouees.length; i++) {
		if(ch1 == i) {
			continue;
		}else{
			temp[index]=jsonEmplouees[i];
			index++;
			continue;
		}
	}
	jsonEmplouees=temp;
}

function show() {
	if(typeof(jsonEmplouees) == 'undefined') {
		return;
	}
	var x = jsonEmplouees.length -1;
	var y = 0;
	var rand = parseInt(Math.random() * (x - y + 1) + y);

	var showContent = jsonEmplouees[rand].operName+"&nbsp;|&nbsp;"+jsonEmplouees[rand].operCode;
	$("#operCode").html(showContent);
	ch1 = rand;
}

function file() {
	if(isStart) {
		alert("请先停止抽奖！");
		return;
	}
	$("#files").click();
}

/**
导入数据
**/
function importData(){
    var selectedFile = document.getElementById("files").files[0];//获取读取的File对象
    var name = selectedFile.name;//读取选中文件的文件名
    var size = selectedFile.size;//读取选中文件的大小
    console.log("文件名:"+name+"大小："+size);

    var reader = new FileReader();//这里是核心！！！读取操作就是由它完成的。
    reader.readAsText(selectedFile,"gb2312");//读取文件的内容

    reader.onload = function(e){
		console.log(this.result);//当读取完成之后会回调这个函数，然后此时文件的内容存储到了result中。直接操作即可。
		var lines = this.result.split("\n");
		toJson(lines);
    };
}

/**
将数组转换为json格式
阿毛|12701|1|Y
**/
function toJson(arrayEmployees) {
	if(typeof(arrayEmployees) == 'undefined' || arrayEmployees.length < 1) {
		return;
	}
	for (var i=0; i<arrayEmployees.length; i++) {
		var line = arrayEmployees[i];
		var files = line.split("|");
		var item = {
			operName:files[0],
			operCode:files[1],
			state:files[2],
			isLottery:files[3]
		};
		jsonEmplouees.push(item);
	}
}

function test() {
	alert(jsonEmplouees.length);
}


