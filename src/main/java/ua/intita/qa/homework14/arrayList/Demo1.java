package ua.intita.qa.homework14.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list = ArrayListDemo.add("red");
        list = ArrayListDemo.add("green");
        list = ArrayListDemo.add("black");
        list = ArrayListDemo.add("white");
        System.out.println("======================iterate");

        ArrayListDemo.iterate();
        System.out.println("======================set first");
        ArrayListDemo.setFirst("blue");
        ArrayListDemo.iterate();
        System.out.println("======================get element");
        System.out.println(ArrayListDemo.getElement(0));
        ArrayListDemo.iterate();
        System.out.println("======================update");
        ArrayListDemo.update("green", "yellow");
        ArrayListDemo.iterate();
        System.out.println("======================remove third");
        String color = ArrayListDemo.removeThird(list);
        System.out.println(color);
        ArrayListDemo.iterate();
        System.out.println("======================search element");
        String color1 = ArrayListDemo.searchElement("yellow");
        System.out.println(color1);
        System.out.println("======================sort array");
        List<String> list1 = ArrayListDemo.sortArrayList();
        System.out.println(list1);
        System.out.println("======================copy array");
        List<String> listCopy = ArrayListDemo.copyArrayLIst(list1);
        System.out.println(listCopy);
        System.out.println("======================shuffle");
        List<String> shuffleLIst = ArrayListDemo.shuffleList(list1);
        System.out.println(shuffleLIst);
        System.out.println("======================reverse");
        List<String> reverseList = ArrayListDemo.reverseList(list1);
        System.out.println(reverseList);
        System.out.println("======================sublist");
        List<String> subList = ArrayListDemo.subList(list1, 1, 2);
        System.out.println(subList);
        System.out.println("======================compare");

        System.out.println(ArrayListDemo.compare(list1, listCopy));
        System.out.println("======================swap");
        List<String> swapList = ArrayListDemo.swap(list1, 1, 2);
        System.out.println(swapList);
        System.out.println("======================join");
        List<String> joinList = ArrayListDemo.join(list1, listCopy);
        System.out.println(joinList);
        System.out.println("======================clone");
        List<String> cloneList = ArrayListDemo.cloneList(list1);
        System.out.println(cloneList);
        System.out.println("======================is empty");
        System.out.println(ArrayListDemo.testIfEmptyList(list1));
        System.out.println("======================");
        ArrayList<String> arr = new ArrayList<>(40);
        arr.add("red");
        arr.add("green");
        arr.add("blue");
        ArrayListDemo.trimCapacity(arr);

        ArrayListDemo.ensureCapacity(arr, 10);
        System.out.println("======================replace element");
        ArrayList<String> arr2 = ArrayListDemo.replaceElement(arr, "pink");
        System.out.println(arr2);
        System.out.println("======================printAllElementsFromPosition");
        ArrayListDemo.printAllElementsFromPosition(arr, 1, 2);
        System.out.println("======================clear");
        ArrayListDemo.clearList(list1);
        System.out.println(list);
    }
}
