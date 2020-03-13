package com.raymond.chapter17.abstractfactory.pizzastore.order

object PizzaStore {
  def main(args: Array[String]): Unit = {
    new OrderPizza(new BJFactory)
  }
}
