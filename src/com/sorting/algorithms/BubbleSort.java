package com.sorting.algorithms;

import java.util.Arrays;

public class BubbleSort {

    public static void main (String args[]) {

        int[] arr = {20,35,-15,7,55,1,-22};
        new BubbleSort().sort(arr);
        System.out.println(Arrays.toString(arr));

    }


    public void sort(int[] arr) {
        int size = arr.length; //7
        int unpartitionedIndex = size - 1; //6

        while(unpartitionedIndex > 0) {
            for(int i=0;i<unpartitionedIndex;i++) {
                if(arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }

            unpartitionedIndex--;

        }
        System.out.println("Sorting is completed");
    }
}
