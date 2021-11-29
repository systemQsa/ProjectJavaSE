package ua.intita.qa.homework16.collection.treemap;

import java.util.*;

public class DemoTreeMap {
    public TreeMap<Integer, String> associate() {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(4, "sasha");
        map.put(1, "java");
        map.put(3, "spring");
        map.put(2, "boot");
        return map;
    }

    public TreeMap<Integer, String> copy(TreeMap<Integer, String> map) {
        return new TreeMap<>(map);
    }

    public void getKey(TreeMap<Integer, String> map, Integer key) {
        if (map.containsKey(key)) {
            System.out.println("map contains = " + key);
        }
        System.out.println("map does not contain key");
    }

    public boolean getValue(TreeMap<Integer, String> map, String val) {
        return map.containsValue(val);
    }

    public Set<Integer> keySey(TreeMap<Integer, String> map) {
        return map.keySet();
    }

    public void delete(TreeMap<Integer, String> map) {
        map.clear();
    }

    public TreeMap<Integer, String> sort(TreeMap<Integer, String> map) {
        return new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
    }

    public void greatestAndLeasKey(TreeMap<Integer, String> map) {
        System.out.println("greatest =" + map.firstEntry());
        System.out.println("least = " + map.lastEntry());
    }

    public void reverseTree(TreeMap<Integer, String> map) {
        System.out.println(map.descendingKeySet());
    }

    public void greatestKeyLessThanOrEqualToGiven(TreeMap<Integer, String> map, Integer key) {
        System.out.println(map.floorEntry(key));
    }

    public void getPortionOfMap(TreeMap<Integer, String> map, Integer key) {
        System.out.println(map.headMap(key));
    }

    public void getPortionKeyLessOrEqualGivenKey(TreeMap<Integer, String> map, Integer key) {
        System.out.println(map.headMap(key, true));
    }

    public void greaterGivenKey(TreeMap<Integer, String> map, Integer key) {
        System.out.println(map.higherEntry(key));
    }

    public void greaterKeyLessThanGivenKey(TreeMap<Integer, String> map, Integer key) {
        System.out.println(map.lowerKey(key));
    }

    public void navigableView(TreeMap<Integer, String> map) {
        System.out.println(map.navigableKeySet());
    }

    public Map.Entry<Integer, String> removeAndGetKeyLessValue(TreeMap<Integer, String> map) {
        return map.pollFirstEntry();
    }

    public Map.Entry<Integer, String> removeAndGetKeyGreatestValue(TreeMap<Integer, String> map) {
        return map.pollLastEntry();
    }

    public Map<Integer, String> keysRangeMap(TreeMap<Integer, String> map, Integer start, Integer end) {
        Map<Integer, String> map1;
        map1 = map.subMap(start, end);
        return map1;
    }

    public Map<Integer, String> mapKeysGreaterTan(TreeMap<Integer, String> map, Integer key) {
        Map<Integer, String> map1;
        map1 = map.tailMap(key, false);
        return map1;
    }

    public void keyGreaterThanOrEqual(TreeMap<Integer, String> map, Integer key) {
        System.out.println(map.ceilingEntry(key));
    }

    public void getTheLeastKeyGreaterOrEqualGiven(TreeMap<Integer, String> map, Integer key) {
        System.out.println(map.ceilingKey(key));
    }


}
