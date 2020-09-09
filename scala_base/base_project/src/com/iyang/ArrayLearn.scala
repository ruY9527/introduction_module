package com.iyang

import Array._

object ArrayLearn {

  def definitionCollect(): Unit ={
    val x = List(1,2,3,4)
    val y = Set(1,3,5,7)

    val xMap = Map("one" -> 1 , "two" -> 2, "three" -> 3)
    val xName = (10,"GavinYang")
    val xSome:Option[Int]  = Some(5)

    val it = Iterator("GavinYang","PeterWong","S")
    while (it.hasNext){
      print(it.next())
    }

  }

  def manyArr(): Unit ={
    var myMatrix = ofDim[Int](3,3)
    for(i <- 0 to 2){
      for(j <- 0 to 2){
        myMatrix(i)(j) = j
      }
    }

    for(i <- 0 to 2){
      for(j <- 0 to 2){
        println(" " + myMatrix(i)(j))
      }
      println()
    }
  }

  def mergeArray(): Unit ={
    var myList1 = Array(1.9, 2.9, 3.4, 3.5)
    var myList2 = Array(8.9, 7.9, 0.4, 1.5)
    var myList3 = concat(myList1,myList2)
    for(x <- myList3){
      println(x)
    }
  }

  def rangeArr(): Unit ={
    var myList1 = range(10,20,2)
    var myList2 = range(10,20)

    for(x <- myList1){
      print(" " + x)
    }

    println()

    for(x <- myList2){
      print(" " + x)
    }
  }

  def main(args: Array[String]): Unit = {
    var z = Array("GavinYang","PeterWong")
    var myList = Array(1.9,2.9,3.4,3.5)
    for(x <- myList){
      println(x)
    }

    var total = 0.0
    for(i <- 0 to (myList.length - 1)){
      total += myList(i)
    }
    println("总和是: " + total)

    var max = myList(0)
    for(i <- 1 to (myList.length -1 )){
      if(myList(i) > max){
        max = myList(i)
      }
    }
    println("最大值是: ---> " + max)
  }

}
