package ua.intita.qa.homework14.arrayList;

import java.util.*;

public class ArrayListDemo {
     private  static List<String> list = new ArrayList<>();

    public static List add(String color){
        list.add(color);
        return list;
    }

    public static void iterate(){
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static void setFirst(String color){
        if (list == null){
            list = add(color);
        }
        list.add(0,color);

    }

    public static String getElement(int index){
        if (index >= list.size() || index < 0){
            throw new ArrayIndexOutOfBoundsException();
        }
       return list.get(index);
    }

    public static void update(String oldElement,String newElement){
        int index = -1;
        index = list.indexOf(oldElement);
        list.set(index,newElement);
        if (index == -1){
            throw new NoSuchElementException();
        }
    }

    public static String removeThird(List<String> list){
        String element = list.remove(3);
        if (element == null){
            throw new IndexOutOfBoundsException("There is no third element in the array list");
        }
        return element;
    }

    public static String searchElement(String element){
        boolean response = list.contains(element);
        if (response){
            return list.get(list.indexOf(element));
        }
        return null;
    }

    public static List<String> sortArrayList(){
        Collections.sort(list);
        return list;
    }

    public static List<String> copyArrayLIst(List<String> list){
        List<String> list2 = new ArrayList<>();
       list2.addAll(list);
       return list2;
    }

    public static List<String> shuffleList(List<String> list){
        Collections.shuffle(list);
        return list;
    }

    public static List<String> reverseList(List<String> list){
        Collections.reverse(list);
        return list;
    }

    public static List<String> subList(List<String> list,int from, int to){
        return list.subList(from, to);
    }

    public static boolean compare(List<String> list1, List<String> list2){
        return list1.equals(list2);
    }

    public static List<String>  swap(List<String> list,int index1, int index2){
        Collections.swap(list,index1,index2);
        return list;
    }

    public static List<String> join(List<String> list1, List<String> list2){
        List<String> list3 = new ArrayList<>();
        list3.addAll(list1);
        list3.addAll(list2);
        return list3;
    }

    public static List<String> cloneList(List<String> list1){
        List<String> list2 = new ArrayList<>();
        list2.addAll(list1);
        return list2;
    }

    public static void clearList(List<String> list1){
        if (list1.isEmpty()){
            return;
        }
        list1.clear();
    }

    public static boolean testIfEmptyList(List<String> list1){
        return list1.isEmpty();
    }

    public static void trimCapacity(ArrayList<String>list1){
        list1.trimToSize();
    }

    public static void ensureCapacity(ArrayList<String>list1,int capacity){
        list1.ensureCapacity(capacity);
    }

    public static ArrayList<String> replaceElement(ArrayList<String> list1,String element){
        list1.set(1,element);
        return list1;
    }

    public static void printAllElementsFromPosition(ArrayList<String> list,int from, int to){
        for (int i = from; i < to; i++) {
            System.out.println(list.get(i));
        }
    }

}
