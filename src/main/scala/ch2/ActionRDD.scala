package ch2

import common.Scala

object ActionRDD {

  def main(args: Array[String]): Unit = {
    collect()
    count()
  }

  private def collect(): Unit = {
    val sc = Scala.sparkContext("RDD-collect")

    val rdd = sc.parallelize(1 to 10)
    // 모든 원소를 모아서 배열로 돌려준다.
    val result = rdd.collect()

    //mkString list에 담긴 요소를 하나의 문자열로 표현.
    println(result.mkString(", "))

  }

  private def count(): Unit ={
    val sc = Scala.sparkContext("RDD-count")
    val rdd = sc.parallelize(1 to 10)
    val result = rdd.count()
    println(result)
  }
}
