package com.conditionalstructure.conditionalstructure;

import java.util.Scanner;

public class CompoundConditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora;
        System.out.println("What time is it? ");
        hora = sc.nextInt();

        if (hora < 12) {
            System.out.println("Good Morning!");
        }else {
            System.out.println("Good Evening!");
        }
    }
}
