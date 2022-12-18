package com.wright;


import com.wright.algoandds.LinkedList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

//        list.addFirst(5);
//        list.addFirst(5);
//        list.removeLast();
//        list.removeLast();
//        list.removeLast();
//        var nodeValueArray = list.toArray();
//        System.out.println(Arrays.toString(nodeValueArray));
        list.reverseLinkedList();
        var reversedNodeArray = list.toArray();
        System.out.println(Arrays.toString(reversedNodeArray));

    }
}
