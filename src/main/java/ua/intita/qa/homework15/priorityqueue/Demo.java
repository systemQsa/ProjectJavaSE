package ua.intita.qa.homework15.priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Demo {
    public static void main(String[] args) {
        PriorityQueueClass.add("red");
        PriorityQueueClass.add("green");
        PriorityQueueClass.add("blue");
        PriorityQueueClass.add("white");
        System.out.println("==============iterate");
        PriorityQueueClass.iterate();

        Queue<String> q = new PriorityQueue<>();
        q.add("pink");
        q.add("brown");

        Queue<String> q2 = new PriorityQueue<>();
        q.add("pink");
        q.add("brown");

        Queue<String> res = PriorityQueueClass.addAll(q);
        System.out.println("==============add all");
        System.out.println(res);

        PriorityQueueClass.insertElement("darkblue", q);
        System.out.println("==============number of elements");
        System.out.println(PriorityQueueClass.numberOfElements(q));
        System.out.println("==============compare");
        System.out.println(PriorityQueueClass.compare(q, q2));
        System.out.println("==============first element");
        System.out.println(PriorityQueueClass.firstElement(q));
        System.out.println("==============removed first");
        System.out.println(PriorityQueueClass.removeFirst(q));
        System.out.println("==============convert to array");
        String[] arr = PriorityQueueClass.convert(q);
        System.out.println(arr);
        System.out.println("==============queue as string");
        System.out.println(PriorityQueueClass.printQueueString(q));
        System.out.println("==============max queue");
        PriorityQueueClass.maxQueue(q);
        System.out.println("==============remove all queue");
        PriorityQueueClass.remove(q);

    }
}
