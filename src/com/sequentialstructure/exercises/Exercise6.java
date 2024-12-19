package com.sequentialstructure.exercises;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        double triangle = (a * c) / 2;
        double circle = 3.14159 * Math.pow(c, 2);
        double trapeze = ((a + b) * c )/ 2;
        double square = Math.pow(b, 2);
        double rectangle = a * b;
        System.out.printf("TRIANGLE: %.4f\n", triangle);
        System.out.printf("CIRCLE: %.4f\n", circle);
        System.out.printf("TRAPEZE: %.4f\n", trapeze);
        System.out.printf("SQUARE: %.4f\n", square);
        System.out.printf("RECTANGLE: %.4f\n", rectangle);
    }
}
