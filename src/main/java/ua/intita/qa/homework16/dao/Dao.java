package ua.intita.qa.homework16.dao;

import ua.intita.qa.homework16.entity.Order;


public interface Dao {
    Order orderPizza(String name);

    Order orderPizzas(String... name);

    double getReceipt();
}
