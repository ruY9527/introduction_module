package com.yang.scala

/**
 * Created by Yang on 2020/10/6 0:01
 */
object MavenHelloWorld {

  /**
   * main 方法名字
   * (args: Array[String]): 参入参数列表.  args:参数名字, Array[String]:参数类型.
   * scala中没有static关键字,为了模仿static,采用伴生对象单例的方式调用方法.
   * Unit: 返回类型,表示没有返回值.相当于java中的void.
   *
   * @param args
   */
  def main(args: Array[String]): Unit = {

    println("My name is gavinyang...Who are you ?")
    println("My Name is PeterWong")

    // 类型确定后不能修改.
    // 声明变量
    var a:Int = 10

    // 声明常量
    val j:Int = 20

    var p1 = new Person()
    p1.name = "PeterWong"

    // p2是用val修饰的,p2本身不可变(这里说的是p2内存地址不能变),但是p2中的属性是可以变化的,因为属性没有使用val来修饰.
    val p2 = new Person()
    p2.name = "dongnige"

    printf("p2'name is %s , 和 p1's name is %s",p2.name,p1.name)

    var manyRowStr =
      """
        |我
        |就
        |是
        |我
        |""".stripMargin
    printf("我说了一一句话: %s" , manyRowStr)
    // println(manyRowStr)
  }
}

class Person {
  var name: String = "GavinYang"
}
