/**
  * Created by zhg-pc on 17/6/27.
  * String 方法
  */
object String2Test {
  def main(args:Array[String]){
    var str1 = "This is a ugly world! "
    var str2 = "What do you want to do? "
    //1.char charAt(int index) 返回指定位置的字符
    println(str1.charAt(5))
    //2.int compareTo(Object o/String anotherString) 比较字符串与对象/字符串
    println(str1.compareTo(str2))
    //3.compareToIgnoreCase(String str) 按字典顺序比较两个字符串,不考虑大小写
    println(str1.compareToIgnoreCase(str2))
    //4.String concat(String str) 将指定字符串连接到此字符串的结尾
    println(str1.concat(str2))
    //5.boolean contentEquals(StringBuffer sb) 将此字符串与指定的StringBuffer比较
    var str3 = new StringBuilder
    str3 ++= str1
    println(str1.contentEquals(str3.toString()))
    //6.static String copyValueOf(char[] data) 返回指定数组中表示该字符序列的 String
    //.......
  }
}
