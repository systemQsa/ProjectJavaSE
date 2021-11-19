package ua.intita.qa.homework15.hashset;

import java.util.*;

public class HashSetClass {

    private static Set<String> lists = new HashSet<>();

    public static Set<String> append(String color) {
        lists.add(color);
        return lists;
    }

    public static void iterate() {
        for (String color : lists) {
            System.out.println(color);
        }
    }

    public static int getNumberOfHashSet() {
        return lists.size();
    }

    public static void clear() {
        if (lists.isEmpty()) {
            return;
        }
        lists.clear();
    }

    public static boolean isEmptyOrNot(Set<String> set) {
        return set.isEmpty();
    }

    public static Set<String> cloning(Set<String> set1) {
        Set<String> set2 = new HashSet<>();
        set2.addAll(set1);
        return set2;
    }

    public static String[] convert(Set<String> set) {
        String[] res = new String[set.size()];
        int i = 0;
        for (String color : set) {
            res[i++] = color;
        }
        return res;

    }

    public static TreeSet<String> convertToTreeSet(Set<String> set) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.addAll(set);
        return treeSet;
    }

    public static ArrayList<String> convertArrList(Set<String> set) {
        ArrayList<String> list = new ArrayList<>(set);
        return list;

    }

    public static List<String> convertList(Set<String> set) {
        List<String> list = new ArrayList<>(set);
        return list;
    }

    public static boolean compare(Set<String> set1, Set<String> set2) {
        return set1.equals(set2);
    }

    public static Set<String> compareSets(Set<String> set1, Set<String> set2) {
        Set<String> set3 = new HashSet<>();
        set3.addAll(set1);
        for (String color : set2) {
            if (!set3.contains(color)) {
                set3.add(color);
            }
        }
        return set3;
    }

    public static void removeAllSet(Set<String> set) {
        set.clear();
    }

}
