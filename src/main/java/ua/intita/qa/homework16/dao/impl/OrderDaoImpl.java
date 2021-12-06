package ua.intita.qa.homework16.dao.impl;

import ua.intita.qa.homework16.dao.OrderDao;
import ua.intita.qa.homework16.entity.Order;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderDaoImpl implements OrderDao {

    private final Map<Integer, Order> orders = new HashMap<>();

    public OrderDaoImpl() {
//        orders.putAll(); todo
    }

    @Override
    public Order save(Order order) {
        return null; // todo
    }

    @Override
    public Order findOrderById(int id) {
        return null; //todo
    }

    @Override
    public List<Order> findAll() {
        return null; // todo
    }

    @Override
    public void delete(Order order) {
        // todo
    }

    @Override
    public void deleteById(int id) {
        // todo
    }
}
