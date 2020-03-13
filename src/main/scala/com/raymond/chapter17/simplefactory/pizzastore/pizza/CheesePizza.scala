package com.raymond.chapter17.simplefactory.pizzastore.pizza

class CheesePizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "CheesePizza"
    println(this.name + " preparing ...")
  }
}
