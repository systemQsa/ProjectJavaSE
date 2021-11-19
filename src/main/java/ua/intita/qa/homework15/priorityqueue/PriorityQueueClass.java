package ua.intita.qa.homework15.priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueClass {
    private static Queue<String> queue = new PriorityQueue<>();

    public static void add(String color) {
        queue.add(color);
    }

    public static void iterate() {
        for (String color : queue) {
            System.out.println(color);
        }
    }

    public static Queue<String> addAll(Queue<String> queue) {
        Queue<String> queue2 = new PriorityQueue<>();
        queue2.addAll(queue);
        return queue2;
    }

    public static void insertElement(String color, Queue<String> queue) {
        queue.offer(color);
    }

    public static void remove(Queue<String> queue) {
        queue = null;
    }

    public static int numberOfElements(Queue<String> queue) {
        return queue.size();
    }

    public static boolean compare(Queue<String> queue1, Queue<String> queue2) {
        return queue1.equals(queue2);
    }

    public static String firstElement(Queue<String> queue) {
        return queue.peek();
    }

    public static String removeFirst(Queue<String> queue) {
        return queue.poll();
    }

    public static String[] convert(Queue<String> queue) {
        String[] arr = new String[queue.size()];
        int i = 0;
        for (String color : queue) {
            arr[i++] = color;
        }
        return arr;
    }

    public static String printQueueString(Queue<String> queue) {
        return queue.toString();
    }

    public static void maxQueue(Queue<String> queue) {
        String color;
        while ((color = queue.poll()) != null) {
            System.out.println(color);
        }
    }
}
