package ua.intita.qa.homework14.linkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {
    private static LinkedList<String> list = new LinkedList<>();

    public static LinkedList<String> append(String color){
        list.add(color);
        return list;
    }

    public static void iterate(){
        for (String s:list) {
            System.out.println(s);
        }
    }
    public static void iterateFrom(LinkedList<String> list , int index){
        for (int i = index; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void iterateReverse(LinkedList<String> list ){
        for (int i = 0; i < list.size()/2; i++) {
            String temp = list.get(i);
            list.set(i,list.get(list.size()- i -1));
            list.set(list.size() -i -1,temp);
      }
    }
    public static void insert(int index,LinkedList<String> list,String element){
        if (index > list.size() || index < 0){
            throw new ArrayIndexOutOfBoundsException("out of linked list");
        }
       list.set(index, element);

    }

    public static LinkedList<String>  addFirstAndLast(LinkedList<String> list,String element1,String element2){
        list.addFirst(element1);
        list.addLast(element2);
        return list;
    }

     public static LinkedList<String> addFront(LinkedList<String> list,String element){
        list.addFirst(element);
        return list;
     }

     public static LinkedList<String> addLast(LinkedList<String> list,String element){
        list.addLast(element);
        return list;
     }

     public static void addSomeElementsAtSpecificPosition(LinkedList<String> list1,int index,String element){
        if (index < 0 || index > list1.size()){
            throw new IndexOutOfBoundsException();
        }
       list1.set(index,element);
     }

   public static void getOccurrenceFirstLast(LinkedList<String>list){
       System.out.println(list.getFirst());
       System.out.println(list.getLast());
   }

   public static void displayListAndPositions(LinkedList<String> list){
       for (int i = 0; i < list.size(); i++) {
           System.out.println("element = " + list.get(i) + " position = " + i);
       }
   }

   public static void removeElement(LinkedList<String> list,int index){
        list.remove(index);
   }

   public static void removeFirstAndLast(LinkedList<String> list){
        list.removeFirst();
        list.removeLast();
   }

   public static void removeAll(LinkedList<String> list){
        list.clear();
   }

   public static void swapElements(LinkedList<String> list,int index1,int index2){
        if (index1 < 0 || index1 > list.size() || index2 < 0 || index2 > list.size()){
            throw new ArrayIndexOutOfBoundsException();
        }
        String color1 = list.get(index1);
        String color2 = list.get(index2);

        list.set(index1,color2);
        list.set(index2,color1);

   }

   public static LinkedList<String> shuffle(LinkedList<String> list){
       Collections.shuffle(list);
       return list;
   }

   public static LinkedList<String> join(LinkedList<String> list1, LinkedList<String> list2){
        LinkedList<String> list3 = new LinkedList<>();
        list3.addAll(list1);
        list3.addAll(list2);
        return list3;
   }

   public static LinkedList<String> cloneList(LinkedList<String> list1){
        LinkedList<String> list2 = new LinkedList<>();
        list2.addAll(list1);
        return list2;
   }

   public static String pollFirstElement(LinkedList<String> list){
        return list.pollFirst();
   }

   public static String peekFirstElement(LinkedList<String> list){
        return list.peekFirst();
   }

    public static String peekLastElement(LinkedList<String> list){
        return list.peekLast();
    }

    public static boolean containsElement(LinkedList<String> list,String element){
        return list.contains(element);
    }

    public static ArrayList<String> convert(LinkedList<String> list){
        return new ArrayList<>(list);
    }

    public static boolean compareLists(LinkedList<String> list1,LinkedList<String> list2){
        return list1.equals(list2);
    }

    public static boolean isEmpty(LinkedList<String> list){
        return list.isEmpty();
    }

    public static LinkedList<String>  replaceElement(LinkedList<String> list,int index,String element){
        if (index < 0 || index > list.size()){
            throw new ArrayIndexOutOfBoundsException();
        }
        list.set(index,element);
        return list;
    }
}
