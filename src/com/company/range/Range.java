package com.company.range;

public class Range {

    public static void main(String[] args) {

        printEvenNumbersTillHundred();
        printOddNumbersTillHundred();
        printEvenNumbersTillZero();
        printOddNumbersTillZero();
        printPrimeNumbers();
    }

    public static void printEvenNumbersTillHundred() {

        System.out.println("Even numbers from zero till hundred");
        System.out.println("----------------------");
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "-");
            }
        }
        System.out.println();
        System.out.println("----------------------");
    }

    public static void printOddNumbersTillHundred() {

        System.out.println("Odd numbers from zero till hundred");
        System.out.println("----------------------");
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 1) {
                System.out.print(i + "-");
            }
        }
        System.out.println();
        System.out.println("----------------------");
    }

    public static void printEvenNumbersTillZero() {

        System.out.println("Even numbers from hundred to zero");
        System.out.println("----------------------");
        for (int i = 100; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.print(i + "-");
            }
        }
        System.out.println();
        System.out.println("----------------------");
    }

    public static void printOddNumbersTillZero() {

        System.out.println("Odd numbers from hundred to zero");
        System.out.println("----------------------");
        for (int i = 100; i >= 0; i--) {
            if (i % 2 == 1) {
                System.out.print(i + "-");
            }
        }
        System.out.println();
        System.out.println("----------------------");
    }

    public static void printPrimeNumbers() {

        System.out.println("Prime numbers from two till hundred");
        System.out.println("----------------------");
        for (int i = 2; i <= 100; i++) {

            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + "-");
            }
        }
        System.out.println();
        System.out.println("----------------------");
    }
}
