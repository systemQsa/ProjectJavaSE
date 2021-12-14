package ua.intita.qa.homework16.newtask.controller;

import ua.intita.qa.homework16.newtask.dao.OrderDao;
import ua.intita.qa.homework16.newtask.dao.OrderSushiDao;
import ua.intita.qa.homework16.newtask.service.CafeService;
import ua.intita.qa.homework16.newtask.service.RestaurantService;

public class OrderControllerSushi {
    private CafeService cafeService;
    private RestaurantService restaurantService;

    public OrderControllerSushi() {
        OrderDao orderDao = new OrderSushiDao();
        cafeService = new CafeService(orderDao);
        restaurantService = new RestaurantService(orderDao);
    }
}
