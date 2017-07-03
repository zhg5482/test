package extractor

/**
  * Created by zhg-pc on 17/6/30.
  */
object TestExtractor2 {
  def main(args: Array[String]): Unit = {

    val x = TestExtractor2(5)
    println(x)

    x match
    {
      case TestExtractor2(num) => println(x + " 是" + num + " 的两倍! ")
      //unapply 被调用
      case _ => println("无法计算")
    }
  }

  def apply(x: Int) = x*2
  def unapply(z: Int): Option[Int] = if (z%2==0) Some(z/2) else None
}
