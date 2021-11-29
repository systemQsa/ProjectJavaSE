package ua.intita.qa.homework16.collection.treemap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class DemoMain {
    public static void main(String[] args) {
        DemoTreeMap demoTreeMap = new DemoTreeMap();
        demoTreeMap.associate();
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(4, "Alexa");
        map.put(2, "Java");
        map.put(3, "Spring");
        map.put(1, "Tomcat");
        map.put(5, "Duke");
        map.put(7, "Music");
        map.put(6, "Dance");
        TreeMap<Integer, String> copy = demoTreeMap.copy(map);
        demoTreeMap.getKey(map, 2);
        System.out.println(demoTreeMap.getValue(map, "Spring"));
        Set<Integer> set = demoTreeMap.keySey(map);
        System.out.println(set);
        TreeMap<Integer, String> sortedMap = demoTreeMap.sort(map);
        System.out.println(sortedMap);
        demoTreeMap.greatestAndLeasKey(map);
        demoTreeMap.reverseTree(map);
        demoTreeMap.greatestKeyLessThanOrEqualToGiven(map, 2);
        demoTreeMap.getPortionOfMap(map, 2);
        demoTreeMap.getPortionKeyLessOrEqualGivenKey(map, 3);
        demoTreeMap.greaterGivenKey(map, 2);
        demoTreeMap.greaterKeyLessThanGivenKey(map, 3);
        demoTreeMap.navigableView(map);
        Map.Entry<Integer, String> keyLess = demoTreeMap.removeAndGetKeyLessValue(map);
        System.out.println(keyLess);
        Map.Entry<Integer, String> keyGreater = demoTreeMap.removeAndGetKeyGreatestValue(map);
        System.out.println(keyGreater);
        Map<Integer, String> keysRangeMap = demoTreeMap.keysRangeMap(map, 1, 3);
        System.out.println(keysRangeMap);
        Map<Integer, String> mapKeysGreaterTan = demoTreeMap.mapKeysGreaterTan(map, 2);
        System.out.println(mapKeysGreaterTan);
        demoTreeMap.keyGreaterThanOrEqual(map, 2);
        demoTreeMap.getTheLeastKeyGreaterOrEqualGiven(map, 1);

    }
}
