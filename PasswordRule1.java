package com.assignment.practice19;

import java.util.regex.Pattern;

public class PasswordRule1 {
    public static void main(String[] args) {
        String passwordRule1 = "ASDFGHHDG";

        boolean validPasswordRule1 = Pattern.matches("^[A-Z]{8,}$",passwordRule1);

        System.out.println(validPasswordRule1);

    }
}
