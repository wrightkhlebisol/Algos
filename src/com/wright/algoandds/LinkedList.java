package com.wright.algoandds;

public class LinkedList {

    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }

    private Node first;
    private Node last;

    public void addLast (int item) {
        var node = new Node(item);
        if(last == null)
            first = last = node;
        else
            last.next = node;
            last = node;
    }

    public void addFirst(int item){
        var node = new Node(item);

        if(first == null)
            first = last = node;
        else
        //  Set the next field of new node to
        //  current first
            node.next = first;
        //  Since first still points to first old
        //  node, we need to reassign it to new node
            first = node;
    }

    public int indexOf(int item){
        var currentNode = first;
        int index = 0;
        while(currentNode != null){
            if(currentNode.value == item) return ++index;
            index++;
            currentNode = currentNode.next;
        }
        return -1;
    }

    public boolean contains(int item){
        return indexOf(item) != -1;
    }

//    deleteFirst();
//    deleteLast();
}
