package org.launchcode;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("length of the rectangle?");

        int length = input.nextInt();

        System.out.println("width of the rectangle?");

        int width = input.nextInt();

        System.out.println(InputOutput.areaRectangle(length, width));



    }
}
