/**
  * Created by zhg-pc on 17/6/27.
  */
object StringTest {
  val greeting:String = "Hello,World!"
  val buf = new StringBuilder
  val palindrome = "www.runoob.com"
  def main(args:Array[String]){
    //输出字符串
    println(greeting)
    //StringBuilder 修改字符串
    buf += 'a'
    buf ++= "bcdef"
    println("buf is : " + buf.toString())
    //字符串长度
    println("String Length is : " + palindrome.length)
    //字符串连接
    var str1 = "菜鸟教程官网: ";
    var str2 = "www.runoob.com";
    var str3 = "菜鸟教程的 Slogan 为: ";
    var str4 = "学的不仅是技术,更是梦想! ";
    println(str1 + str2);
    println(str3.concat(str4))
    //创建格式化字符串
    var floatVar = 12.456
    var intVar = 2000
    var stringVar = "菜鸟教程!"
    var fs = printf("浮点型变量为 " +
                  "%f, 整型变量为 %d,字符串为 " +
                  " %s",floatVar,intVar,stringVar)
    println(fs)
  }
}
