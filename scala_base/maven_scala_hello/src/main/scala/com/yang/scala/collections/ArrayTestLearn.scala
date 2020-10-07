package com.yang.scala.collections

import scala.collection.mutable.ArrayBuffer

/**
 * Created by Yang on 2020/10/7 14:20
 */

object ArrayTestLearn {

  def main(args: Array[String]): Unit = {

    var arr1 = new Array[Int](4)
    println(arr1.length)
    arr1(3) = 10
    arr1.update(0,1)
    println(arr1.mkString(","))
    for (i <- arr1){
      println(i)
    }

    def printx(elem:Int): Unit = {
      println(elem)
    }
    arr1.foreach(printx)
    arr1.foreach(println)

    val ints:Array[Int] = arr1 :+ 5
    println(ints)
    println("-------------------------")

    var arr2 = Array(1,3,"GavinYang")
    println(arr2.length)
    for (i <- arr2) {
      println(i)
      // println(arr2[i])
    }

    println(" - ----- ---- ------------  ")

    val arr3 = ArrayBuffer[Any](1,2,3)
    for(i <- arr3) {
      println(i)
    }
    println(arr3.length)
    println("arr3.hash = " + arr3.hashCode())

    arr3 .+= (4)
    arr3.append(5,6)
    arr3.insert(0,7)
    println("arr3.hash again = " + arr3.hashCode())
    arr3(1) = 9
    println(" ===   ===   ===  ===")
    for(i <- arr3) {
      println(i)
    }
    println(arr3.length)

  }

}
