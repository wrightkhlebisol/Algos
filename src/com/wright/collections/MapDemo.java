package com.wright.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {
    public static void show(){
        var c1 = new Customer("a", "e1");
        var c2 = new Customer("b", "e2");
        var c3 = new Customer("c", "e3");

        Map<String, Customer> map = new HashMap<>();

        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);
        map.put(c3.getEmail(), c3);

        var customer = map.get("e1");
        System.out.println(customer);

        for (var key: map.keySet()) {
            System.out.println(key);
        }
    }
}
