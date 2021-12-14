package ua.intita.qa.homework16.newtask.dao;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import ua.intita.qa.homework16.newtask.entity.Order2;

import java.util.*;

@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class OrderPizzaDao implements OrderDao<Order2> {
    private static final Map<String, Order2> orders = new HashMap<>();


    @Override
    public Order2 save(Order2 entity) {
        orders.put(entity.getOrderId(), entity);
        return entity;
    }

    @Override
    public Order2 findById(String id) {
        for (Map.Entry<String, Order2> entry : orders.entrySet()) {
            if (entry.getKey().equals(id)) {
                return entry.getValue();
            }
        }
        return null;
    }

    @Override
    public Collection<Order2> findAll() {
        Collection<Order2> collect = new HashSet<>();
        for (Map.Entry<String, Order2> entry : orders.entrySet()) {
            collect.add(entry.getValue());
        }
        return collect;
    }

    @Override
    public void delete(String id) {
        Iterator iterator = orders.keySet().iterator();
        while (iterator.hasNext()){
            if (iterator.next().equals(id)){
                iterator.remove();
            }
        }
    }
}
