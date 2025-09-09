package com.practice.session4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DangerZone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>(3);
        String input;

        do {
            input = sc.nextLine();
            try {
                String[] parts = input.split(" ");
                switch (parts[0]) {
                    case "1":
                        list = new ArrayList<>(3);
                        break;
                    case "2":
                        list = null;
                        break;
                    case "3":
                        if (list == null) {
                            throw new NullPointerException();
                        }
                        int numToAdd = Integer.parseInt(parts[1]);
                        list.add(numToAdd);
                        break;
                    case "4":
                        if (list == null) {
                            throw new NullPointerException();
                        }
                        int index = Integer.parseInt(parts[1]);
                        if (index < 0 || index >= list.size()) {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        System.out.println(list.get(index));
                        break;
                    case "5":
                        int m = Integer.parseInt(parts[1]);
                        int n = Integer.parseInt(parts[2]);
                        if (n == 0) {
                            throw new ArithmeticException();
                        }
                        System.out.println(m / n);
                        break;
                    case "6":
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + input);
                }
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("oute");
            } catch (NullPointerException ex) {
                System.out.println("nulle");
            } catch (ArithmeticException ex) {
                System.out.println("sefre");
            } catch (Exception ex) {
                // Handle other unexpected exceptions
                System.out.println("Unexpected error");
            }
        } while (!input.equals("6"));
    }
}
