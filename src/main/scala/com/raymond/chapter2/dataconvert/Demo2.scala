package com.raymond.chapter2.dataconvert

object Demo2 {
  def main(args: Array[String]): Unit = {
    val num1: Int = 10 * 3.5.toInt + 6 * 1.5.toInt
    val num2: Int = (10 * 3.5 + 6 * 1.5).toInt
    println(num1 + ", " + num2)
  }

}
