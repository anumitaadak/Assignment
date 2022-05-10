package com.assignment.practice19;


import com.assignment.practice19.utils.Constants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        String name = "Sneha";

        Pattern p = Pattern.compile("^[A-Z][a-z]{2,}$");
        Matcher m = p.matcher(name);
        boolean validFirstName = m.matches();

        System.out.println(validFirstName);
    }

    public boolean isValidEmail(String email)
    {
    return Pattern.matches(Constants.EMAIL_REGEX,email);
    }
}
