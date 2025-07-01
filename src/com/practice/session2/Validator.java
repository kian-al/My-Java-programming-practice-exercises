package com.practice.session2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    public static Boolean ValidateEmail(String email) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9._]+@[a-zA-Z0-9]+\\.[a-zA-Z]{3}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static Boolean ValidatePhone(String phone) {
        return phone.matches("^09\\d{9}$")// don't nerves about matches parameter you can write your pattern in
                || phone.matches("^\\+989\\d{9}$")// matches function parameter
                || phone.matches("^00989\\d{9}$");
    }
}
