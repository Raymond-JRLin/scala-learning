package com.raymond.chapter17.factorymethod.pizzastore.pizza

abstract class Pizza {
  var name: String = _

  // abstract function, since each kind of pizza has different preparations
  def prepare()

  def cut(): Unit = {
    println(this.name + " cutting ... ")
  }

  def bake(): Unit = {
    println(this.name + " baking ...")
  }

  def box(): Unit = {
    println(this.name + " boxing ... ")
  }
}
