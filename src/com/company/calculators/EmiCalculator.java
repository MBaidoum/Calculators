package com.company.calculators;

import java.util.Scanner;

public class EmiCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        int P = Integer.parseInt(scanner.nextLine());
        System.out.print("Rate of interest: ");
        double r =  Double.parseDouble(scanner.nextLine()) / 12;
        System.out.print("Tenure: ");
        int n =  Integer.parseInt(scanner.nextLine());
        System.out.print("EMI: ");
        double numerator = Math.pow(1 + r, n);
        double denominator = Math.pow(1 + r, n) - 1;
        double E = P * r * ( numerator / denominator);
        System.out.println(E);
    }
}
