package com.company;

public class Main<string> {

    public static void main(String[] args) {

        System.out.println(resultSum(2, 3, 10, 5));
        compare(11);
        compareZero(5);// write your code here
        minusTrue(-7);
        printName("Vasya");
    }

    public static int resultSum(int a, int b, int c, int d) {
        int x = 0;
        x = a * (b + (c / d));
        return x;
    }

    public static void compare(int z) {
        if (z >= 10 && z <= 20) ;
        System.out.println("true" + " " + "ok");
    }

    public static void compareZero(int q) {
        if (q >= 0) {
            System.out.println("В метод compareZero передано положительное число :" + q);
        } else {
            System.out.println("В метод compareZero передано отрицательное число :");
        }
    }

    public static void minusTrue(int w) {
        if (!(w >= 0)) {
            System.out.println("В метод minusTrue передано отрицательное число :" + w);
        } else {
            System.out.println("В метод minusTrue передано положительноечисло :" + w);
        }
    }

    public static void printName(String n) {
        String name = n;
        System.out.println("Привет," + n);
    }


}