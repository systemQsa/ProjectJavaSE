package ua.intita.qa.homework16.newtask.service;

import ua.intita.qa.homework16.newtask.dao.OrderDao;
import ua.intita.qa.homework16.newtask.entity.Order2;

public class RestaurantService {
    private OrderDao<Order2> orderDao;

    public RestaurantService(OrderDao<Order2> orderDao) {
        this.orderDao = orderDao;
    }
}
