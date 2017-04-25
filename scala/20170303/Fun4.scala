//函数使用命名参数
object Fun4{
	def main(args: Array[String]){
		printInt(b=5, a=7);
	}
	def printInt( a:Int, b:Int){
		println("Value of a : " + a );
		println("Value of b : " + b );
	}
}
