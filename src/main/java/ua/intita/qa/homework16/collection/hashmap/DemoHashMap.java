package ua.intita.qa.homework16.collection.hashmap;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {
    public Map<Integer, String> associateMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Sasha");
        map.put(2, "Java");
        return map;
    }

    public int size(Map<Integer, String> map) {
        return map.size();
    }

    public Map<Integer, String> copyMap(Map<Integer, String> map) {
        return new HashMap<>(map);
    }

    public void remove(Map<Integer, String> map) {
        map.clear();
    }

    public boolean contains(String element, Map<Integer, String> map) {
        return map.containsValue(element);
    }

    public boolean contains(Integer element, Map<Integer, String> map) {
        return map.containsKey(element);
    }

    public boolean contains(Integer key, String value, Map<Integer, String> map) {
        if (map == null) {
            return false;
        }
        return map.containsKey(key) && map.containsValue(value);
    }

    public void setView(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("key = " + entry.getKey() + " value = " + entry.getValue());
        }
    }

    public String getValue(Integer key, Map<Integer, String> map) {
        return map.get(key);
    }

    public void setViewKeys(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("key = " + entry.getKey());
        }
    }

    public void setViewValues(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("value = " + entry.getValue());
        }
    }

}
