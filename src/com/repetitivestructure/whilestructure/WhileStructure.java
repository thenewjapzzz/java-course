package com.repetitivestructure.whilestructure;

import java.util.Scanner;

public class WhileStructure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum = x;

        while (x !=0 ) {
            x = sc.nextInt();
            sum += x;
        }

        System.out.println(sum);
    }
}
