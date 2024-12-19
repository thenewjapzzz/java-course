package com.sequentialstructure.exercises;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();
        int result = x + y;
        System.out.println("SOMA = " + result);
    }
}
