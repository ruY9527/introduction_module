package com.yang.scala.exces

/**
 * Created by Yang on 2020/10/8 0:05
 */

object ExceptionLearn {

  def main(args: Array[String]): Unit = {

    try {
      var n = 10 / 0
    } catch {

      case ex : ArithmeticException => {
        println(ex)
        println("发生算术异常")
      }
      case ex : Exception => {
        println("发生了异常1")
        println("发生了异常2")
      }
    } finally {
      println("最后的倔强")
    }
  }

  def test():Nothing = {
    throw new Exception("这就是有问题")
  }

}
