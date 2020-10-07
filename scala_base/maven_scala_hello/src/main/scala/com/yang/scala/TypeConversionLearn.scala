package com.yang.scala

/**
 * Created by Yang on 2020/10/6 0:37
 * 类型转化学习
 */

object TypeConversionLearn {

  /***
   * String 类型转化为数字类型的时候,要尽量确保是可以转化成功的.
   * += 没有强转功能
   * @param args
   */
  def main(args: Array[String]): Unit = {

    // 精度丢失
    val n1 = 2.5.toInt
    println(n1)

    var r1 = 10 * 3.5.toInt + 6 * 1.6.toInt
    val r2 = (10 * 3.5 + 6 * 1.6).toInt
    println("The r1 value ---> " + r1 + " ; The r2 value ---> " + r2)

    // byte 是 -128 到 127,如果大于了127的话,就那么大于的就从 -128开始.
    var n2 = 130
    var n3 = 128
    val byte = n2.toByte
    println(byte)
    println(n3.toByte)

    var age = 18

    val res:Any = if (age < 18) {
      "小学生"
    } else if(age >= 18 && age < 30){
      "中学生"
    } else {
      "不是学生"
    }

    println(res)

    val ress = if (age < 18) "小学" else "中学"
    println(ress)

  }
}
