/**
  * Created by zhg-pc on 17/6/28.
  */
object CollectionTest {
  def main(args:Array[String]){

    //定义整型 List
    val x = List(1,2,3,4)

    //定义 Set
    val y = Set(1,3,5,7)

    //定义 Map
    val z = Map("one" -> 1,"two" -> 2,"three" -> 3)

    //创建两个不同类型元素的元组
    val u = (10,"Runoob")

    //定义 Option
    val v:Option[Int] = Some(5)

    iteratorTest()
    searchMaxMin()
    lengthOfIterator()
  }

  //Iterator（迭代器）
  def iteratorTest(): Unit ={
    val it = Iterator("Baidu","Google","Runoob","Taobao")

    while (it.hasNext){
      println(it.next())
    }
  }

  //查找最大与最小元素
  def searchMaxMin(): Unit ={
    val ita = Iterator(20,40,2,50,69,90)
    val itb = Iterator(20,40,2,50,69,90)

    println("最大元素是：" + ita.max)
    println("最小元素是：" + itb.min)
  }

  //获取迭代器的长度
  def lengthOfIterator(): Unit ={
    val ita = Iterator(20,40,2,50,69,90)
    val itb = Iterator(20,40,2,50,69,90)

    println("ita.size 的值：" + ita.size)
    println("itb.length 的值：" + itb.length)
  }
}
