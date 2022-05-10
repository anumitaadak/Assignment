package com.assignment.practice.six;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int[] myArr = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29,31,37,39,41,43};
        int i = 0;
        if(number == myArr[i]){
            System.out.println("number is prime number");
        } else{
            System.out.println("number is composite number");
        }
        System.out.println("factors of numbers are : ");

        for ( i = 0; i < myArr.length; i++) {
            //System.out.println("factors of numbers are : ");
            if (number % myArr[0] == 0) {
                int output = number / myArr[0];
                System.out.println(output);
                //System.out.println(myArr[0]);
                number = output;
            } else if (number % myArr[1] == 0) {
                int output = number / myArr[1];
                System.out.println(output);
                //System.out.println(myArr[1]);
                number = output;
            } else if (number % myArr[2] == 0) {
                int output = number / myArr[2];
                System.out.println(output);
                //System.out.println(myArr[2]);
                number = output;

            }

        }
        //System.out.println(1);
        //System.out.println(number);
    }
}

