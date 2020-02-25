package ch2

import common.Scala


object CreateRDD {

  def main(arr: Array[String]): Unit = {
    val sc = Scala.sparkContext("create-RDD")

    //RDD 생성방법, 컬렉션 객체를 이용
    val rdd1 = sc.parallelize(List("a","b","c","d"))

    //RDD 생성방법 입출력을 이용
    val rdd2 = sc.textFile("./build.gradle")
  }
}
