package ch2

import common.Scala

object TransformationRDD {

  def main(args: Array[String]): Unit = {
    map()
    flatMap()
  }

  private def map(): Unit ={
    val sc = Scala.sparkContext("RDD-map")

    val rdd = sc.parallelize(1 to 10)
    //map 메서드는 하나의 입력을 받아서 하나의 값을 돌려주는 함수를 인자로 받음.
    //함수를 인자로 받거나 돌려받는 함수를 고계함수(higher order function)라고 함.
    val result = rdd.map(_ + 1)
    println(result.collect().mkString(", "))
  }

  private def flatMap(): Unit ={
    val fruits = List("apple, orange", "grape, apple, mango", "blueberry, tomato, orange")
    val sc = Scala.sparkContext("RDD-flatMap")
    val rdd1 = sc.parallelize(fruits)
    val rdd2 = rdd1.flatMap(_.split(","))
    println(rdd2.collect().mkString(", "))
  }
}
