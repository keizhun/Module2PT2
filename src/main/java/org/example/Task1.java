package org.example;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Please enter second number: ");
        int num2 = scanner.nextInt();

        double result;

        result = num1 + num2;
        System.out.println("Addition: " + result);

        result = num1 - num2;
        System.out.println("Subtraction: " + result);

        result = num1 * num2;
        System.out.println("Multiplication: " + result);

        result = (double) num1 / num2;
        System.out.println("Division: " + result);

        scanner.close();
    }
}

