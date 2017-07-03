package exceptionHandling

import java.io.{FileNotFoundException, FileReader, IOException}

/**
  * Created by zhg-pc on 17/6/30.
  */
object TestExceHand2 {
  def main(args: Array[String]): Unit = {
    try {
      val f = new FileReader("input.txt")
    } catch {
      case ex: FileNotFoundException => {
        println("Missing file exception")
      }
      case ex: IOException => {
        println("IO Exception")
      }
      // finally 语句用于执行不管正常处理还是有异常发生时都需要执行的步骤
    } finally {
        println("Exiting finally...")
    }
  }
}
