package com.company.math;

public class Math {

    public static void main(String[] args) {

        System.out.println(countSum(100));
        System.out.println(countFactorial(3));
    }

    public static int countSum(int number) {

        int sum = 0;

        if (number > 1) {
            for (int i = 1; i <= number; i++) {
                sum += i;
            }
        }

        return sum;
    }

    public static int countFactorial(int factorial) {

        int sum = 1;

        if (factorial > 1) {
            for (int i = 1; i <= factorial; i++) {
                sum *= i;
            }
            return sum;
        }

        return -1;
    }
}
