package com.company.arrays;

import java.util.ArrayList;
import java.util.List;

public class DynamicArray {

    public static int indexOf(int[] array, int value) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }

        return -1;
    }

    public static int lasIndexOf(int[] array, int value) {

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == value) {
                return i;
            }
        }

        return -1;
    }

    public static int[] add(int[] array, int value) {

        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < newArray.length; i++) {
            if (i != array.length) {
                newArray[i] = array[i];
            } else {
                newArray[i] = value;
            }
        }

        return newArray;
    }

    public static int[] add(int[] array, int position, int value) {

        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < newArray.length; i++) {
            if (i < position) {
                newArray[i] = array[i];
            } else if (i > position) {
                newArray[i] = array[i - 1];
            } else {
                newArray[i] = value;
            }
        }

        return newArray;
    }

    public static int[] removeByValue(int[] array, int value) {

        int[] newArray = new int[array.length - 1];

        if (contains(array,value)) {
            for (int i = 0; i < newArray.length; i++) {
                if (indexOf(array, value) <= i) {
                    newArray[i] = array[i + 1];
                } else {
                    newArray[i] = array[i];
                }
            }
            return newArray;
        }

        throw new RuntimeException("Array does not exist value " + value );
    }

    public static boolean contains(int[]array,int value){
        for (int element : array) {
            if (element == value){
                return true;
            }
        }
        return false;
    }

    public static int[] removeByIndex(int[] array, int position) {

        int[] newArray = new int[array.length - 1];

        if (position >= 0 && position < array.length) {
            for (int i = 0; i < newArray.length; i++) {
                if (i >= position) {
                    newArray[i] = array[i + 1];
                } else {
                    newArray[i] = array[i];
                }
            }
            return newArray;
        }

        throw new ArrayIndexOutOfBoundsException();
    }

    public static void main(String[] args) {

        int[] array = {1, 3, 10, -20, 7, 8, 3, -9};

//
//        System.out.println("Array");
//        for (int element : array) {
//            System.out.print(element + " ");
//        }
//        System.out.println();
//        System.out.println("------------------------");
//
//        array = add(array, 7);
//
//        System.out.println("Array after add by value");
//        for (int element : array) {
//            System.out.print(element + " ");
//        }
//        System.out.println();
//        System.out.println("------------------------");
//
//        array = add(array, 1, -6);
//
//        System.out.println("Array after add by index");
//        for (int element : array) {
//            System.out.print(element + " ");
//        }
//        System.out.println();
//        System.out.println("------------------------");
//
        array = removeByValue(array, -2987);

        System.out.println("Array after remove by value");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("------------------------");
//
//        array = removeByIndex(array, -1);
//
//        System.out.println("Array after remove by index");
//        for (int element : array) {
//            System.out.print(element + " ");
//        }
//        System.out.println();
//        System.out.println("------------------------");
//
//        System.out.println("get first index from array by value ");
//        System.out.println(indexOf(array, 7));
//        System.out.println("------------------------");
//
//        System.out.println("get last index from array by value");
//        System.out.println(lasIndexOf(array, 7));
    }
}
