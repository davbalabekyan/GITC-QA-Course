package com.company.arrays;

public class SortingAlgorithm {

    public static void main(String[] args) {

        int[]array = {1,-10,7,-20,30,13,-1,0,23};

        sortByBubbleSorting(array);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void sortByBubbleSorting(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]){
                    int tempValue = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tempValue;
                }
            }
        }
    }
}
