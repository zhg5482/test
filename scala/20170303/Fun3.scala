//函数按名称调用
object Fun3{
	def main(args: Array[String]){
		delayed(time());
	}

	def time() = {
		println("Getting time in nano seconds");
		System.nanoTime
	}
	
	def delayed( t: => Long ) = {
		println("In delayed method")
		println("Param: " + t)
		t
	}
}
//注:这里,delayed打印的消息声明，该方法已被输入。接下来,delayed打印一个与其消息的值。最后delayed方法返回t
