package com.yang.scala

import scala.collection.mutable.ArrayBuffer

/**
 * Created by Yang on 2020/10/6 14:37
 *
 * 函数作为参数来传递
 */

object FunctionTransmitLearn {

  def main(args: Array[String]): Unit = {

    def operation(arr:Array[Int] , op:Int => Int) = {
      for(elem <- arr) yield op(elem)
    }
    def op(ele:Int) : Int = {
      ele + 1
    }
    val numberList1 = operation(Array(1, 2, 3, 4, 5), op)
    println(numberList1.mkString("----"))

    val numberList2 = operation(Array(2, 3, 4, 5, 6), (ele: Int) => {
      ele + 2
    })
    println(numberList2.mkString("/"))

    val numberList3 = operation(Array(3, 4, 5, 6, 7), ele => ele + 1)
    println(numberList3.mkString("="))

    val numberList4 = operation(Array(4, 5, 6, 7, 8), _ + 1)
    println(numberList4.mkString("_"))

    def calculator(a:Int, b:Int, op:(Int,Int) => Int) : Int = {
      op(a , b)
    }
    calculator(1,2, (a,b) => a + b)
    calculator(2,3 , (a:Int,b:Int) => { a + b})
    calculator(3,4, (a:Int,b:Int) => a + b)
    calculator(4,5, _ + _)

    def f1(x:Int) = {
      def f2(y:Int) = {
        def f3(): Int = {
          return x * y
        }
        f3 _
      }
      f2 _
    }

    def f4(x:Int) = {
      def f5(y:Int) = {
        def f6(f:(Int,Int) => Int) : Int = {
          f(x,y)
        }
        f6 _
      }
      f5 _
    }

    def map(arr:Array[Int],op:Int => Int) = {
      for (elem <- arr) yield op(elem)
    }
    val ints1 = map(Array(1, 2, 3, 4, 5), x => x * x)
    println(ints1.mkString("-="))

    def filter(arr:Array[Int],op:Int => Boolean) = {
      var arr1:ArrayBuffer[Int] = ArrayBuffer[Int]()
      for(elem <- arr if op(elem)) {
        arr1.append(elem)
      }
      arr1.toArray
    }
    val ints2 = filter(Array(5, 6, 7, 8), _ % 2 == 1)
    println(ints2.mkString("//"))

    def reduce(arr:Array[Int],op:(Int,Int) => Int) = {
      var init:Int = arr(0)
      for (elem <- 1 until arr.length) {
        init = op(init,elem)
      }
      init
    }

    val i = reduce(Array(1, 2, 3, 4, 5), _ * _)
    println(i)

    def f11() = {
      var a : Int = 10
      def f22(b:Int) = {
        a + b
      }
      f22 _
    }

    var ffff = f11()
    // 在此处,变量a其实并没有释放,而是包含在了f22函数的内部,形成了闭合效果.
    println(ffff(3))
    println(f11()(3))

    var a:Int = 10
    // 函数柯里化,其实将复杂的参数逻辑变得简单,函数柯里化一定存在闭包的效果.
    def f33()(b:Int) = {
      a + b
    }
    println(f33()(11))

    // 递归使用.
    def testt(i:Int) : Int = {
      if(i <=  1){
        1
      } else {
        i * testt(i - 1)
      }
    }

  }

}
