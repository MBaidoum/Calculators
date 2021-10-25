package com.company.calculators;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number:");
        int firstNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Second Number:");
        int secondNumber =  Integer.parseInt(scanner.nextLine());
        System.out.println("Select Option:");
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Multiply");
        System.out.println("4 - Divide");
        int operation =  Integer.parseInt(scanner.nextLine());
        System.out.print("Result: ");

        //Takes the entered number and does and operation accordingly
        //Any number outside the prescribed will end the program with no operation
        switch (operation) {
            case 1:
                System.out.println(firstNumber + "+" + secondNumber + "=" + (firstNumber + secondNumber) );
                break;
            case 2:
                System.out.println(firstNumber + "-" + secondNumber + "=" + (firstNumber - secondNumber) );
                break;
            case 3:
                System.out.println(firstNumber + "*" + secondNumber + "=" + (firstNumber * secondNumber) );
                break;
            case 4:
                //Will not allow the user to divide by zero15
                if(secondNumber == 0) {
                    System.out.println("Cannot divide by zero");
                    break;
                }
                System.out.println(firstNumber + "/" + secondNumber + "=" + ((firstNumber * 1.0) / (secondNumber * 1.0)) );
            default:
                System.out.println("Invalid input, please try again");
        }
    }
}
