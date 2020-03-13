package com.raymond.chapter4.ifelse

object Exercise1 {
  def main(args: Array[String]): Unit = {
    val num1 = 10
    val num2 = 5
    val sum = num1 + num2
    if (sum % 3 == 0 && sum % 5 == 0) {
      println("can be div by 3 && 5")
    } else {
      println("cannot be div by 3 && 5")
    }

    val year = 2018
    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
      println(s"${year} can is run-nian")
    } else {
      println(s"${year} is not run-nian")
    }
  }
}
