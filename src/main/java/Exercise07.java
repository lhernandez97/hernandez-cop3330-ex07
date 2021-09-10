/*
* UCF COP3330 Fall 2021 Assignment 1 Solution
* Copyright 2021 Luis Hernandez
*/

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        //create a Scanner
        Scanner input = new Scanner(System.in);
        //constant variable for conversion
        double conversion = 0.09290304;
        //ask the user for the length of the room
        System.out.print("What is the length of the room in feet? ");
        int length = input.nextInt();
        //ask the user for the width of the room
        System.out.print("What is the width of the room in feet? ");
        int width = input.nextInt();
        //repeat the dimensions of the room to the user
        System.out.printf("You entered dimensions of %d feet by %d feet.%n", length, width);
        //calculate the area of the room in square feet
        int sq_feet = length * width;
        //calculate the area of the room in square meters
        double sq_meters = sq_feet * conversion;
        //tell the user the area by square feet, and then by square meters
        System.out.println("The area is");
        System.out.printf("%d square feet%n", sq_feet);
        System.out.printf("%.3f square meters", sq_meters);
    }
}
