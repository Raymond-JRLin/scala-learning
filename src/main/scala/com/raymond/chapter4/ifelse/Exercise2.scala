package com.raymond.chapter4.ifelse

object Exercise2 {
  def main(args: Array[String]): Unit = {
    val a = 3
    val b = 100
    val c = 6
    val lambda = b * b - 4 * a * c
    if (lambda > 0) {
      println("2 solutions")
      val square = math.sqrt(lambda)
      val x1: Double = (-b + square) / (2 * a)
      val x2: Double = (-b - square) / (2 * a)
      printf("they are %f, %f", x1, x2)
    } else if (lambda == 0) {
      println("1 solution")
    } else {
      println("no solution")
    }
  }

}
