//高阶函数
object Fun7{
	def main(args: Array[String]){
		println(apply(layout,10))
	}
	def apply(f:Int => String,v: Int) = f(v)
	def layout[A](x:A) = "[" + x.toString() + "]"
}
//注:Scala允许高阶函数的定义。这些都是采取其他函数参数，或它的结果是一个功能的函数。apply()函数将另一个函数f和v值并应用函数f到v
