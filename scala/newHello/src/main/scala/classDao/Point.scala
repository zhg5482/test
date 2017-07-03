package classDao

/**
  * Created by zhg-pc on 17/6/29.
  */
class Point(xc: Int,yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx:Int,dy:Int){
    x = x + dx
    y = y + dy
    println("x 的坐标点: " + x)
    println("y 的坐标点: " + y)
  }
}

