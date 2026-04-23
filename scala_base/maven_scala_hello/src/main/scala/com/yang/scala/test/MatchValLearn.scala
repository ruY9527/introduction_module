package com.yang.scala.test

/**
 * Created by Yang on 2020/10/7 18:31
 */

object MatchValLearn {

  def main(args: Array[String]): Unit = {

    println(desc(List(1, 2, 3, 4, 5, 6)))
    println(desc(Array(1, 2, 3, 4, 5)))
    println(desc(Array("abc")))

  }

  def desc(x:Any) = x match {
    case i : Int => "Int"
    case s : String => "String"
    case m : List[_] => "List"
    case c : Array[Int] => "Array[Int]"
    case cc: Array[String] => "Array[String]"
    case someThing => "something else " + someThing
  }

  def describe(x:Any) = x match {
    case 5 => "Int Five"
    case "hello" => "String Hello"
    case true => "Boolean true"
  }

}
