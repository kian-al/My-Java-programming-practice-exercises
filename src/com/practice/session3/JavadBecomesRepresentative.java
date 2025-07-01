package com.practice.session3;

import java.util.ArrayList;
import java.util.Scanner;

public class JavadBecomesRepresentative {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        while (true) {
            String Line = input.nextLine();
            String[] InputArray = Line.split(" ");
            int Command = Integer.parseInt(InputArray[0]);
            String Name = "";
            if (InputArray.length > 1) {
                Name = InputArray[1];
            }
            switch (Command) {
                case 1:
                    AddGoodOrBadStudent(Name, GoodStudents);
                    break;
                case 2:
                    AddGoodOrBadStudent(Name, BadStudents);
                    break;
                case 3:
                    GetNumberOfGoodStudents();
                    break;
                case 4:
                    GetNumberOfBadStudents();
                    break;
                case 5:
                    DeleteGoodStudentsArray();
                    break;
                case 6:
                    DeleteBadStudentsArray();
                    break;
                case 7:
                    PrintGoodStudentByIndex(Integer.parseInt(Name));
                    break;
                case 8:
                    PrintBadStudentByIndex(Integer.parseInt(Name));
                    break;
                case 9:
                    return;
            }
        }
    }

    static ArrayList<String> GoodStudents = new ArrayList<>();
    static ArrayList<String> BadStudents = new ArrayList<>();

    public static ArrayList<String> AddGoodOrBadStudent(String name, ArrayList<String> list) {
        list.add(name);
        return list;
    }

    public static void GetNumberOfGoodStudents() {
        System.out.println(GoodStudents.size());
    }

    public static void GetNumberOfBadStudents() {
        System.out.println(BadStudents.size());
    }

    public static void DeleteGoodStudentsArray() {
        GoodStudents.clear();
    }

    public static void DeleteBadStudentsArray() {
        BadStudents.clear();
    }

    public static void PrintGoodStudentByIndex(int index) {
        index=Integer.parseInt(String.valueOf(index));
        if (index > GoodStudents.size() || index <= 0) {
            System.out.println("not available!");
        } else {
            System.out.println(GoodStudents.get(index-1));
        }
    }

    public static void PrintBadStudentByIndex(int index) {
        index=Integer.parseInt(String.valueOf(index));
        if (index > BadStudents.size() || index <= 0) {
            System.out.println("not available!");
        } else {
            System.out.println(BadStudents.get(index-1));
        }
    }


}
