package com.raymond.chapter2.datatype

object TypeDemo01 {
  def main(args: Array[String]): Unit = {
    var num1: Int = 10
    // because Int is a class, so num1 is an object of Int, then it can use bunch of methods
    println(num1.toDouble + "\t" + num1.toString + 10.toChar + "\t")
    // 如果 method 没有姓参， 可以省略括号
    sayHi()
    sayHi

    var isPass = true
    println(isPass.toString)
  }

  def sayHi(): Unit = {
    println("Say Hi!")
  }
}
