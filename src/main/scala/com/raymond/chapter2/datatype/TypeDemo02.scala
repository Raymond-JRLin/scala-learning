package com.raymond.chapter2.datatype

object TypeDemo02 {
  def main(args: Array[String]): Unit = {
    println(sayHello)

    var num1 = 1.2 // default is Double
    var num2 = 1.6F
    // num2 = num1 // wrong
    num2 = num1.toFloat

  }

  // 在开发中， 我们有一个方法， 就会异常中断，这时就可以返回 Nothing
  // 即， 当我们把 Nothing 作为返回值， 就是明确说明该方法没有正常返回值
  def sayHello: Nothing = {
    throw new Exception("Exception!")
  }
}
