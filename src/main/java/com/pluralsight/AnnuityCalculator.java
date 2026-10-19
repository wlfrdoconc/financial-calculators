package com.pluralsight;

import java.util.Scanner;

// OPTIONAL BONUS
public class AnnuityCalculator {
    public static void main(String[] args) {

        // Scanner
        Scanner read = new Scanner(System.in);

        // 1. Takes monthly payout from user
        // 2. Takes expected annual interest entered as a percent
        // 3. Takes the number of years the annuity pays out

        System.out.print("Enter the monthly payout ");
        double monthlyPayout = read.nextDouble();
        System.out.print("Enter the annual interest ");
        double annualInterest = read.nextDouble();
        System.out.print("Enter the number of years ");
        int annuityLength = read.nextInt();

        // Calculate present value
        double presentValue = calcPresentValue(monthlyPayout, annualInterest, annuityLength);
        displayResults(presentValue);
    }

    // calcPresentValue()
    public static double calcPresentValue(double monthlyPayout, double annualInterest, int annuityLength) {

        // Convert annual interest to monthly interest rate
        double monthlyInterest = annualInterest / 100 / 12;

        // Calculate total number of payouts
        int numberOfPayouts = annuityLength * 12;

        // Calculate present value using formula
        double presentValue = monthlyPayout *
                (1 - Math.pow(1 + monthlyInterest, -numberOfPayouts)) / monthlyInterest;

        // Return placeholder value
        return presentValue;
    }

    public static void displayResults(double presentValue) {
        System.out.println("==== ANNUITY SUMMARY ====");
        System.out.printf("Present value: $%.2f%n", presentValue);
    }
}
