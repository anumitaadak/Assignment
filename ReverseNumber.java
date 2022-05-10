package com.assignment.practice.six;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter number to be reversed");
        Scanner scanner = new Scanner(System.in);
        int original = scanner.nextInt();
        int reverse = 0;

        while(original != 0) {
            int remainder = original%10;
            reverse = reverse*10 + remainder;
            original /= 10;
        }
        System.out.println(reverse);
    }
}
