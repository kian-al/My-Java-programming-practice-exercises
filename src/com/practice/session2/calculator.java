package com.practice.session2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class calculator {
    public static String solve(String equation)
    {
        Pattern pattern = Pattern.compile("(\\S+)\\s*\\+\\s*(\\S+)\\s*=\\s*(\\S+)");
        Matcher matcher = pattern.matcher(equation);

        if (matcher.find()) {
            String a = matcher.group(1);
            String b = matcher.group(2);
            String resultStr = matcher.group(3);

            String unknown;
            int known;
            int result = Integer.parseInt(resultStr);
            int remainder;

            if (a.contains("#")) {
                unknown = a;
                known = Integer.parseInt(b);
                remainder = result - known;
                String remainderStr = String.valueOf(remainder);
                String unknownRegex = unknown.replace("#", "\\d");
                Pattern startsWith = Pattern.compile("^(?=" + unknownRegex + ").*");
                Pattern endsWith = Pattern.compile(".*(?<=" + unknownRegex + ")$");
                boolean matchesStart = startsWith.matcher(remainderStr).matches();
                boolean matchesEnd = endsWith.matcher(remainderStr).matches();

                if (matchesStart == false || matchesEnd == false) {
                    return remainderStr+" + "+b+" = "+resultStr;
                } else {
                    return "-1";
                }
            } else {
                unknown = b;
                known = Integer.parseInt(a);
                remainder = result - known;
                String remainderStr = String.valueOf(remainder);
                String unknownRegex = unknown.replace("#", "\\d");
                Pattern startsWith = Pattern.compile("^(?=" + unknownRegex + ").*");
                Pattern endsWith = Pattern.compile(".*(?<=" + unknownRegex + ")$");
                boolean matchesStart = startsWith.matcher(remainderStr).matches();
                boolean matchesEnd = endsWith.matcher(remainderStr).matches();

                if (matchesStart==false || matchesEnd==false){
                    return "-1";
                }else {
                    return a+" + "+remainderStr+" = "+resultStr;
                }
            }
        } else {
            return "No match found in input.";
        }
    }

    public static void main(String[] args) {
        System.out.println(solve("54 + 1#3 = 230"));
    }
}
