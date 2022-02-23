package com.company.arrays;

public class MultidimensionalArray {

    public static void main(String[] args) {

        int[][] twoDimensionalArray = createArray();

        System.out.println(getMax(twoDimensionalArray));
        System.out.println(getMin(twoDimensionalArray));
    }

    public static int[][] createArray(){
        int[][] twoDimensionalArray = new int[10][10];

        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                twoDimensionalArray[i][j] = (int) (Math.random() * 100);
            }
        }

        return twoDimensionalArray;
    }

    public static int getMax(int[][] twoDimensionalArray) {

        int max = 0;

        for (int[] array : twoDimensionalArray) {
            for (int element : array) {
                if (max < element) {
                    max = element;
                }
            }
        }

        return max;
    }

    public static int getMin(int[][] twoDimensionalArray) {

        int min = 0;

        for (int[] array : twoDimensionalArray) {
            for (int element : array) {
                if (min > element) {
                    min = element;
                }
            }
        }

        return min;
    }
}
