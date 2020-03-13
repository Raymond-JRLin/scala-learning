package com.raymond.chapter17.simplefactory.pizzastore.pizza

class PepperPizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "PepperPizza"
    println(this.name + " preparing ...")
  }
}
