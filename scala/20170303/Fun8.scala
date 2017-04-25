//嵌套函数
object Fun8{
	def main(args: Array[String]) {
		println( factorial(0) )
		println( factorial(1) )
		println( factorial(2) )
		println( factorial(3) )
	}
	
	def factorial(i: Int): Int = {
		def fact(i: Int,accumulator: Int): Int = {
			if(i <= 1)
				accumulator
			else
				fact(i - 1, i * accumulator)
		}
		fact(i,1)
	}
}
//注:Scala允许在一个函数内部定义其他函数定义的函数,并可被局部函数调用。
