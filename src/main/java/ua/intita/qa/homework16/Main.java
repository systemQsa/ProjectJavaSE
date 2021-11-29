package ua.intita.qa.homework16;

import ua.intita.qa.homework16.dao.impl.OrderDao;
import ua.intita.qa.homework16.entity.Order;
import ua.intita.qa.homework16.entity.Pizza;
import ua.intita.qa.homework16.methods.ArrayListMethods;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayListMethods methods = new ArrayListMethods();
        String str = "sasha anna oleg java hello hello sasha";

        ArrayList<String> list = methods.fromStringToArrList(str);
        System.out.println(list);

        methods.repeatsOfWords(list);


        List<Pizza> pizzas = new ArrayList<>();
        Pizza pizza1 = new Pizza("margarita", 56.6);
        Pizza pizza2 = new Pizza("carbonara", 80.9);
        Pizza pizza3 = new Pizza("cheezy", 78.7);
        pizzas.add(pizza1);
        pizzas.add(pizza2);
        pizzas.add(pizza3);

        OrderDao orderDao = new OrderDao(pizzas);
        Order order = orderDao.orderPizzas("carbonara", "margarita");
        System.out.println(order.getPizza());
        System.out.println(orderDao.getReceipt());

        OrderDao order2 = new OrderDao(pizzas);
        order2.orderPizza("cheezy");
        System.out.println(order2.getReceipt());
    }
}
