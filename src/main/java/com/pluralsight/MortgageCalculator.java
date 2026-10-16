package com.pluralsight;

import java.util.Scanner;

public class MortgageCalculator {

    // Main method
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // Collect user's information
        // 1. Get loan principle from the user
        // 2. Get the annual interest rate in % (7.625)
        // 3. How long they want their loan length to be in years

        System.out.print("How much would you like to borrow? ");
        double loanPrinciple = read.nextDouble();
        System.out.print("Enter the annual interest rate ");
        double annualInterest = read.nextDouble();
        System.out.print("Enter the loan length in years: ");
        int loanLength = read.nextInt();

        // Calculates monthly payment
        double monthlyPayment = calcMonthlyPayment(loanPrinciple, annualInterest, loanLength);
        // Calculate total number of monthly payments
        int numberOfPayments = loanLength * 12;
        // Calculate the total interest
        double totalInterest = calcTotalInterest(monthlyPayment, numberOfPayments, loanPrinciple);

        // Print the results
        printResults(monthlyPayment, totalInterest);


    }

    // calcMonthlyPayment()
    public static double calcMonthlyPayment(double loanPrinciple, double annualInterest, int loanLength) {
        // Convert annual interest to monthly interest rate
        double monthlyInterestRate = annualInterest / 100 / 12;

        // Calculate total number of monthly payments
        int numberOfPayments = loanLength * 12;

        // Calculate monthly payment using the formula
        double monthlyPayment = loanPrinciple *
                (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) /
                (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

        // Return the monthly payment
        return monthlyPayment;
    }


    // calcTotalInterest()
    public static double calcTotalInterest(double monthlyPayment, int numberOfPayments, double loanPrinciple) {
        double totalInterest = (monthlyPayment * numberOfPayments) - loanPrinciple;
        return totalInterest;
    }

    // printResults()
    public static void printResults(double monthlyPayment, double totalInterest) {
        System.out.println("==== MORTGAGE SUMMARY ====");
        System.out.printf("Your monthly payment is: $%.2f%n", monthlyPayment);
        System.out.printf("Your total interest is: $%.2f%n", totalInterest);
    }
}
