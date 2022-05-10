package com.assignment.practice19;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PasswordRule2 {
    public static void main(String[] args) {
        String passwordRule2 = "Vcdsfgty";

        boolean validPasswordRule2 = Pattern.matches("^[A-Z][a-z]{7,}$",passwordRule2);

        System.out.println(validPasswordRule2);
    }
}
