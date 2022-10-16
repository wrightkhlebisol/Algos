package com.wright;


import com.wright.algoandds.LinkedList;

public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        list.addFirst(5);
        System.out.println(list.contains(0));
    }
}
