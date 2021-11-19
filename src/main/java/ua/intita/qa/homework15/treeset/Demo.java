package ua.intita.qa.homework15.treeset;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        Set<String> tree = new TreeSet<>();
        tree.add("red");
        tree.add("green");
        tree.add("white");
        tree.add("yellow");
        //System.out.println(tree);
        System.out.println("==============all elements");
        TreeSetClass.iterate(tree);
        Set<String> set2 = new TreeSet<>();
        set2.add("black");
        set2.add("pink");

        Set<String> stringSet = TreeSetClass.addAll(tree,set2);
        System.out.println("==============all string set");
        System.out.println(stringSet);
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("red");
        treeSet.add("white");
        treeSet.add("yellow");

        TreeSet<String> treeSet2 = new TreeSet<>();
        treeSet.add("red");
        treeSet.add("white");
        treeSet.add("yellow");
        System.out.println("==============descending order tree set");
        TreeSetClass.printDesc(treeSet);
        System.out.println("==============first and last element");
        TreeSetClass.getFirstAndLastElement(treeSet);
        System.out.println("==============clone");
        TreeSet<String> setto  = TreeSetClass.cloning(treeSet);
        System.out.println(setto);

        int num = TreeSetClass.getNumberOfElements(treeSet);
        System.out.println("==============number of elements");
        System.out.println(num);
        System.out.println("==============comparing sets");
        System.out.println(TreeSetClass.compare(treeSet, treeSet2));

        TreeSetClass.addNumbers(3);
        TreeSetClass.addNumbers(5);
        TreeSetClass.addNumbers(7);
        TreeSetClass.addNumbers(8);
        TreeSetClass.addNumbers(9);
        System.out.println("==============less 7");
        TreeSetClass.findLessSeven();
        System.out.println("==============greater or equals 7");
        TreeSetClass.getGreaterOrEqualNumber(7);
        System.out.println("==============less 5");
        TreeSetClass.getLesserNumber(5);
        System.out.println("==============greater 5");
        TreeSetClass.getGreaterThan(5);
        System.out.println("==============remove first");
        TreeSetClass.removeFirst(treeSet);
        System.out.println(treeSet);
        System.out.println("==============remove last");
        TreeSetClass.removeLast(treeSet);
        System.out.println(treeSet);
        System.out.println("==============remove element");
        TreeSetClass.removeElement("white",treeSet);



    }
}
