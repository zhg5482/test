object Test {
	def main(args: Array[String]) {
		var a = 10;
		var b = 20;
		var c = 25;
		var d = 25;
		var e = true;
		var f = false;
		println("算术运算符:");
		println("a + b = " + (a + b) );
		println("a - b = " + (a - b) );
		println("a * b = " + (a * b) );
		println("b / a = " + (b / a) );
		println("b % a = " + (b % a) );
		println("c % a = " + (c % a) );
		println("关系运算符:");
		println("a == b = " + (a == b) );
		println("a != b = " + (a != b) );
		println("a > b = " + (a > b) );
		println("a < b = " + (a < b) );
		println("b >= a = " + (b >= a));
		println("b <= a = " + (b <= a));
		println("逻辑运算符");
		println("e && f = " + (e&&f) );
		println("e || f = " + (e||f) );
		println("!(e && f) = " + !(e && f) );
	}
}
