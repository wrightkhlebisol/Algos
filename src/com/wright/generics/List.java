package com.wright.generics;

public class List {

    private Object[] items = new Object[10];

    private int count;

    public void add(Object item){
        items[count] = item;
        count++;
    }

    public Object get(int index){
        return items[index];
    }
}
