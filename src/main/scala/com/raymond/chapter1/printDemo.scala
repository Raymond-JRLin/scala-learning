package com.raymond.chapter1

object printDemo {
  def main(args: Array[String]): Unit = {
    var str1: String = "hello"
    var str2: String = " world!"
    println(str1 + str2)

    var name: String = "Tom"
    var age: Int = 10
    var sal: Float = 10.67F
    var height: Double = 190.15D
    printf("name is %s, age is %d, salary is %.2f height is %.3f", name, age, sal, height)

    println(s"\nname: $name\n age:$age\n salary:$sal")
    println(s"\nname: $name\n age:${age}\n salary:${sal * 10}")
  }

}
