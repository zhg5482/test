package classDao

/**
  * Created by zhg-pc on 17/6/29.
  */
class Point1(val xc: Int,val yc: Int){
  var x: Int = xc
  var y: Int = yc
  def move(dx:Int,dy:Int){
    x = x + dx
    y = y + dy
  }
}

//单例对象实例
object TestPoint {
  def main(args:Array[String]){
    val point = new Point1(10,20)
    printPoint

    def printPoint{
      println("x 的坐标点 : " + point.x)
      println("y 的坐标点 : " + point.y)
    }
  }
}
