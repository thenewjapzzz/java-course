package com.sequentialstructure.input;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input String
        String x;
        System.out.println("Enter your name: ");
        x = sc.next();
        System.out.println("Hello, " + x);

        // Input int
        System.out.println("Enter a number: ");
        int y = sc.nextInt();
        System.out.println("You typed: " + y);

        // Input double
        System.out.println("Enter a double number: ");
        double z = sc.nextDouble();
        System.out.println("You typed: " + z);

        // Input char
        System.out.println("Enter a char: ");
        char w = sc.next().charAt(0);
        System.out.println("You typed: " + w);

        sc.close();
    }
}
