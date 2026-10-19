package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // Pull MortgageCalculator, CDC
        System.out.println("==== FINANCIAL CALCULATOR ====");
        System.out.println("1. Mortgage Calculator");
        System.out.println("2. CD Calculator");
        System.out.println("3. Annuity Calculator");

        System.out.print("Select a calculator: ");
        int calculatorChoice = read.nextInt();

        switch (calculatorChoice) {
            case 1:
                MortgageCalculator.main(args); // Reuses existing array from MortgageCalculator
                break;

            case 2:
                CDCalculator.main(args);
                break;
            case 3:
                AnnuityCalculator.main(args);
            default:
                System.out.println("Invalid selection");
        }
    }
}