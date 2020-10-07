package com.yang.scala

import scala.util.control.Breaks

/**
 * Created by Yang on 2020/10/6 13:48
 *
 * For 循环练习
 */

object ForLearn {

  def main(args: Array[String]): Unit = {

    // 二边都是闭
    for (i <- 1 to 5) {
      println("打印的数值是 ---> " + i)
    }

    // 左闭右开
    for (j <- 1 until 3) {
      println("打印的内容是" + j)
    }

    for (a <- 1 until 5 + 1) {
      println("a ---> " + a)
    }

    for (z <- 1 to 3 if z != 2) {
      println("z ---> " + z)
    }

    for (x <- 1 to 5 by 2) {
      println(" x ---> " + x)
    }

    // 二层迭代
    for (q <- 1 to 3; w <- 1 to 3) {
      println("q value is " + q + " w value is " + w)
    }

    // 引入变量
    for (r <- 1 to 3; t = r - 1) {
      println(" r value ---> " + r + " t value is ---> " + t)
    }


    try {
      for (el <- 1 to 10) {
        println(el)
        if (el == 5) throw new RuntimeException
      }
    } catch {
      case eee =>
    }
    println("Catch Exception In Normal For...")

      Breaks.breakable(
        for(et <- 1 to 10){
          println(et)
          if(et == 5) Breaks.break()
        }
      )
    println("Normal Over Action.")


}
}
