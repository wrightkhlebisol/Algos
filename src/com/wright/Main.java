package com.wright;


import com.wright.algoandds.LinkedList;

public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        list.addFirst(5);
        list.removeFirst();
        System.out.println(list.indexOf(10));
    }
}
