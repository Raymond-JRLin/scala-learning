package com.raymond.chapter17.abstractfactory.pizzastore.order

import com.raymond.chapter17.abstractfactory.pizzastore.pizza.Pizza

import scala.io.StdIn
import scala.util.control.Breaks._

// 1. received a child factory instance, realize by this factory's functions
class OrderPizza {
  var absFactory: AbsFactory = _

  def this(absFactory: AbsFactory) {
    // polymorphism
    this
    breakable {
      var orderType: String = null
      var pizza: Pizza = null
      do {
        println("Please input the kind of pizza, with Abstract Method pattern")
        orderType = StdIn.readLine()
        pizza = absFactory.createPizza(orderType)
        if (pizza == null) {
          break()
        }
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
      } while (true)
    }
  }
}
