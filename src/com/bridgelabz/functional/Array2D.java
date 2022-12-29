package com.bridgelabz.functional;

import java.util.Scanner;

public class Array2D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int row = sc.nextInt();
        System.out.println("Enter the column : ");
        int col = sc.nextInt();

        int arr[][] = new int[row][col];

        System.out.println("enter the elements in an array : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("----2D array is---- ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("arr [" + i + "] [" + j + "]  =  " + arr[i][j]);
            }
        }
    }
}