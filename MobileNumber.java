package com.assignment.practice19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumber {
    public static void main(String[] args) {
        String number = "91 9567894320";

        Pattern p = Pattern.compile("^[9][1]\\s[9][0-9]{9}$");
        Matcher m = p.matcher(number);
        boolean validMobileNumber = m.matches();

        System.out.println(validMobileNumber);
    }
}
