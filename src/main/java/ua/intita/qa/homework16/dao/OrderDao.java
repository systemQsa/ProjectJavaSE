package ua.intita.qa.homework16.dao;

import ua.intita.qa.homework16.entity.Order;

import java.util.List;


public interface OrderDao {

    Order save(Order order);

    Order findOrderById(int id);

    List<Order> findAll();

    void delete(Order order);

    void deleteById(int id);
}
