package com.yang.scala

/**
 * Created by Yang on 2020/10/6 14:08
 * 函数式编程基础的学习
 */

object FunctionBaseLearn {

  /**
   * 函数: 为完成某一功能的程序语句.
   * 函数没有重载和重写的概念,方法才有.
   * @param args
   */
  def main(args: Array[String]): Unit = {

    def f(arg:String): Unit = {
      println("传递进来的参数 ---> " + arg)
    }
    f("GavinYang")

    def test1(): Unit  = {
      println("无参数无返回值函数")
    }
    test1()

    def test2(): String = {
      return "无参数,有返回值";
    }
    test2()

    def test3(s:String) : Unit = {
      println("有参数,没有返回值内容,传入参数是:" + s)
    }
    test3("GavinYang")

    def test4(s:String):String = {
      return "我返回的内容是" + s;
    }

    def test5(name:String, age:Int) : Unit = {
      println(s"$name , $age")
    }
    test5("GavinYang",22)

    def test6(s:String*) : Unit = {
      println(s)
    }
    test6("Hello","GavinYang")
    test6()
    test6("Hello","PeterWong")

    def test7(sex:String="男",name:String) : Unit = {
      println(s"$name, $sex")
    }
    // 带参数名字调用函数.
    test7(name = "PeterWong")

    // 传入函数作为参数.
    def f1(f:(Int,Int) => Int) : Int = {
      f(2,4)
    }
    def add(a:Int , b:Int) : Int = a + b
    println(f1(add))

  }

}
