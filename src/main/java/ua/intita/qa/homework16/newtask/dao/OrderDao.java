package ua.intita.qa.homework16.newtask.dao;

import ua.intita.qa.homework16.newtask.entity.Entity;

import java.util.Collection;

public interface OrderDao<T extends Entity> {
    T save(T entity);

    T findById(String id);

    Collection<T> findAll();

    void delete(String id);
}
