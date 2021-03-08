package com.sorting.algorithms;

import java.util.Arrays;

/*
This again a n2 sorting algorithm.
Works better than bubble sort because of the lesser number of swaps
In every iteration the largest number is moved to the end of the array in single swap by maintaining the largest
number in the list in a separate variable.
 */
public class InsertionSort {

    public static void main(String args[]) {
        int[] arr = {20,35,-15,7,55,1,-22};
        new InsertionSort().sort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public void sort(int[] intArr) {

        int lastUnpartitionedIndex = intArr.length -1;
        while(lastUnpartitionedIndex > 0) {
            int largestIndex = 0;
            for(int i=1;i<=lastUnpartitionedIndex;i++) {
                if(intArr[i] > intArr[largestIndex]) {
                    largestIndex = i;
                }
            }
            swap(intArr,lastUnpartitionedIndex,largestIndex);
            lastUnpartitionedIndex --;
        }
        System.out.println("Insertion Sorting is done");
    }


    public void swap(int[] intArr, int i, int j) {

        if(i == j) {
            return;
        }

        int temp = intArr[i];
        intArr[i] = intArr[j];
        intArr[j] = temp;
    }
}
