package ua.intita.qa.homework16.dao.impl;

import ua.intita.qa.homework16.dao.OrderDao;
import ua.intita.qa.homework16.entity.Order;

import java.util.*;

public class OrderDaoImpl implements OrderDao {

    private final Map<Integer, Order> orders = new HashMap<>();

    public OrderDaoImpl(Map<Integer, Order> newOrders) {
        orders.putAll(newOrders);
    }

    //after all data from the file been added. The separate order can be added to the rest orders or just add one order to the map
    @Override
    public Order save(Order order) {
        int counter = 0;
        for (Map.Entry<Integer, Order> entry : orders.entrySet()) {
            counter++;
        }
        orders.put(counter + 1, order);
        return order;
    }

    @Override
    public Order findOrderById(int id) {
        Order order = null;
        for (Map.Entry<Integer, Order> entry : orders.entrySet()) {
            if (entry.getKey() == id) {
                order = entry.getValue();
            }
        }
        return order;
    }

    @Override
    public List<Order> findAll() {
        List<Order> list = new ArrayList<>();
        for (Map.Entry<Integer, Order> entry : orders.entrySet()) {
            list.add(entry.getValue());
        }
        return list;
    }

    @Override
    public void delete(Order order) {
        Iterator<Order> iterator = orders.values().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(order)) {
                iterator.remove();
            }
        }
    }

    @Override
    public void deleteById(int id) {
        Iterator<Integer> iterator = orders.keySet().iterator();
        while (iterator.hasNext()) {
            if (Objects.equals(iterator.next(), id)) {
                iterator.remove();
            }
        }
    }
}
