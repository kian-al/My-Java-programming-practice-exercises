package com.trains.train1;

import java.util.Scanner;

public class train1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = input.nextInt();
        int number2 = input.nextInt();

        input.close();

        int Number1 = reverseNumber(number1);
        int Number2 = reverseNumber(number2);

        if (Number1 < Number2) {
            System.out.println(number1 + " < " + number2);
        } else if (Number1 > Number2) {
            System.out.println(number2 + " < " + number1);
        } else {
            System.out.println(number2 + " = " + number1);
        }
    }
    public static int reverseNumber(int num) {
        String reversedStr = new StringBuilder(String.valueOf(num)).reverse().toString();
        return Integer.parseInt(reversedStr);
    }
}

