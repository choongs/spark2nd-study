package common

import org.apache.spark.{SparkConf, SparkContext}

object Scala {

  def sparkContext(appName:String): SparkContext = {
    val scf = new SparkConf().setMaster("local[*]").setAppName("Create RDD")
    new SparkContext(scf)
  }
}
