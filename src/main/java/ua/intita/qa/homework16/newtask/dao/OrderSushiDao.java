package ua.intita.qa.homework16.newtask.dao;

import ua.intita.qa.homework16.newtask.entity.Order2;

import java.util.Collection;

public class OrderSushiDao implements OrderDao<Order2>{
    @Override
    public Order2 save(Order2 entity) {
        //almost same realization as at pizzaDao
        return null;
    }

    @Override
    public Order2 findById(String id) {
        return null;
    }

    @Override
    public Collection<Order2> findAll() {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}
