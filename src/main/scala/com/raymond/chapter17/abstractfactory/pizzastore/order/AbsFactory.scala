package com.raymond.chapter17.abstractfactory.pizzastore.order

import com.raymond.chapter17.abstractfactory.pizzastore.pizza.Pizza

trait AbsFactory {
  def createPizza(pizzaType: String): Pizza
}
