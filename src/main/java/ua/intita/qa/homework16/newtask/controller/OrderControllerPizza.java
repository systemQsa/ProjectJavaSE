package ua.intita.qa.homework16.newtask.controller;

import ua.intita.qa.homework16.newtask.dao.OrderDao;
import ua.intita.qa.homework16.newtask.dao.OrderPizzaDao;
import ua.intita.qa.homework16.newtask.entity.Order2;
import ua.intita.qa.homework16.newtask.service.CafeService;
import ua.intita.qa.homework16.newtask.service.RestaurantService;

public class OrderControllerPizza {
    private CafeService cafeService;
    private RestaurantService restaurantService;

    public OrderControllerPizza() {
        OrderDao<Order2> orderDao = new OrderPizzaDao();
        cafeService = new CafeService(orderDao);
        restaurantService = new RestaurantService(orderDao);
    }
}
