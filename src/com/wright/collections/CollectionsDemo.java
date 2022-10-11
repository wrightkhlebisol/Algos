package com.wright.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionsDemo {
    public static void show(){
        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("a");
        collection.add("b");
        collection.add("c");

        System.out.println(collection.contains("a"));
        collection.remove("c");

        String[] stringArray = collection.toArray(collection.toArray(new String[6]));
        System.out.println(collection.isEmpty());

        Collection<String> stringCollection = new ArrayList<>();
        stringCollection.addAll(collection);

        System.out.println(collection == stringCollection);
        System.out.println(collection.equals(stringCollection));
    }
}
