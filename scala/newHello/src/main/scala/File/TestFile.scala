package File

import java.io._

import scala.io.Source

/**
  * Created by zhg-pc on 17/7/3.
  */
object TestFile {
  def main(args: Array[String]): Unit = {
    //writeFile()
    //inputIntoFile()
    readFile()
  }

  // write something into file
  def writeFile(): Unit ={
    val writer = new PrintWriter(new File("test.txt"))

    writer.write("read the first line of file !")
    writer.close()
  }

  // input something into console
  def inputIntoFile(): Unit ={
    print("please input something into console : ")
    //val line = Console.readLine

    //println("thanks,result of you input : " + line)
  }

  def readFile(): Unit ={
    println("this content of file is : ")

    Source.fromFile("test.txt").foreach(
      print
    )
  }
}
