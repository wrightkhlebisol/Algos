package com.wright;

import com.wright.algoandds.Array;

public class Main {
    public static void main(String[] args) {
        var someArray = new Array(3);
        someArray.insert(10);
        someArray.insert(20);
        someArray.insert(30);
        someArray.insert(40);
        someArray.insert(50);
        someArray.insert(60);

//        System.out.println(someArray.indexOf(50));
//        someArray.removeAt(5);

        someArray.print();
    }
}
