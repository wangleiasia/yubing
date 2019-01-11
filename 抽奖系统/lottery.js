
$(document).ready(function () {

});

//定时器
var timmer;
//是否正在抽奖
var isStart = false;
//员工-json
var jsonEmplouees = [];
//一次显示多少人
var showStaffNums = 0;

//设置队列
var emploueesQueues = [];
//保存队列索引
var emploueesQueuesIndex = [];

var ch1 = 0;

function start() {
	if(isStart) {
		return;
	}
	if(typeof(jsonEmplouees) == 'undefined' || jsonEmplouees.length < 1) {
		alert("抽奖名单为空");
		return;
	}
	//分组
	group();

	isStart = true;
	timmer = setInterval("show()",50);
}

function stop() {
	if(!isStart) {
		alert("您还没有开始抽奖");
	}

	isStart = false;
	window.clearInterval(timmer);

	remove();

	//合并分组
	jsonEmplouees = [];
	for (var i = 0; i < emploueesQueues.length; i++) {
		for (var j = 0; j < emploueesQueues[i].length; j++) {
			jsonEmplouees.push(emploueesQueues[i][j]);
		}
	}
}

function remove() {
	/*var temp = [];
	var index=0;
	for(var i=0; i<jsonEmplouees.length; i++) {
		if(ch1 == i) {
			console.log("中奖名单："+jsonEmplouees[i].operName+"|"+jsonEmplouees[i].operCode);
			continue;
		}else{
			temp[index]=jsonEmplouees[i];
			index++;
			continue;
		}
	}
	jsonEmplouees=temp;*/

	for (var i = 0; i < emploueesQueues.length; i++) {
		var queue = emploueesQueues[i];
		var rand = emploueesQueuesIndex[i];

		if(queue.length == 0) {
			continue;
		}

		var temp = [];
		var index=0;
		for(var qi=0; qi<queue.length; qi++) {
			if(rand == qi) {
				console.log("中奖名单："+queue[qi].operName+"|"+queue[qi].operCode);
				continue;
			}else{
				temp[index]=queue[qi];
				index++;
				continue;
			}
		}
		emploueesQueues[i] = temp;
	}

}

function show() {
	if(typeof(jsonEmplouees) == 'undefined') {
		return;
	}
	var showContent = '';
	for (var i = 0; i < emploueesQueues.length; i++) {
		var queue = emploueesQueues[i];
		if(queue.length == 0) {
			continue;
		}
		var x = queue.length -1;
		var y = 0;
		var rand = parseInt(Math.random() * (x - y + 1) + y);
		emploueesQueuesIndex[i]=rand;
		if(showStaffNums > 3) {
			if(i%2 == 1) {
				showContent += '&nbsp;&nbsp;&nbsp;&nbsp;';
			}
			if(i > 0 && i%2 == 0) {
				showContent += '</br></br>';
			}
		}else if(i > 0) {
			showContent += '</br></br>';
		}
		showContent += queue[rand].operName+"["+queue[rand].operCode+"]";
	}

	$("#operCode").html(showContent);
}

//站队
function group() {
	if(jsonEmplouees.length < 1) {
		return;
	}
	emploueesQueues = [];
	if(1 == showStaffNums) {
		emploueesQueues.push(jsonEmplouees);
		emploueesQueuesIndex[0] = 0;
		return;
	}
	for (var i = 1; i <= showStaffNums; i++) {
		emploueesQueues.push([]);
		emploueesQueuesIndex[i-1]=0;
	}
	var index = 1;
	for (var i = 0; i < jsonEmplouees.length; i++) {
		if(index > showStaffNums) {
			index = 1;
		}
		emploueesQueues[index-1].push(jsonEmplouees[i]);
		index++;
	}
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
    reader.readAsText(selectedFile,"gb2312");//读取文件的内容 gb2312

    reader.onload = function(e){
		console.log(this.result);//当读取完成之后会回调这个函数，然后此时文件的内容存储到了result中。直接操作即可。
		var lines = this.result.split("\n");
		toJson(lines);
    };
}

/**
清空数据
**/
function clearData() {
	jsonEmplouees = [];
	alert("名单清除成功");
}

/**
将数组转换为json格式
阿毛|12701|1|Y
**/
function toJson(arrayEmployees) {
	if(typeof(arrayEmployees) == 'undefined' || arrayEmployees.length < 1) {
		return;
	}
	jsonEmplouees = [];
	for (var i=0; i<arrayEmployees.length; i++) {
		var line = arrayEmployees[i];
		var files = line.split("|");
		if(files.length != 4) {
			continue;
		}
		var item = {
			operName:Trim(files[0]),
			operCode:Trim(files[1]),
			state:Trim(files[2]),
			isLottery:Trim(files[3])
		};
		jsonEmplouees.push(item);
	}
	alert("名单导入完毕，一共导入："+jsonEmplouees.length+"条");
}

function test(cnt) {
	/*showStaffNums = cnt;
	group();
	console.log("所有员工："+jsonEmplouees);
	console.log("分组队列数量："+emploueesQueues.length);
	for (var i = 0; i < emploueesQueues.length; i++) {
		console.log(i);
		console.log(emploueesQueues[i]);
	}
	
	//合并分组
	jsonEmplouees = [];
	for (var i = 0; i < emploueesQueues.length; i++) {
		for (var j = 0; j < emploueesQueues[i].length; j++) {
			jsonEmplouees.push(emploueesQueues[i][j]);
		}
	}
	console.log(jsonEmplouees);*/

	var ay = [];
	ay[0] = 1;
	ay[1] = 2;
	ay[2] = 5;
	alert(ay[2]);
}

function Trim(str){ 
  return str.replace(/(^\s*)|(\s*$)/g, ""); 
}

function showMain() {
	if(isStart) {
		alert("请先停止抽奖！");
		return;
	}
	$("#id_main").css("display","");
	$("#id_luckDraw").css("display","none");
	$("#operCode").html("");
	$("#drawLevel").html("");
}

function luckDraw(num,level) {
	$("#operCode").html("");
	$("#id_main").css("display","none");
	$("#id_luckDraw").css("display","");

	if(1 == level) {
		$("#drawLevel").html("一等奖");
	}else if(2 == level) {
		$("#drawLevel").html("二等奖");
	}else if(3 == level) {
		$("#drawLevel").html("三等奖");
	}else if(0 == level) {
		$("#drawLevel").html("特等奖");
	}

	showStaffNums = num;
}

