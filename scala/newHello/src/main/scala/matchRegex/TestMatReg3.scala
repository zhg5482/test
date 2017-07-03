package matchRegex

/**
  * Created by zhg-pc on 17/6/30.
  */
object TestMatReg3 {
  def main(args: Array[String]): Unit = {
    val pattern = "(S|s)cala".r
    val str = "Scala is scalable and cool"

    // replaceFirstIn() 方法来替换第一个匹配项,使用 replaceAllIn 方法替换所有匹配项
    println(pattern replaceFirstIn(str,"Java"))
  }
}
