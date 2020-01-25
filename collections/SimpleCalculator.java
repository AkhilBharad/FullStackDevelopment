package com.cts.collections;

import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
       
        double first = sc.nextDouble();
        double second = sc.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        double result;
        switch(operator)
        {
            case '+':
                result = first + second;
                System.out.println(result);
                break;
            case '-':
                result = first - second;
                System.out.println(result);
                break;
            case '*':
                result = first * second;
                System.out.println(result);
                break;
            case '/':
                result = first / second;
                System.out.println(result);
                break;
          
            default:
                System.out.printf("You have entered wrong operator");
                return;
        }
        
    }
}