package com.assignment.practice.five;

import java.util.Scanner;






public class FlipCoin {
    public static void main(String[] args) {
        System.out.println("Enter number of times to flip coin");
        Scanner scanner = new Scanner(System.in);
        int flip = scanner.nextInt();




        int count = 0;
        int counter = 0;



        for( int i=1; i <= flip;i++) {
            if (Math.random() < 0.5) {

                System.out.println("tail");

                ++count;


            } else {
                System.out.println("head");
                ++counter;



            }




        }

        System.out.println(count);
        System.out.println(counter);
        System.out.println(flip);
        System.out.println(count);


    }


}
