package org.example

/**
 * @author ${user.name}
 */
import org.apache.spark.sql.SparkSession



object App{
  val spark = SparkSession.builder()
    .master("local[1]")
    .appName("SparkByExample")
    .getOrCreate();

  println("First SparkContext:")
  println("APP Name :"+spark.sparkContext.appName);


  def main(args: Array[String]) {
    println("Hello World!")
  }
}