package com.raymond.chapter17.abstractfactory.pizzastore.pizza

class BJPepperPizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "BeijingPepperPizza"
    println(this.name + " preparing ...")
  }
}
