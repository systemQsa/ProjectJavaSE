package ua.intita.qa.homework19.serial;

import ua.intita.qa.homework19.entity.Order;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class SerialObject {

    public void serialListOfOrders(List<Order> list, String fileName) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(list);
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
