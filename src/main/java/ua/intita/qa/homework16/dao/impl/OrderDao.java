package ua.intita.qa.homework16.dao.impl;

import ua.intita.qa.homework16.dao.Dao;
import ua.intita.qa.homework16.entity.Order;
import ua.intita.qa.homework16.entity.Pizza;

import java.util.ArrayList;
import java.util.List;

public class OrderDao implements Dao {

    private final List<Pizza> list;
    private final Order order = new Order();
    private final List<Pizza> orders = new ArrayList<>();

    public OrderDao(List<Pizza> list) {
        this.list = list;
    }

    public List<Pizza> getList() {
        return list;
    }

    @Override
    public Order orderPizza(String name) {
        for (Pizza element : list) {
            if (element.getName().equals(name)) {
                orders.add(element);
            }
        }
        order.setPizza(orders);
        return order;
    }

    @Override
    public Order orderPizzas(String... name) {
        for (Pizza pizza : list) {
            for (String element : name) {
                if (pizza.getName().equals(element)) {
                    orders.add(pizza);
                }
            }

        }
        order.setPizza(orders);
        return order;
    }

    @Override
    public double getReceipt() {
        List<Pizza> list = order.getPizza();
        double receipt = 0;
        for (Pizza pizza : list) {
            receipt += pizza.getPrice();
        }
        return receipt;
    }
}
