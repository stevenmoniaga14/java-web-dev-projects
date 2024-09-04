package org.launchcode;

import java.util.Scanner;

public class NumericTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles you have driven?");

        double numMiles = input.nextDouble();

        System.out.println("How much gas in gallons you spent?");

        double numGas = input.nextDouble();

        double mpg = numMiles / numGas;

        System.out.println("You are running on " + mpg + " mpg ");


    }
}
