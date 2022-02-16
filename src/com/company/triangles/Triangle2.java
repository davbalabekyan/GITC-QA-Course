package com.company.triangles;

public class Triangle2 {

    public static void main(String[] args) {

        System.out.println(Triangle2.checkTriangle(5, 6, 10));

    }

    public static boolean checkTriangle(int a,int b,int c){

        if(a > 0 && b > 0 && c > 0) {
            if ((a + b > c) && (a + c > b) && (b + c > a)) {
                return true;
            } else {
                return false;
            }
        }else {
            return false;
        }
    }
}
