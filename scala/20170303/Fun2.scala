//函数使用可变参数
object Fun2{
	def main(args: Array[String]){
		printStrings("Hello","Scala","Python");
	}
	//这被声明类型为“String*”里的args实际上是数组[字符串]
	def printStrings(args:String*) = {
		var i : Int = 0;
		for( arg <- args ){
			println("Arg value[" + i + "] =" + arg);
			i = i + 1;
		}
	}
}
