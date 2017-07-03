package patternMatching

/**
  * Created by zhg-pc on 17/6/30.
  */
object TestPatMat2 {
  def main(args: Array[String]): Unit ={
    println(matchText("two"))
    println(matchText("test"))
    println(matchText(1))
    println(matchText(6))
  }
  def matchText(x: Any): Any = x match {
    case 1 => "one"
    case "two" => 2
    case y: Int => "scala.Int"
    case _ => "many"
  }
}
