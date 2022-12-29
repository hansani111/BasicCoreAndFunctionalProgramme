package com.bridgelabz.functional;

public class WindChill {

    public static void main(String[] args) {

        double temprature = Double.parseDouble(args[0]);
        double windSpeed = Double.parseDouble(args[1]);

        if (temprature > 50 || windSpeed > 120 || windSpeed < 3) {
            double windChill = 35.74 + (0.6215 * temprature) + ((0.4275 * temprature) - 35.75) * Math.pow(windSpeed, 0.16);
            System.out.println("WindChill is -----> " + windChill);
        } else {
            System.out.println("enter correct output!!!!!!!!!!! ");
        }
    }
}