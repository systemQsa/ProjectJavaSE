package ua.intita.qa.homework16.collection.hashmap;

import java.util.HashMap;
import java.util.Map;

public class DemoMain {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "alex");
        map.put(2, "java");
        map.put(3, "spring");

        DemoHashMap demoHashMap = new DemoHashMap();
        Map<Integer, String> map1 = demoHashMap.associateMap();
        for (Map.Entry<Integer, String> val : map1.entrySet()) {
            System.out.println(val.getKey() + " == " + val.getValue());
        }

        demoHashMap.setViewKeys(map);
        demoHashMap.setViewValues(map);
        demoHashMap.setView(map);

        System.out.println(demoHashMap.size(map));

        Map<Integer, String> copyMap = demoHashMap.copyMap(map);
        System.out.println(demoHashMap.contains("alex", map));
        System.out.println(demoHashMap.contains(1, map));
        System.out.println(demoHashMap.contains(2, "java", map));
        System.out.println(demoHashMap.getValue(3, map));
        demoHashMap.remove(map);
    }
}
