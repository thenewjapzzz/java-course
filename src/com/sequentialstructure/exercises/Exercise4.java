package com.sequentialstructure.exercises;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idEmployee;
        int workHours;
        double moneyPerHour;
        double salary;
        idEmployee = sc.nextInt();
        workHours = sc.nextInt();
        moneyPerHour = sc.nextDouble();
        salary = workHours * moneyPerHour;
        System.out.println("NUMBER = " + idEmployee);
        System.out.printf("SALARY = U$ %.2f\n", salary);
    }
}
