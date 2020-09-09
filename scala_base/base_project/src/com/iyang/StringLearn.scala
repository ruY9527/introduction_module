package com.iyang

object StringLearn {

  val greeting: String = "This is GavinYang"

  /**
   * @param args
   */
  def main(args: Array[String]): Unit = {
    println(greeting)

    val buf = new StringBuilder;
    buf += 'a'
    buf ++= "bcedf"
    println("buf is ---> " + buf.toString())

    var palindrome = "www.lwfby.cn"
    var len = palindrome.length
    println("String length is " + len)

    var str1 = "这就是官网"
    var str2 = "www.lwfby.cn"
    var str3 = "Scala教程操作"
    var str4 = "这就是4啊"

    println(str1 + str2)
    println(str3.concat(str4))

    var floatVar = 12.456
    var intVar = 2000
    var stringVar = "This is GavinYang"
    var fs = printf("浮点类型为  %f , 整数类型  %d , 字符串类型 %s ",floatVar,intVar,stringVar)
    println(fs)

  }


}
