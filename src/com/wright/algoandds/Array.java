/**
 * This class implements a dynamic array that
 * grows when the content exceeds the
 * size of the initial array
 **/

package com.wright.algoandds;

public class Array {

    private int[] items;
    private int arrayCount;

    public Array(int length){
        items = new int[length];
    }

    public void insert(int item) {
        // If the array is full, resize it
        // Add the new item at the end
        if (arrayCount == items.length) {
            // Increase array size
            var newItems = new int[arrayCount * 2];
//            for (int i = 0; i < items.length; i++) {
//                newItems[i] = items[i];
//            }
//            newItems[arrayCount++] = item;
//            items = newItems;
//            System.out.println(Arrays.toString(items));
        }
//        else{
        items[arrayCount++] = item;
//        }
//        if(items.length == arrayCount){
//            int[] newItems = new int[arrayCount * 2];
//
//            for(int i = 0; i < arrayCount; i++)
//                newItems[i] = items[i];
//
////            items = newItems;
////            System.out.println(Arrays.toString(items));
//            newItems[arrayCount++] = item;
//        }
//
//        items[arrayCount++] = item;

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
        for (int item: items) {
            System.out.println(item);
        }
    }


}
