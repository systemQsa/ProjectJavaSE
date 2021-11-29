package ua.intita.qa.homework16.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayListMethods {

    public ArrayList<String> fromStringToArrList(String str) {
        ArrayList<String> list = new ArrayList<>();
        String[] arr = str.split(" ");
        list.addAll(Arrays.asList(arr));
        return list;
    }

    public Map<String, Integer> repeatsOfWords(ArrayList<String> list) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : list) {
            Integer num = map.get(s);
            map.put(s, (num == null) ? 1 : num + 1);
        }
        for (Map.Entry<String, Integer> word : map.entrySet()) {
            System.out.println(word.getKey() + " == " + word.getValue());
        }
        return map;
    }
}
