package ua.intita.qa.homework19.serial;

import ua.intita.qa.homework19.entity.Order;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class DeserialObject {

    public List<Order> deserialListOfOrders(String fileName) {
        List<Order> list = null;
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(fileName))) {
            list = (List<Order>) input.readObject();
        } catch (ClassNotFoundException | IOException e) {
            e.getMessage();
        }

        for (Order o : list) {
            System.out.println("DATA ==> " + o);
        }
        return list;
    }
}
