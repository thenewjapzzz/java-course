package com.conditionalstructure.exercises;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tax = 0;
        double salary;
        salary = sc.nextDouble();

        if (salary > 0 && salary <= 2000.00) {
            System.out.println("FREE");
        }else if (salary <= 3000.00) {
            tax = (salary - 2000.00) * 0.08;
        }else if (salary <= 4500) {
            tax = (1000.00 * 0.08) + ((salary - 3000) * 0.18);
        }else {
            tax = (1000.00 * 0.08) + (1500.00 * 0.18) + ((salary - 4500.00) * 0.28);
        }

        if (tax > 0) {
            System.out.printf("R$ %.2f\n", tax);
        }

        sc.close();
    }
}
