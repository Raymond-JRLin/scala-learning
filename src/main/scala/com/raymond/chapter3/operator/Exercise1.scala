package com.raymond.chapter3.operator

object Exercise1 {
  def main(args: Array[String]): Unit = {
    val days = 97
    printf("there is %d weeks and %d days", days / 7, days % 7)

    println()

    val fahrenheit = 232.5
    val celsius = 5.0 / 9 * (fahrenheit - 100)
    println(celsius.formatted("%.2f"))
  }
}
