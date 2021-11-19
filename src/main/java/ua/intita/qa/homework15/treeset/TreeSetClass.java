package ua.intita.qa.homework15.treeset;


import java.util.Set;
import java.util.TreeSet;

public class TreeSetClass {
    private static Set<String> treeSet = new TreeSet<String>();
    private static TreeSet<Integer> tree = new TreeSet<>();


    public static void addNumbers(int x) {
        tree.add(x);
    }

    public static void iterate(Set<String>treeSet) {
        for (String color : treeSet) {
            System.out.println(color);
        }
    }

    public static Set<String> addAll(Set<String> treeSet1,Set<String> treeSet2) {
        treeSet1.addAll(treeSet2);
        return treeSet1;
    }

    public static void printDesc(TreeSet<String> treeSet) {
        TreeSet<String> tree = (TreeSet<String>) treeSet.descendingSet();
        System.out.println(tree);

    }

    public static void getFirstAndLastElement(TreeSet<String> treeSet) {
        System.out.println("first element " + treeSet.first());
        System.out.println("last element " + treeSet.last());

    }

    public static TreeSet<String> cloning(TreeSet<String> treeSet) {
        TreeSet<String> set = new TreeSet<>();
        set.addAll(treeSet);
        return set;
    }

    public static int getNumberOfElements(TreeSet<String> treeSet) {
        return treeSet.size();
    }

    public static boolean compare(TreeSet<String> treeSet1, TreeSet<String> treeSet2) {
        return treeSet1.equals(treeSet2);
    }

    public static void findLessSeven() {
        for (Integer x : tree) {
            if (x < 7) {
                System.out.println(x);
            }
        }
    }

    public static void getGreaterOrEqualNumber(int x) {
        for (Integer num : tree) {
            if (num >= x) {
                System.out.println(num);
            }
        }
    }

    public static void getLessNumbers(int x) {
        for (Integer num : tree) {
            if (num <= x) {
                System.out.println(num);
            }
        }
    }

    public static void getGreaterThan(int x) {
        for (Integer num : tree) {
            if (num > x) {
                System.out.println(num);
            }
        }
    }

    public static void getLesserNumber(int x) {
        for (Integer num : tree) {
            if (num < x) {
                System.out.println(num);
            }
        }
    }

    public static String removeFirst(TreeSet<String> set) {
        return set.pollFirst();
    }

    public static String removeLast(TreeSet<String> set) {
        return set.pollLast();

    }

    public static void removeElement(String color, TreeSet<String> set) {
        set.remove(color);
    }

}
