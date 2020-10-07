package com.yang.scala.collections

/**
 * Created by Yang on 2020/10/7 18:27
 */

object ThreadRunLearn {

  def main(args: Array[String]): Unit = {

    val resultOne = (0 to 100).map { case _ => Thread.currentThread().getName }
    val resultTwo = (0 to 100).map { case _ => Thread.currentThread().getName }
    println(resultOne)
    println(resultTwo)

  }

}
