package com.practice.session6.ManageLibrary;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            input = scanner.nextLine();

            if (input.equals("0")) {
                break;
            }

            int command = Integer.parseInt(input.split(",")[0]);
            List<String> Part = Arrays.stream(input.split(",")).toList();
            switch (command){
                case 0:
                    break;
                case 1:
                    books.add(new Book(Part.get(1),Part.get(2),Integer.parseInt(Part.get(3))));
                    break;
                case 2:
                    books.stream()
                         .sorted(Comparator.comparingInt(Book::getYear).reversed())
                            .forEach(System.out::println);
                    break;
                case 3:
                    books.stream()
                            .sorted(Comparator.comparingInt(Book::getYear))
                            .forEach(System.out::println);
                    break;
                case 4:
                    books.stream()
                            .filter(item->item.getAuthorName().contains(Part.get(1)))
                            .forEach(System.out::println);
                    break;
                case 5:

                    books.stream()
                            .filter(item->item.getBookName().contains(Part.get(1)))
                            .forEach(System.out::println);
                    break;
                case 6:
                    String authorName=Part.get(1);
                    Long count=books.stream()
                            .filter(item->item.getAuthorName().equals(authorName))
                            .count();
                    System.out.println(count);
                    break;
                case 7:
                    int limitNumber=Integer.parseInt(Part.get(1));
                    books.stream()
                            .limit(limitNumber)
                            .forEach(System.out::println);
                    break;
                case 8:
                    books.stream()
                            .findFirst()
                            .ifPresent(System.out::println);
                    break;
                case 9:
                    books.stream()
                            .skip(Math.max(0,books.size() - 1))
                            .findFirst()
                            .ifPresent(System.out::println);

                default:
                    throw new IllegalStateException("Unexpected value: " + command);
            }
        } while (!input.equals("0"));

        scanner.close();
    }
}

class Book {
    private String bookName;
    private String authorName;
    private int year;

    public Book(String bookName, String authorName, int year) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.year = year;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return bookName + " written by " + authorName + " in " + year;
    }
}