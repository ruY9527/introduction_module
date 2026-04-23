package com.yang.scala.test

/**
 * Created by Yang on 2020/10/7 23:35
 */

object MatchListLearn {

  def main(args: Array[String]): Unit = {

    for(i <- Array(List(0),List(1,0),List(0,0,0),List(1,0,0),List(88))) {

      var result  = i match {
        /*case ::(head, next) =>
        case Nil =>*/
        case List(0) => "0"
        case List(x,y) => x + "," + y
        case List(0,_*) => "0 ..."
        case _ => "something else"
      }

      println(result)

      val list = List(1, 2, 3, 4, 5, 6, "GavinYang")
      list.map {
        a => a match {
          case i : Int => i + 1
          case s : String => s + 1
        }
      }

      println(list.filter(a => a.isInstanceOf[Int]))
    }

  }

}
