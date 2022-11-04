package com.altun.ConditionalStatement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Three numbers as input to calculate and print the average of the numbers.

        System.out.println("Enter 3 numbers in a row: ");

        Scanner userInteraction = new Scanner(System.in);

        int userInput1 = userInteraction.nextInt();
        int userInput2 = userInteraction.nextInt();
        int userInput3 = userInteraction.nextInt();

    // Average calculation code

        int sum = userInput1 + userInput2 + userInput3;

        double average = sum / 3;
        System.out.println("Average of your input is: " + sum / 3);
    }
}
