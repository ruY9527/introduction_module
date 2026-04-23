package com.yang.scala.collections

import scala.collection.mutable

/**
 * Created by Yang on 2020/10/7 16:46
 */

object FunctionCalculateLearn {

  def main(args: Array[String]): Unit = {

    // 过滤,map(转化/映射),扁平化,扁平化+映射,分组,简化.
    val list:List[Int] = List(1,2,3,4,5,6,7,8,9)
    val newDoubleList = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9))
    val wordList:List[String] = List("hello world", "hello GavinYang", "Hello peterWong")
    println(list.filter(x => x % 2 == 0))
    println(list.map(x => x + 1))
    println(newDoubleList.flatten)
    println(wordList.flatMap(x => x.split(" ")))
    println(list.groupBy(x => x % 2))

    var reduceList = List(1,2,3,4)
    val i : Int = reduceList.reduce((x, y) => x - y)
    val i1 = list.reduceLeft((x, y) => x - y)
    val i2 = list.reduceRight((x, y) => x - y)
    println("The i value is --> " + i  + " ; The i1 value is ---> " + i1 + " ; The i2 value is ---> " + i2)

    println(" ----- 分割线 -------")

    val list6 = List(1,2,3,4)
    val i3 = list6.foldLeft(1)((x, y) => x - y)
    val i4 = list6.foldRight(10)((x, y) => x - y)
    println(i3)
    println(i4)

    println(" -----  map ----")
    val map1 = mutable.Map("a"->1,"b"->2,"c"->3)
    val map2 = mutable.Map("a"->4,"b"->5,"d"->6)
    val map3: mutable.Map[String,Int] = map2.foldLeft(map1){
      (map,kv) => {
        val k =  kv._1
        val v =  kv._2
        map(k) =  map.getOrElse(k,0) + v
        map
      }
    }
    println(map3)
  }

}
