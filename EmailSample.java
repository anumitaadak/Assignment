package com.assignment.practice19;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.stream.Collectors;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)

public class EmailSample {
    UserRegistration userRegistration = new UserRegistration();
    private String email;
    private boolean expected;


    public EmailSample(String email, boolean expected) {
        this.email = email;
        this.expected = expected;
    }

        @Parameterized.Parameters

      public static Collection emailInputs() {
            return Arrays.asList(new Object[][] {

                { "abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc@1.com", false},
                {"abc@gmail.com.com", true},
                {"abc+100@gmail.com", true}

            });


        }

        @Test
    public void testParameterisedData_thenExpectedResult() {
        Assert.assertEquals(expected,userRegistration.isValidEmail(email));
        }

}
