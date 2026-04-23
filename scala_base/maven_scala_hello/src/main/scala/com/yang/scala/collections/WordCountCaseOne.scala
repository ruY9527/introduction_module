package com.yang.scala.collections

/**
 * Created by Yang on 2020/10/7 17:17
 */

object WordCountCaseOne {

  def main(args: Array[String]): Unit = {

    val stringList = List("Hello Scala Hbase kafka", "Hello Scala Hbase", "Hello Scala", "Hello")
    val simpleWordList: List[String] = stringList.flatMap(str => str.split(" "))
    val wordSameToMap : Map[String,List[String]] = simpleWordList.groupBy(word => word)
    val wordToCountMap = wordSameToMap.map(tuple => (tuple._1, tuple._2.size))
    val sortList = wordToCountMap.toList.sortWith((left, right) => {
      left._2 > right._2
    })

    val resultList:List[(String,Int)] = sortList.take(3)
    println(resultList)

    val tupleList = List(("Hello Scala Spark World",4),("Hello Scala Spark",3),("Hello Scala",2),("Hello",1))
    val stringList2 : List[String] = tupleList.map(t => (t._1 + "") * t._2)
    val word: List[String] = stringList2.flatMap(s => s.split(" "))


  }

}
