/**
  * Created by zhg-pc on 17/6/27.
  * 处理数组
  */
import Array._

object ArrayTest {
  def main(args:Array[String]){
    var myList = Array(1.9, 2.9, 3.4, 3.5)
    //arrayPrint(myList)
    //println("数组总和是: " + arraySum(myList))
    //println("数组最大值是: " + searchMax(myList))
    //multiArray()
    //unitArray()
    sectionArray()
  }

  //打印数组
  def arrayPrint(a:Array[Double]):Unit={
    //输出所有数组元素
    for (x<-a){
      println(x)
    }
  }

  //计算数组所有元素的总和
  def arraySum(a:Array[Double]):Double={
    var total = 0.0;
    for(i <- 0 to (a.length - 1)){
      total += a(i);
    }
    return total
  }

  //查找数组中的最大元素
  def searchMax(a:Array[Double]):Double={
    var max = a(0);
    for(i <- 1 to (a.length - 1)){
      if(a(i) > max) max = a(i);
    }
    return max
  }

  //多维数组
  def multiArray():Unit={
    var myMatrix = ofDim[Int](3,3)

    //创建矩阵
    for (i <- 0 to 2) {
      for ( j <- 0 to 2) {
        myMatrix(i)(j) = j;
      }
    }

    //打印二位阵列
    for (i <- 0 to 2){
      for (j <- 0 to 2){
        print(" " + myMatrix(i)(j))
      }
      println()
    }
  }

  //合并数组
  def unitArray():Unit={
    var myList1 = Array(1.9,2.9,3.4,3.5)
    var myList2 = Array(8.9,7.9,0.4,1.5)

    var myList3 = concat(myList1,myList2)

    //输出所有数组元素
    for (x <- myList3){
      println(x)
    }
  }

  //创建区间数组
  def sectionArray():Unit={
    var myList1 = range(10,20,2)
    var myList2 = range(10,20)

    //输出所有数组元素
    for (x <- myList1){
      print(" " + x)
    }

    println()
    for (x <- myList2){
      print(" " + x)
    }
  }
}
