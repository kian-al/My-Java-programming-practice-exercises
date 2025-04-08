package com.train.main.train1;
import java.util.Scanner;
public class train3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfArray = input.nextInt();
        int numberOfShift = input.nextInt();
        input.nextLine();

        String[] firstListInput = input.nextLine().split(" ");
        input.close();

        int[] listNumber = new int[numberOfArray];
        for (int t = 0; t < numberOfArray; t++) {
            listNumber[t] = Integer.parseInt(firstListInput[t]);
        }

        int len = listNumber.length;
        if (numberOfShift == 0 || len == 0) {
            return;
        }

        numberOfShift = numberOfShift % len;
        for (int i = 0; i < numberOfShift; i++) {
            int last = listNumber[len - 1];
            for (int j = len - 1; j > 0; j--) {
                listNumber[j] = listNumber[j - 1];
            }
            listNumber[0] = last;
        }

        for (int k = 0; k < listNumber.length; k++) {
            System.out.print(listNumber[k] + " ");
        }
    }

}
