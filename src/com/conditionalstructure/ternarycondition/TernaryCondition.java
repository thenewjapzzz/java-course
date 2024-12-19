package com.conditionalstructure.ternarycondition;

public class TernaryCondition {
    public static void main(String[] args) {
        double price = 34.5;
        double discount = (price < 20.0) ? price * 0.1 : price * 0.05;

        System.out.println(discount);

    }
}
