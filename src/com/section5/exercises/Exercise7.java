package com.section5.exercises;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y;
        x = sc.nextDouble();
        y = sc.nextDouble();

        if (x == 0.0 && y == 0.0){
            System.out.println("ORIGIN");
        }else if(x > 0){
            if (y > 0) {
                System.out.println("Q1");
            }else if(y < 0) {
                System.out.println("Q4");
            }
        } else if (x < 0) {
            if (y > 0) {
                System.out.println("Q2");
            }else {
                System.out.println("Q3");
            }
        }
    }
}
