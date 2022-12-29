package com.bridgelabz.basics;

import java.util.Scanner;

public class Factors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to check its prime factors : ");
        int number = sc.nextInt();
        System.out.println("prime factors of this number is : ");
        int num = number;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
                num /= i;
            }
        }
        if (num != 1)
            System.out.println(num);
    }
}