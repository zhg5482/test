package patternMatching

/**
  * Created by zhg-pc on 17/6/30.
  */
object TestPatMat {
  def main(args: Array[String]){
    println(matchTest(3))
  }
  def matchTest(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }
}
