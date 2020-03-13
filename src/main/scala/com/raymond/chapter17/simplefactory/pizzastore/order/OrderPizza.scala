package com.raymond.chapter17.simplefactory.pizzastore.order

import com.raymond.chapter17.simplefactory.pizzastore.pizza.Pizza

import scala.io.StdIn
import util.control.Breaks._

class OrderPizza {
  var orderType: String = _
  var pizza: Pizza = _
  breakable {
    do {
      println("Please input the kind of pizza, with Simple Factory pattern")
      orderType = StdIn.readLine()
      pizza = SimpleFactory.createPizza(orderType)
      if (pizza == null) {
        break()
      }
      this.pizza.prepare()
      this.pizza.bake()
      this.pizza.cut()
      this.pizza.box()
    } while (true)
  }
}
