package com.raymond.chapter17.simplefactory.pizzastore.order

import com.raymond.chapter17.simplefactory.pizzastore.pizza.{
  CheesePizza,
  GreekPizza,
  PepperPizza,
  Pizza
}

object SimpleFactory {

  // Pizza creation
  def createPizza(pizzaType: String): Pizza = {
    var pizza: Pizza = null
    if (pizzaType.equals("greek")) {
      // create pizza
      pizza = new GreekPizza
    } else if (pizzaType.equals("pepper")) {
      // create pizza
      pizza = new PepperPizza
    } else if (pizzaType.equals("cheese")) {
      pizza = new CheesePizza
    }
    pizza
  }
}
