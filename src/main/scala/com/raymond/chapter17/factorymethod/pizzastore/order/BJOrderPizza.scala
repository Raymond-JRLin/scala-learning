package com.raymond.chapter17.factorymethod.pizzastore.order

import com.raymond.chapter17.factorymethod.pizzastore.pizza.{
  BJCheesePizza,
  BJPepperPizza,
  Pizza
}

class BJOrderPizza extends OrderPizza {
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
