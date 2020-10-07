package com.yang.scala

import java.util.concurrent.locks.Condition

/**
 * Created by Yang on 2020/10/6 22:49
 */

object FunctionControllerLearn {

  /**
   * Lazy函数: 当函数返回值被声明为lazy的时候,函数的执行将被推迟,值到我们首次对函数进行取值,该函数才会被执行.
   *
   * @param number1
   * @param number2
   * @return
   */
  def sum(number1:Int,number2:Int) : Int = {
    println("sum函数是被执行的")
    number1 + number2
  }

  def main(args: Array[String]): Unit = {

    lazy val res = sum(10,20)
    println("-----------")
    println("The res value is ---> " + res)

    def f = () => {
      println("In function f().....")
      10
    }

    // 传递代码块
    fooo {
      println("This is GavinYangYang")
    }

    foo(f())
    foo2(f())
  }

  // 值调用,传入过去的是值(就是计算后的值)
  def foo(a:Int) : Unit = {
    println(a)
    println(a)
  }

  // 名调用,传递过去的是代码
  def foo2(a: => Int): Unit = {
    println(a)
    println(a)
  }

  def fooo(a: => Unit) : Unit = {
    println(a)
    println(a)
  }

  /**
   * 自定义while循环
   * @param condition
   * @param op
   */
  def myWhile(condition: => Boolean)(op: => Unit) : Unit =  {
    if(condition){
      op
      myWhile(condition) (op)
    }
  }

}
