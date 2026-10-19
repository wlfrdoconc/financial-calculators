package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // Pull MortgageCalculator, CDC
        System.out.println("==== FINANCIAL CALCULATOR ====");
        System.out.println("1. Mortgage Calculator");
        System.out.println("2. CD Calculator");

        System.out.println("Select a calculator: ");
        int calculatorChoice = read.nextInt();

        switch (calculatorChoice) {
            case 1:
                MortgageCalculator.main(new String[0]);
                break;

            case 2:
                CDCalculator.main(new String[0]);
                break;

            default:
                System.out.println("Invalid selection");
        }
    }
}