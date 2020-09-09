package com.iyang

import java.io.{FileNotFoundException, FileReader, IOException}

class Point (xc:Int,yc:Int) {

  var x: Int = xc
  var y: Int = yc

  def move(dx:Int, dy:Int): Unit ={
    x = x + dx
    y = y + dy
    println("x 的坐标点 : " + x)
    println("y 的坐标点 : " + y)
  }
}

class Localtion ( val xc:Int, val yc:Int,val zc:Int) extends Point(xc,yc) {

  var z: Int = zc

  def move(dx:Int,dy:Int,dz:Int): Unit ={
    x = x + dx
    y = y + dy
    z = z + dz
    println("x 的坐标点是 " + x)
    println("y 的坐标点是 " + y)
    println("z 的坐标点是 " + z)
  }

}

class Person {
  var name = ""
  override def toString: String = getClass.getName + "[name= " + name + "]"
}

class Employee extends Person {
  var salary = 0.0

  override def toString: String = super.toString + "[salary=" + salary + "]"
}

object Test{

  def matchTest(x:Int): String = {
    case 1 => "one"
    case 2 => "two"
    case 3 => "three"
    case _ => "many"
  }

  def readFileCode(): Unit ={
    try{
      val f = new FileReader("input.txt")
    } catch {
      case ex: FileNotFoundException => {
        println("Missing file exception")
      }
      case ex: IOException => {
        println("IOException")
      }
    } finally {
      println("Exiting finally....")
    }
  }

  def main(args: Array[String]): Unit = {

    val pt = new Point(10,20)
    pt.move(10,10)

  }

  def apply(user:String,domain:String) = {
    user + "@" + domain
  }

  def unapply(str:String) : Option[(String,String)] = {
    val parts = str split "@"
    if(parts.length == 2){
      Some(parts(0),parts(1))
    } else {
      None
    }
  }

}
