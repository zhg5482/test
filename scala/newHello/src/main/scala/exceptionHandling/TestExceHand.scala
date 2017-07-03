package exceptionHandling

import java.io.{FileNotFoundException, FileReader, IOException}

/**
  * Created by zhg-pc on 17/6/30.
  */
object TestExceHand {
  def main(args: Array[String]): Unit = {
    try {
      val f = new FileReader("input.txt")
    }catch {
      case ex:FileNotFoundException =>{
        println("Missing file exception")
      }
      case ex: IOException => {
        println("IO Exception")
      }
      //由于异常捕捉是按次序,如果是最普通的异常,Throwable,写在最前面,则在它后面的case都捕捉不到
      case ex:Throwable=>{
        println("Throwable Error")
      }
    }
  }
}
