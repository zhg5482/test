package matchRegex

import scala.util.matching.Regex

/**
  * Created by zhg-pc on 17/6/30.
  */
object TestMatReg4 {
  def main(args: Array[String]): Unit = {
    val pattern = new Regex("abl[ae]\\d+")
    val str = "ablaw is able1 and cool"

    println((pattern findAllIn str).mkString(","))
  }
}
