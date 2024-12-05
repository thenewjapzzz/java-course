package com.section4.mathfunctions;

public class Bhaskara {
    public static void main(String[] args) {
        double a = 1.0, b = -3.0, c = 2.0;
        double delta, x1, x2;
        delta = Math.pow(3, 2) - 4 * a * c;
        System.out.println(delta);

        x1 = ((-b + Math.sqrt(delta)) / 2 * a);
        x2 = ((-b - Math.sqrt(delta))  / 2 * a);

        System.out.println(x1);
        System.out.println(x2);
    }
}
