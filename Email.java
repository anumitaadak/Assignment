package com.assignment.practice19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    public static void main(String[] args) {
        String email = "abc.xyz@bl.co.in";

        Pattern p = Pattern.compile("^[a-z]{3}[.][x-z]{3}[@][a-z]{2}[.][c]{1}[o]{1}[.][i][n]$");
        Matcher m = p.matcher(email);
        boolean validEmail = m.matches();

        System.out.println(validEmail);
    }
}
