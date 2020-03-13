package com.raymond.chapter17.factorymethod.pizzastore.order

import com.raymond.chapter17.factorymethod.pizzastore.pizza.Pizza

import scala.io.StdIn
import scala.util.control.Breaks._

// abstract class
abstract class OrderPizza {
  var orderType: String = null
  var pizza: Pizza = null
  breakable {
    do {
      println("Please input the kind of pizza, with Factory Method pattern")
      orderType = StdIn.readLine()
      pizza = createPizza(orderType)
      if (pizza == null) {
        break()
      }
      pizza.prepare()
      pizza.bake()
      pizza.cut()
      pizza.box()
    } while (true)
  }

  // abstract method, let children class to realize Order
  def createPizza(pizzaType: String): Pizza
}
