package com.yang.scala.collections

import scala.collection.mutable.ArrayBuffer

/**
 * Created by Yang on 2020/10/7 14:34
 */

object ArrayBufferTetsLearn {

  def main(args: Array[String]): Unit = {

    var arr1 = ArrayBuffer[Int]()
    arr1.append(1,2,3)
    println(arr1)

    val newArray = arr1.toArray
    println(newArray)

    val newBuffer = newArray.toBuffer
    newBuffer.append(123)

    println(newBuffer)
    println("-----------------------")

    val arr = Array.ofDim[Int](3, 4)
    arr(1)(2) = 88
    for(i <- arr){
      for(j <- i){
        print(j + " ")
      }
      println()
    }

    println(" -- ------ ------------")
    val list:List[Int] = List(1,2,3,4,3)
    val list5 = 1::2::3::4::Nil
    val list1 = 7::6::5::list
    var list2 = list .+: (5)

    val list3 = List(8,9)
    val list4 = list3:::list1
    println(list(0))
    list4.foreach(print)
    println()
    list5.foreach(print)

  }

}
