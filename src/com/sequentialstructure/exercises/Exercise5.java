package com.sequentialstructure.exercises;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idOne, numberPiecesOne;
        double unityValueOne;
        int idTwo, numberPiecesTwo;
        double unityValueTwo;

        idOne = sc.nextInt();
        numberPiecesOne = sc.nextInt();
        unityValueOne = sc.nextDouble();
        idTwo = sc.nextInt();
        numberPiecesTwo = sc.nextInt();
        unityValueTwo = sc.nextDouble();

        double totalValue = numberPiecesOne * unityValueOne + numberPiecesTwo * unityValueTwo;

        System.out.printf("VALUE TO PAY: R$ %.2f\n", totalValue);

    }
}
