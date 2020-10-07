package com.yang.scala

import scala.beans.BeanProperty

/**
 * Created by Yang on 2020/10/6 23:18
 */

class Persons {

  private var name:String = "GavinYang"
  /**
   * _代表是给默认值
   */
  var age:Int = _

  @BeanProperty
  var sex:String = "男"

  def say():Unit = {
    println("This person.name value is --> " + name)
  }

  def this(age:Int) {
    this()
    this.age = age
    println("辅助构造器")
  }

  def this(age:Int,name:String) {
    this(age)
    this.name = name
  }

  def this(name:String,age:Int) {
    this(age)
  }

  println("主构造器")
}

class Teacher extends Persons {

  def test(): Unit = {
    this.age
    this.sex
  }

}

class Emp(nameParam:String,ageParam:Int) extends Persons(nameParam,ageParam) {

  var empNO:Int = _
  def this(nameParam:String,ageParam:Int,empNoParam:Int) {
    this(nameParam,ageParam)
    this.empNO = empNoParam
    println("子类辅助构造函数")
  }

  println("子类主构造函数")


}

object Persons {

  def main(args: Array[String]): Unit = {

    var person = new Persons()
    person.say()
    println(person.name)
    person.setSex("女")
    println(person.getSex)

  }

}
