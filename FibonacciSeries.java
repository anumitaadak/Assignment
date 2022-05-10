package com.assignment.practice.six;

public class FibonacciSeries {
    public static void main(String[] args) {
        int[] myArr = new int[10];
        myArr[0] = 0;
        myArr[1] = 1;

        for (int i = 0; i < myArr.length-2; i++) {
            int result = myArr[i] + myArr[i + 1];
            myArr[i + 2] = result;
            System.out.println(result);
        }
    }
}
