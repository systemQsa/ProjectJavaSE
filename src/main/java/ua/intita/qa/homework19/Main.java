package ua.intita.qa.homework19;

import ua.intita.qa.homework19.entity.Order;
import ua.intita.qa.homework19.serial.DeserialObject;
import ua.intita.qa.homework19.serial.SerialObject;
import ua.intita.qa.homework19.util.OrderCSV;

import java.util.List;

public class Main {
    private static final String FILE_PATH = "data/entity.dat";
    public static void main(String[] args) {
        List<Order> list = OrderCSV.readFromTHeFile("data/order.csv");
        SerialObject serialObject = new SerialObject();
        serialObject.serialListOfOrders(list,FILE_PATH);
        DeserialObject deserialObject = new DeserialObject();
        deserialObject.deserialListOfOrders(FILE_PATH);
    }
}
