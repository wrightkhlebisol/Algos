package com.wright.collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void show(){
        Queue<String> queue = new ArrayDeque<>();

        queue.add("c");
        queue.add("a");
        queue.offer("d");
//
//        queue.add("b");


//        var front = queue.peek();
        var front = queue.poll();

        System.out.println(front);
    }
}
