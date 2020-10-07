package com.yang.scala.collections

import scala.collection.mutable

/**
 * Created by Yang on 2020/10/7 18:25
 */

object QueueObjLearn {

  def main(args: Array[String]): Unit = {

    var que = new mutable.Queue[String]()
    que.enqueue("a","b","c")
    println(que.dequeue())
    println(que.dequeue())
    println(que.dequeue())

  }

}
