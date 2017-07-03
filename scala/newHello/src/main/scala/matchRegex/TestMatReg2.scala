package matchRegex

import scala.util.matching.Regex

/**
  * Created by zhg-pc on 17/6/30.
  */
object TestMatReg2 {
  def main(args: Array[String]): Unit = {
    val pattern = new Regex("(S|s)cala") // 首字母可以是大写 S 或小写 s
    val str = "Scala is scalable and cool"

    //查看所有的匹配项可以使用 findAllIn 方法
    //使用 mkString() 方法来连接正则表达式匹配结果的字符串，并可以使用管道(|)来设置不同的模式:
    println((pattern findAllIn str).mkString(",")) //使用逗号，连接返回结果
  }
}
