package com.bridgelabz.basics;

import java.util.Scanner;

public class SwapNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the 2nd number : ");
        int num2 = sc.nextInt();

        int temp ;

        System.out.println("----before swapping----");
        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("----after swapping----");
        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);
    }
}
