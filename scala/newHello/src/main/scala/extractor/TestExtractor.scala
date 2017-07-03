package extractor

/**
  * Created by zhg-pc on 17/6/30.
  */
object TestExtractor {
  /*
    apply 和 unapply 方法。通过 apply 方法我们无需使用 new 操作就可以
    创建对象。
    unapply 方法算是 apply 方法的反向操作: unapply
   */
  def main(args: Array[String]): Unit = {
    println ("Apply 方法 : " + apply("Zara", "gmail.com"));
    println ("Unapply 方法 : " + unapply("Zara@gmail.com"));
    println ("Unapply 方法 : " + unapply("Zara Ali"));
  }
  // 注入方法 (可选)
  def apply(user: String,domain: String) = {
    user +"@"+ domain
  }

  // 提取方法 (必选)
  def unapply(str: String): Option[(String,String)] = {
    val parts = str split "@"
    if (parts.length == 2){
      Some(parts(0),parts(1))
    }else{
      None
    }
  }
}
