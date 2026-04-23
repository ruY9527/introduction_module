package com.yang.scala.collections

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

/**
 * Created by Yang on 2020/10/7 14:45
 */

object ListBufferLearn {

  def main(args: Array[String]): Unit = {

    val buffer = ListBuffer(1,2,3,4)
    buffer.+=(5)
    buffer.append(6)
    buffer.insert(1,222)
    buffer.foreach(print)
    buffer(1) = 666
    buffer.update(1,7)
    // buffer.-(5)
    buffer.-=(5)
    buffer.remove(5)
    println()
    println("-------------")

    val set = Set(1,2,3,4,5,6,7)
    val set1 = Set(1,2,3,4,5,6,3)
    for(x <- set1) {
      print(x)
    }
    println()
    println("  ----   -----   ------")

    val set5 =  mutable.Set(1,2,3,4,5,6)
    set5 += 8
    var ints1 = set5 .+ (9)
    println(ints1)
    println("The set5 value is ---> " + set5)
    set5 -= (5)
    println()
    set5.foreach(print)
    println(set5.mkString(","))
    println(" --- -- - ------")

  }

}
