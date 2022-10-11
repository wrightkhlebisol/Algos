package com.wright.collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void show(){
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("b");

        list.add(0, "!");
        System.out.println(list.indexOf("b"));
        System.out.println(list.lastIndexOf("b"));
        System.out.println(list.subList(0,1));
    }
}
