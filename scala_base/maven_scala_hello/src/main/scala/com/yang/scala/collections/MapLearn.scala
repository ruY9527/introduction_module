package com.yang.scala.collections

/**
 * Created by Yang on 2020/10/7 14:53
 */

object MapLearn {

  def main(args: Array[String]): Unit = {

    val map = Map("a" -> 1,"b" -> 2, "c" -> 3)
    for(elem <- map.keys) {
      println(elem + " = " + map.get(elem).get)
    }

    println(map.get("d").getOrElse(0))
    println(map.getOrElse("d",0))
    map.foreach((kv) => { println(kv) })
    // map.updated("d",9527)

    val tuple: (Int,String,Boolean) = (40,"GavinYang",true)
    // 顺序访问
    println(tuple._1)
    println(tuple._2)
    println(tuple._3)

    println(tuple.productElement(0))

    for(elem <- tuple.productIterator){
      println(elem)
    }

    // 常用集合迭代操作
    println(" ------  常用集合迭代操作   ----------")
    val list:List[Int] = List(1,2,3,4,5,6,7,8)
    println(list.length)
    println(list.size)
    list.foreach(print)
    println()
    for(elem <- list.iterator) {
      print(elem)
    }
    println(list.mkString(","))
    println(list.contains(3))

    println("--------   分割线   -----------------")

    val list1:List[Int] = List(1,2,3,4,5,6,7)
    val list2:List[Int] = List(4,5,6,7,8,9,10)
    println(list1.head)
    // 不是头的就是尾
    println(list1.tail)
    // 集合最后一个数据
    println(list1.last)
    // 集合初始化数据,不包含最后一个
    println(list1.init)
    // 反转
    println(list1.reverse)

    // 并集
    println(list1.union(list2))

    // 交集
    println(list1.intersect(list2))

    // 差集
    println(list1.diff(list2))

    // 拉链. 如果两个集合的元素个数不相等,那么会将同等数量的数据进行拉链,多余的数据省略不用.
    println(list1.zip(list2))

    list1.sliding(2,5).foreach(println)

    println(" ------  排序分割线  --------")
    val list5 : List[Int] = List(1,5,-3,4,2,-7,6)
    println(list5.sum)
    println(list5.product)
    println(list5.max)
    println(list5.min)
    println(list5.sortBy(x => x))
    println(list5.sortBy(x => x.abs))
    println(list5.sortWith((x, y) => x < y))
    println(list5.sortWith((x, y) => x > y))

  }

}
