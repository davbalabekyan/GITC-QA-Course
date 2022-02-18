package com.company.triangles;

public class GeometricFigures {

    public static void main(String[] args) {

        int length = 5;

        drawSquare(length);
        drawRectangle(length);
        drawRightTriangleOne(length);
        drawRightTriangleTwo(length);
        drawRightTriangleThree(length);
        drawRightTriangleFour(length);
        drawEquilateralTriangleOne(length);
        drawEquilateralTriangleTwo(length);
        drawDiagonalTriangle(length);
    }

    public static void drawSquare(int length) {

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("---------------------");
    }

    public static void drawRectangle(int length) {

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length + 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("--------------------");
    }

    public static void drawRightTriangleOne(int length) {

        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("--------------------");
    }

    public static void drawRightTriangleTwo(int length) {

        for (int i = 0; i < length; i++) {
            for (int j = length; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("--------------------");
    }

    public static void drawRightTriangleThree(int length) {

        for (int i = 0; i < length; i++) {
            for (int j = length - 1; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("--------------------");
    }

    public static void drawRightTriangleFour(int length){

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = length; j > i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("--------------------");
    }

    public static void drawEquilateralTriangleOne(int length){

        for (int i = 0; i < length; i++) {
            for (int j = length -1; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("--------------------");
    }

    public static void drawEquilateralTriangleTwo(int length){

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = length; j > i ; j--) {
                System.out.print("* ");
            }
            for (int j = length - 1; j > i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("--------------------");
    }

    public static void drawDiagonalTriangle(int length){

        for (int i = 0; i < length; i++) {
            for (int j = length - 1; j > i ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = length - 1; j > i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
