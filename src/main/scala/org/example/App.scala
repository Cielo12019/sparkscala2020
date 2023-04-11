package org.example

/**
 * @author ${user.name}
 */
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.SQLContext
import org.apache.spark.sql.Dataset
import org.apache.spark.sql.Row
import org.apache.spark.sql.Encoder
import org.apache.spark.sql.Encoders


object App{
  //System.setProperty("hadoop.home.dir","c:\\winutils")
  val spark = SparkSession.builder()
    .master("local[1]")
    .appName("SparkByExample")
    //.enableHiveSupport()
    .getOrCreate();

  println("First SparkContext:")
  println("APP Name :"+spark.sparkContext.appName);


  def main(args: Array[String]) {
    println("Hello World!")
  }
}