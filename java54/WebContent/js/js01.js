function call1() {
	var x = prompt("숫자를 입력하세요.");
	var x2 = parseInt(x);
	var result1 = addNum(x2);
	alert(result1);
}
function call2() {
	var x = prompt("숫자1를 입력하세요.");
	var y = prompt("숫자2를 입력하세요.");
	var x2 = parseInt(x);
	var y2 = parseInt(y);
	
	var result2 = addNum2(x2, y2);
	alert(result2);
}
function addNum(x) {
	return x + 100;
}
function addNum2(x, y) {
	return x + 100 + y;
}