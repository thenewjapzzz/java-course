package com.section5.conditionalstructure;

import java.util.Scanner;

public class ConditionChaining {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time;
        System.out.println("What time is it? ");
        time = sc.nextInt();

        if (time < 12) {
            System.out.println("Good Morning!");
        }else {
            if (time >=  12 && time <= 18 ) {
                System.out.println("Good Evening!");
            }else {
                System.out.println("Good Night");
            }
        }
    }
}
