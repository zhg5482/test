//匿名函数
object Fun9{
	def main(args : Array[String]){
		var inc = (x:Int) => x+1
		//常规方式的函数 var x = inc(7) - 1
		var mul = (x: Int,y: Int) => x*y
		//常规方式的函数 println(mul(3,4))

		var userDir = () => {System.getProperty("user.dir") }
		println( userDir )
	}
}
