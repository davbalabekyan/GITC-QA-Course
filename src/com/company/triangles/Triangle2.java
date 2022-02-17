package com.company.triangles;

public class Triangle2 {

    public static void main(String[] args) {

        System.out.println(Triangle2.checkTriangle(5, 6, 10));
    }

    public static boolean checkTriangle(int a, int b, int c) {

        if (a > 0 && b > 0 && c > 0) {
            return (a + b > c) && (a + c > b) && (b + c > a);
        }
        return false;
    }
}
