package com.section5.exercises;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codeItem = sc.nextInt();
        int quantity = sc.nextInt();
        double totalValue = 0;

        if (codeItem == 1) {
            totalValue = quantity * 4.0;
        }else if (codeItem == 2) {
            totalValue = quantity * 4.5;
        }else if (codeItem == 3) {
            totalValue = quantity * 5.0;
        }else if (codeItem == 4) {
            totalValue = quantity * 2.0;
        }else if (codeItem == 5) {
            totalValue = quantity * 1.5;
        }

        System.out.printf("TOTAL: R$ %.2f\n ", totalValue);
    }
}
