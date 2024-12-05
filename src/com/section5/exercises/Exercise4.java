package com.section5.exercises;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startTime = sc.nextInt();
        int endTime = sc.nextInt();
        int duration;

        if (startTime == endTime) {
            duration = 24;
        }else if (startTime > endTime) {
            duration = (24 - startTime) + endTime;
        }else {
            duration = endTime - startTime;
        }

        System.out.println("THE GAME LASTED " + duration + " HOURS");
    }
}
