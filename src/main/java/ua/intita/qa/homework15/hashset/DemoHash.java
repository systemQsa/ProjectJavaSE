package ua.intita.qa.homework15.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoHash {
    public static void main(String[] args) {
        HashSetClass.append("red");
        HashSetClass.append("green");
        HashSetClass.append("blue");
        Set<String> set = HashSetClass.append("white");
        System.out.println("============================iterate");
        HashSetClass.iterate();
        System.out.println("============================number of elements");
        System.out.println(HashSetClass.getNumberOfHashSet());

        System.out.println("============================is empty or not");
        System.out.println(HashSetClass.isEmptyOrNot(set));

        Set<String> set2 = HashSetClass.cloning(set);
        System.out.println("============================clone");
        System.out.println(set2);

        String[] arr = HashSetClass.convert(set);
        System.out.println("============================convert to array");
        System.out.println(arr);

        TreeSet<String> tree = HashSetClass.convertToTreeSet(set);
        System.out.println("============================convert to tree set");
        System.out.println(tree);

        ArrayList<String> arrayList = HashSetClass.convertArrList(set);
        System.out.println("============================convert to array list");
        System.out.println(arrayList);
        System.out.println("============================compare two sets");
        System.out.println(HashSetClass.compare(set, set2));

        Set<String> set3 = new HashSet<>();
        set3.add("yellow");
        set3.add("red");
        set3.add("pink");

        Set<String> res = HashSetClass.compareSets(set, set3);
        System.out.println("==================compare sets return new one");
        System.out.println(res);
        System.out.println("============================remove all set");
        HashSetClass.removeAllSet(set);
        System.out.println(set);
    }
}
