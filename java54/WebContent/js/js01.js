function call1() {
	var x = prompt("숫자를 입력하세요.");
	var x2 = parseInt(x);
	var result1 = addNum(x2);
	alert(result1);
	
	var a = document.getElementById("a");
	a.innerHTML = result1;
	alert(a.innerHTML);
//	var test = a.innerHTML;

var num1 = document.getElementById("num1");
	num1.value = result1;
//	var test2 = num1.value;

}
function call2() {
	var x = prompt("숫자1를 입력하세요.");
	var y = prompt("숫자2를 입력하세요.");
	var x2 = parseInt(x);
	var y2 = parseInt(y);
	
	var result2 = addNum2(x2, y2);
	alert(result2);
	var b = document.getElementById("b");
	b.innerHTML = result2;
	var num2 = document.getElementById("num2");
	num2.value = result2;
}
function send() {
	var form = document.getElementById("form");
	var num1v = document.getElementById("num1").value;
	var num2v = document.getElementById("num2").value;
	form.action = "jsp02.jsp?num1=" + num1v +"&num2=" + num2v;
	form.submit();
}

function addNum(x) {
	return x + 100;
}
function addNum2(x, y) {
	return x + 100 + y;
}