package ua.intita.qa.homework16;

import ua.intita.qa.homework16.dao.impl.OrderCSV;
import ua.intita.qa.homework16.dao.impl.OrderDaoImpl;
import ua.intita.qa.homework16.entity.Order;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        OrderCSV orderCSV = new OrderCSV();
        Map<Integer, Order> orders = orderCSV.readFromFile("data/order.csv");
        // System.out.println("orders " + orders);
        OrderDaoImpl orderDao = new OrderDaoImpl(orders);
        orderDao.save(new Order(2, "Oleg", "34567834", "Carbonara", 97.8));
        Order toDelete = new Order(4, "Ailina", "+38-067-45612378", "Crudo", 100.0);
        orderDao.deleteById(4);
        List<Order> list = orderDao.findAll();
        for (Order o : list) {
            System.out.println(o);
        }

    }
}
