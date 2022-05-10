package com.assignment.practice19;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PasswordRule3 {
    public static void main(String[] args) {
        String passwordRule3 = "A9gjhuinbm";

        boolean validPasswordRule3 = Pattern.matches("^[A-Z][0-9][a-z]{6,}$",passwordRule3);

        System.out.println(passwordRule3);

    }
}
