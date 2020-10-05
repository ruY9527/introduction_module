package com.yang.scala

import scala.io.StdIn

/**
 * Created by Yang on 2020/10/6 0:21
 */

object KeyWordInputObj {

  /**
   * Scala中一切数据都是对象,都是Any子类.
   * Scala : AnyVal: 数值类型.   AnyRef: 引用类型. 二者都是对象.
   * Nothing : 所有类的子类,主要使用在一个函数m没有明确返回值时使用.因为这样我们可以把抛出的返回值,返回给任何的变量或者函数.
   *
   * 精度小的类型转化为精度大的类型,这个就是自动类型转换(隐式转换).
   *  自动提升原则: 有多种类型数据混和运算时候,系统首选自动j将所有数据转换成精度大的那种数据类型,然后再进行计算.
   *  把精度小大数值类型赋值给精度小的数值类型时,就会报错.
   * @param args
   */
  def main(args: Array[String]): Unit = {

    println("Please input your name --> ")
    val name = StdIn.readLine()

    println("Please input your age ---> ")
    val age = StdIn.readShort()

    println("please input sal:  ---> ")
    val sal = StdIn.readDouble()

    println("The name ---> " + name)
    println("The age  ---> " + age)
    println("The sal  ---> " + sal)

    //var c2: Char = '1'
    var isFalse = false
    var isTrue: Boolean = true

    def sayOk : Unit = {
      println("This is in sayOk Function")
    }

    sayOk

    // null类只是一个实例对象,Null可以赋值给任意引用类型,但是不能赋值给值类型.
    var s1 = new Student()
    s1 = null

    def testNothing() : Nothing = {
      throw new Exception()
    }

    testNothing()

  }

}


class Student {

}