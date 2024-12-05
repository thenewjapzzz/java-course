package com.section4.exercises;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double area = 3.14159 * Math.pow(r, 2);
        System.out.printf("A = %.4f\n", area);
    }
}
