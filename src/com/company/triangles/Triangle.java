package com.company.triangles;

public class Triangle {

    public static void main(String[] args) {
        int a = 90;
        int b = 45;
        int c = 45;
        int sum = a + b + c;
        System.out.println(Triangle.checkTriangle(sum));
    }

    public static boolean checkTriangle(int sum){
        if (sum == 180){
            return true;
        }else{
            return false;
        }
    }
}
