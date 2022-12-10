package com.wright.algoandds;

import java.util.NoSuchElementException;

public class LinkedList {

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void addLast(int item) {
        ++size;
        var node = new Node(item);
        if (isEmpty())
            first = last = node;
        else
            last.next = node;
        last = node;
    }

    private boolean isEmpty() {
        return first == null;
    }

    public void addFirst(int item) {
        ++size;
        var node = new Node(item);

        if (isEmpty())
            first = last = node;
        else
            //  Set the next field of new node to
            //  current first
            node.next = first;
        //  Since first still points to first old
        //  node, we need to reassign it to new node
        first = node;
    }

    public int indexOf(int item) {
        var currentNode = first;
        int index = 0;
        while (currentNode != null) {
            if (currentNode.value == item) return index;
            index++;
            currentNode = currentNode.next;
        }
        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public void removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        --size;
        // [10 -> 20 -> 30]
        // Get second, assign that to global first
        // Assign first next to null
        var secondNode = first.next;
        first.next = null;
        first = secondNode;
    }

    public void removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        --size;
//      Handle when list has only one node
        if (first == last) {
            //  if it is, set to null
            first = last = null;
            return;
            // else
        }
//      Get previous
        var nodePointer = first;
        while (nodePointer != null) {
            if (nodePointer.next.next == null) {
                last = nodePointer;
                last.next = null;
                return;
            } else {
                nodePointer = nodePointer.next;
            }
        }
    }

    public int size(){
        return size;
    }
}