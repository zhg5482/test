/**
  * Created by zhg-pc on 17/6/27.
  * 闭包
  */
object MultiplierTest {
  def main(args: Array[String]){
    println("multiplier(1) value = " + multiplier(1))
    println("multiplier(2) value = " + multiplier(2))
  }

  var factor = 3
  val multiplier = (i:Int) => i * factor
}
