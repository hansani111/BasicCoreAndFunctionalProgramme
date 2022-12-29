package com.bridgelabz.basics;

import java.util.Scanner;

public class PowerOfTwo {

    static double power(int x, int y) {
        double result = Math.pow(x, y);   //Math.pow is a predefine method
        return result;                    // x should be number & y should be the power
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Enter the power of number: ");
        int power = sc.nextInt();

        double result22 = power(num, power);
        System.out.println(num + " ^ " + power + " = " + result22);
    }
}