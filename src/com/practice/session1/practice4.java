package com.practice.sessionOne;
import java.util.ArrayList;
import java.util.Scanner;

public class practice4 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int number= input.nextInt();
        ArrayList<Integer> takList=new ArrayList<>();
        for (int j=0;j<number;j++){
            takList.add(j + 1);
        }

        int result = taktak(takList, 0);
        System.out.println(result);
    }

    public static int taktak(ArrayList<Integer> list, int index) {
        if (list.size() == 1) {
            return list.get(0);
        }

        index = (index + 1) % list.size();
        list.remove(index);

        return taktak(list, index);
    }
}
