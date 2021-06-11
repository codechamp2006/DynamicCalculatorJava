package com.codechamp2006;

import java.util.*; // imports all the java modules in java.util Package

public class Main {
    // addition method
    public static double add(double a, double b){
        return a + b;
    }
    // subtraction method
    public static double sub(double a, double b){
        return a - b;
    }
    // multiplication method
    public static double mult(double a, double b){
        return a * b;
    }
    // division method
    public static double div(double a, double b){
        return a / b;
    }
    // main method
    public static void main(String[] args) {
        // initializing variables
        double num1, num2, result;
        String operator; // string to denote operator
        // Scanner object
        Scanner scan = new Scanner(System.in);
        System.out.print("Number 1 : ");
        num1 = scan.nextDouble(); // take input for num1
        System.out.print("Number 2 : ");
        num2 = scan.nextDouble(); // take input for num2
        System.out.print("Operator : ");
        operator = scan.next(); // take input for operator

        char ch = operator.charAt(0); // extract the first character from the string
        switch(ch){ // switch case
            case '+': result = add(num1,num2);
                      break;
            case '-': result = sub(num1,num2);
                      break;
            case '*': result = mult(num1,num2);
                      break;
            case '/': result = div(num1,num2);
                      break;
            default: result = -0.0;
        }
        // conditions for displaying the output
        if(result == -0.0){
            System.out.println("Error 405: The operator is invalid");
        }
        else{
            System.out.println(result);
        }
    }
}
