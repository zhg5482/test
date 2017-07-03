package matchRegex

/**
  * Created by zhg-pc on 17/6/30.
  */
object TestMatReg {
  def main(args: Array[String]): Unit = {
    /*
      String 类的 r() 方法构造了一个Regex对象
      findFirstIn 方法找到首个匹配项
     */
    val pattern = "Scala".r
    val str = "Scala is Scalable and cool"

    println(pattern findFirstIn str)
  }
}
