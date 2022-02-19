package com.company.arrays;

public class ArrayUtil {

    public static void main(String[] args) {

        int[] array = {1, 7, -2, 4, 12, -2, -3, 7};

        System.out.println(getMax(array));
        System.out.println(getMin(array));
        System.out.println(getSum(array));
        System.out.println(getAvg(array));
    }

    public static int getMax(int[] array) {

        int max = array[0];

        for (int element : array) {
            if (max < element) {
                max = element;
            }
        }

        return max;
    }

    public static int getMin(int[] array) {

        int min = array[0];

        for (int element : array) {
            if (min > element) {
                min = element;
            }
        }

        return min;
    }

    public static int getSum(int[]array){

        int sum = 0;

        if (array.length < 1){
            return 0;
        }

        for (int element : array) {
            sum += element;
        }

        return sum;
    }

    public static int getAvg(int[]array){

        int sum = 0;

        if (array.length < 1){
            return 0;
        }

        for (int element : array) {
            sum += element;
        }

        return sum/array.length;
    }
}
