package com.section5.exercises;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("Are multiples");
        }else {
            System.out.println("Are not multiples");
        }
    }
}
