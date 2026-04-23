object OperationObj {

  def addInt(a:Int,b:Int): Int ={
    var sum:Int = 0
    sum = a + b
    return sum
  }

  def printMe(): Unit ={
    println("This is GavinYang....")
  }

  var multipler = (i:Int) => i * 10

  def main(args: Array[String]): Unit = {

    var a = 10;
    var b = 20;
    var c = 25;
    var d = 45

    val xmax,ymax = 100

    def m(x:Int) = x + 3;

    println("a + b = " + (a + b))
    println("a - b = " + (a - b))
    println("a * b = " + (a * b))
    println("a / b = " + (a/ b))
    println()
    val f = (x:Int) => x + 3
    println(f(3))

    println("Retrun Value is ---> " + addInt(1,2))

    var factor = 3
    var mmm = (i:Int) => i * factor

  }

}

class Outer {
  class Inner {
    private def f(): Unit ={
      print("GavinYang In Outer.Inner.f() ")
    }

    class InnerMost {
      f()
    }
  }
}