package com.bridgelabz.basics;

public class FlipCoin {

    public static void main(String[] args) {
        double flip = (Math.random() * 2);
        if (flip <= 0.5) {
            System.out.println("head");
        } else {
            System.out.println("tail");
        }
    }
}