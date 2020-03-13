package com.raymond.chapter3.input

import scala.io.StdIn

object Demo1 {
  def main(args: Array[String]): Unit = {
    println("input your name")
    val name = StdIn.readLine()
    println("input your age")
    val age = StdIn.readInt()
    println("input your salary")
    val salary = StdIn.readDouble()

    printf("User's info is: name = %s, age=%d, salary=%.2f.", name, age, salary)
//    Cat.sayHi()
//    Cat.sayHello()
  }
}

object Cat extends A {
  def sayHi(): Unit = {
    println("meo...")
  }
}

trait A {
  def sayHello(): Unit = {
    println("A say hi")
  }
}
