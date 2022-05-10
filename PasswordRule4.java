package com.assignment.practice19;

import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class PasswordRule4 {
    public static void main(String[] args) {
        String passwordRule4 = "K9@hgjkjijk";

        boolean validPasswordRule4 = Pattern.matches("^[A-Z][0-9][@#]{1}[a-z]{5,}$",passwordRule4);
        System.out.println(passwordRule4);
    }
}
