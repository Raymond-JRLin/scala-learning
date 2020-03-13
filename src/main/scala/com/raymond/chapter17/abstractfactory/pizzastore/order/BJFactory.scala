package com.raymond.chapter17.abstractfactory.pizzastore.order

import com.raymond.chapter17.abstractfactory.pizzastore.pizza.{
  BJCheesePizza,
  BJPepperPizza,
  Pizza
}

// it's a child factory that realizes abstract factory
// if we'd like to order BJ Pizza, just use this factory
class BJFactory extends AbsFactory {
  override def createPizza(pizzaType: String): Pizza = {
    var pizza: Pizza = null
    if (pizzaType.equals("cheese")) {
      pizza = new BJCheesePizza
    } else if (pizzaType.equals("pepper")) {
      pizza = new BJPepperPizza
    }
    pizza
  }
}
