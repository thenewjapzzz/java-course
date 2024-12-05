package com.section5.exercises;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x < 0) {
            System.out.println("NEGATIVE");
        }else {
            System.out.println("NOT NEGATIVE");
        }
    }
}
