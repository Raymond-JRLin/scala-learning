package com.raymond.chapter17.simplefactory.pizzastore.pizza

class GreekPizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "GreekPizza"
    println(this.name + " preparing ...")
  }
}
