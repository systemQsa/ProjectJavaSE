package ua.intita.qa.homework19.util;

import ua.intita.qa.homework19.entity.Order;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class OrderCSV {

    public static List<Order> readFromTHeFile(String fileName) {
        Path path = Paths.get(fileName);
        List<Order> list = new ArrayList<>();
        int id = 0;
        try {

            List<String> list2 = Files.readAllLines(path);
            for (String s : list2) {
                String[] array = s.split(",");
                Order order = new Order(++id, array[1], array[2], array[3], Double.parseDouble(array[4]));
                list.add(order);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
