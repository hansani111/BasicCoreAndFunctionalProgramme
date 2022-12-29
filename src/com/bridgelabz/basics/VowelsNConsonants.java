package com.bridgelabz.basics;

import java.util.Scanner;

public class VowelsNConsonants {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the letter : ");
        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("vowel : " + ch);
        } else {
            System.out.println("consonant : " + ch);
        }
    }
}