/**
  * Created by zhg-pc on 17/6/27.
  */
object Test {
  def main(args: Array[String]){
    println("Returned Value : " + addInt(5,7));
  }
  def addInt(a:Int,b:Int):Int = {
    var sum:Int = 0;
    sum = a + b;
    return sum;
  }
}
