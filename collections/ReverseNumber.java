package com.cts.collections;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 65875848, r = 0;
        while(num != 0) {
            int digit = num % 10;
            r = r * 10 + digit;
            num =num/ 10;
        }
        System.out.println("Reversed Number: " + r);
    }
}