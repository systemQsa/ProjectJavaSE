package ua.intita.qa.homework16.dao.impl;

import ua.intita.qa.homework16.entity.Order;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class OrderCSV {

    //returns all data from the csv file
    public Map<Integer, Order> readFromFile(String fileName) {
        Order order;
        Map<Integer, Order> orders = new HashMap<>();
        String line = "";
        int id = 1;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while ((line = reader.readLine()) != null) {
                String[] arr = line.split(",");
                //System.out.println("order = " +arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4]);
                order = new Order(id, arr[1], arr[2], arr[3], Double.parseDouble(arr[4]));
                orders.put(id++, order);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return orders;
    }
}
