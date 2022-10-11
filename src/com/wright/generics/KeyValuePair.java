package com.wright.generics;

public class KeyValuePair <K, V>{
    private K key;
    private V value;

    public KeyValuePair(K _key, V _value){
        this.key = _key;
        this.value = _value;
    }
}
