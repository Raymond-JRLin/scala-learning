package com.raymond.chapter17.factorymethod.pizzastore.pizza

class BJCheesePizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "BeijingCheesePizza"
    println(this.name + " preparing ...")
  }
}
