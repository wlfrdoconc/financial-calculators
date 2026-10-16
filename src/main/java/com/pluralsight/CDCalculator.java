package com.pluralsight;


import java.util.Scanner;

public class CDCalculator {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // Collect user's information
        // 1. Get the deposit from the user
        // 2. Get the annual interest rate in %
        // 3. Number of years you would like to lock your deposit for

        System.out.print("How much would you like to deposit? ");
        double depositPrinciple = read.nextDouble();
        System.out.print("Enter the annual interest rate: ");
        double annualInterest = read.nextDouble();
        System.out.print("Enter the amount of years: ");
        int depositLengthInYears = read.nextInt();

        // Calculates future value of deposit
        double futureValue = calcFutureValue(depositPrinciple, annualInterest, depositLengthInYears);

        // Calculates total interest of deposit
        double totalInterest = calcTotalInterest(futureValue, depositPrinciple);

        // Prints results
        printResults(futureValue, totalInterest);
    }

    // calcFutureValue()
    // Formula: FV = P * (1 + (r / d))^n

    public static double calcFutureValue(double depositPrinciple, double annualInterest, int depositLengthInYears) {

        // Convert annual interest rate from percentage to decimal
        double interestRate = annualInterest / 100;
        // Days per year
        int daysPerYear = 365;
        // Calculate the total amount of days of the deposit
        int totalDaysOfDeposit = daysPerYear * depositLengthInYears;
        // Calculate future value using compound interest
        double futureValue = depositPrinciple * Math.pow(1 + (interestRate / daysPerYear), totalDaysOfDeposit);

        return futureValue;
    }

    // calcTotalInterest()
    public static double calcTotalInterest(double futureValue, double depositPrinciple) {
        double totalInterest = futureValue - depositPrinciple;
        return totalInterest;
    }

    // printResults()
    public static void printResults(double futureValue, double totalInterest) {
        System.out.println("==== CD RESULTS ====");
        System.out.printf("The future value of your deposit is: $%.2f%n", futureValue);
        System.out.printf("Your total interest is: $%.2f%n", totalInterest);
    }

}
