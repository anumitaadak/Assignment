package com.assignment.practice19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastName {
    public static void main(String[] args) {
        String lastName = "Das";

        Pattern p = Pattern.compile("^[A-Z][a-z]{2,}$");
        Matcher m = p.matcher(lastName);
        boolean validLastName = m.matches();

        System.out.println(validLastName);
    }
}
