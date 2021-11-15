package ua.intita.qa.homework14.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo2 {
    public static void main(String[] args) {
        LinkedList<String> list = LinkedListDemo.append("red");
        list = LinkedListDemo.append("green");
        list = LinkedListDemo.append("yellow");
        list = LinkedListDemo.append("black");
        list = LinkedListDemo.append("white");
        list = LinkedListDemo.append("pink");
        list = LinkedListDemo.append("grey");

        LinkedListDemo.iterate();
        System.out.println("================= iterate from");
        LinkedListDemo.iterateFrom(list, 1);
        System.out.println("================= iterate reverse");
        LinkedListDemo.iterateReverse(list);
        System.out.println(list);
        System.out.println("================= insert to list at pos");
        LinkedListDemo.insert(1, list, "white");

        LinkedListDemo.addFirstAndLast(list, "pink", "brown");

        LinkedListDemo.addFront(list, "front");

        LinkedListDemo.addLast(list, "last");

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("one");
        list2.add("two");
        list2.add("three");
        LinkedListDemo.addSomeElementsAtSpecificPosition(list, 2,"element");
        System.out.println("================= first/last occurrence");
        LinkedListDemo.getOccurrenceFirstLast(list);
        System.out.println("================= list and positions");
        LinkedListDemo.displayListAndPositions(list);
        System.out.println("================= remove element");
        LinkedListDemo.removeElement(list, 0);
        System.out.println(list);
        System.out.println("=================remove first and last");
        LinkedListDemo.removeFirstAndLast(list);
        System.out.println(list);
        System.out.println("================= swap elements");
        LinkedListDemo.swapElements(list, 2, 3);
        System.out.println(list);
        System.out.println("=================shuffle");
        LinkedListDemo.shuffle(list);
        System.out.println(list);
        System.out.println("================= join");
        LinkedList<String> joinList = LinkedListDemo.join(list, list2);
        System.out.println(joinList);
        System.out.println("=================clone list");
        LinkedList<String> cloneList = LinkedListDemo.cloneList(list);
        System.out.println(cloneList);
        System.out.println("=================poll first");
        System.out.println(LinkedListDemo.pollFirstElement(list));
        System.out.println("================= peek first");
        System.out.println(LinkedListDemo.peekFirstElement(list));
        System.out.println("=================");
        System.out.println(LinkedListDemo.peekLastElement(list));
        System.out.println("================= peek last");
        System.out.println("contains " + LinkedListDemo.containsElement(list, "red"));
        System.out.println("================= convert");
        ArrayList<String> arrayList = LinkedListDemo.convert(list);
        System.out.println(arrayList);
        System.out.println("=================compare");
        System.out.println(LinkedListDemo.compareLists(list, list2));
        System.out.println("=================is empty");
        System.out.println(LinkedListDemo.isEmpty(list));
        System.out.println("================= replace element");

        LinkedList<String> replaced = LinkedListDemo.replaceElement(list, 2, "replaced");
        System.out.println(replaced);
        System.out.println("================= remove all");
        LinkedListDemo.removeAll(list);
        System.out.println(list);
    }
}
