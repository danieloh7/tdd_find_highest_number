package com.tdd.findhighestnumber;

public class HighestNumberFinder {
    public int findHighestNumber(int[] array) {
//        return array[0];
        int temp = array[0];
        if (array.length > 1) {
            for (int i=1; i< array.length; i++) {
                if (temp < array[i]) {
                    temp = array[i];
                }
            }
        }
        return temp;
    }
}
