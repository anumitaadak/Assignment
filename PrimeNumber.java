package com.assignment.practice.six;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int flag = 0;

        if (number == 0 || number == 1) {
            System.out.println(number + " : This is not prime number");
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    System.out.println("number is composite");
                    flag = 1;
                    break;
                }
            }

            if(flag == 0) {
                    System.out.println("number is prime");
                }
            }
        }
    }





