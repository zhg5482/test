//部分应用函数
import java.util.Date

object Fun10{
	def main(args: Array[String]){
		val date = new Date
		log(date,"messagel")
		Thread.sleep(1000)
		log(date,"message2")
		Thread.sleep(1000)
		log(date,"message3")
	}
	
	def log(date: Date,message: String) = {
		println(date + "----" + message)
	}
}
