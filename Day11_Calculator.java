package com.work;
import java.util.Scanner;

public class Day11_Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("please enter your first number");
        double num1 = in.nextDouble();
        
        System.out.println("Please enter your second number");
        double num2 = in.nextDouble();
         
        System.out.println("Enter your operator like : (+,-,/,*)");
        String operator = in.next();
        
        double result = 0;
        
        if (operator.equals("+")) {
            result = num1 + num2;
            System.out.println("the answer is : " + result);
        } else if (operator.equals("-")) {
            result = num1 - num2; 
            System.out.println("The answer is : " + result);
        } else if (operator.equals("*")) {
            result = num1 * num2;
            System.out.println("The answer is  " + result);
        } else if (operator.equals("/")) {
            if (num2 == 0) {
                System.out.println("You cant divide a number with zero");
            } else {
                result = num1 / num2;
                System.out.println("the answer is  " + result); 
            }
        } else { 
            System.out.println("Please enter a valid operator");
        }
        
        in.close();
    }
}
