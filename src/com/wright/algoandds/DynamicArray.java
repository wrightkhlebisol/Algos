/**
 * This class implements a dynamic array that
 * grows when the content exceeds the
 * size of the initial array
 **/

package com.wright.algoandds;

import java.util.Arrays;

public class DynamicArray {

    private int[] items;
    private int arrayCount;

    public DynamicArray(int length){
        items = new int[length];
    }

    public void insert(int item) {
        // If the array is full, resize it
        // Add the new item at the end
        if (arrayCount == items.length) {
            // Increase array size
            var newItems = new int[arrayCount * 2];
//            Copy content from old array
            for (int i = 0; i < items.length; i++) {
                newItems[i] = items[i];
            }
//            set old array to newarray
            items = newItems;
        }
        System.out.println(Arrays.toString(items));

        items[arrayCount++] = item;

    }

    public void removeAt(int index){
        // Validate the index e.g -1 or index greater than length of array
        if(index < 0 || index >= arrayCount)
            throw new IllegalArgumentException();
        // Shift items to the left to fill
        for(int i = index; i < arrayCount; i++)
            items[i] = items[i + 1];

        arrayCount--;
    }

    public int indexOf(int number){
        for (int i = 0; i < items.length; i++) {
            if (items[i] == number)
                return i;
        }
        return -1;
    }

    public void print(){
        for (int i = 0; i < arrayCount; i++) {
            System.out.println(items[i]);
        }
    }


}
