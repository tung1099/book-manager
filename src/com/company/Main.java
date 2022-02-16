package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Book[] books = new Book[10];
        books[0] = new ProgrammingBook("T00", "Java 1", "DT1", 40, "java", "P1");
        books[1] = new ProgrammingBook("T01", "Java 2", "DT2", 50, "java", "P2");
        books[2] = new ProgrammingBook("T02", "JavaScript", "DT3", 50, "java", "P3");
        books[3] = new ProgrammingBook("T03", "PHP", "DT4", 40, "php", "P4");
        books[4] = new ProgrammingBook("T04", "Python", "DT5", 40, "python", "P5");
        books[5] = new FictionBook("T06", "Series 1", "DT6", 120, "Vien tuong 1");
        books[6] = new FictionBook("T07", "Series 2", "DT7", 80, "Vien tuong 2");
        books[7] = new FictionBook("T08", "Series 3", "DT8", 60, "Vien tuong 3");
        books[8] = new FictionBook("T09", "Series 4", "DT9", 100, "Vien tuong 4");
        books[9] = new FictionBook("T10", "Series 5", "DT10", 150, "Vien tuong 5");

        int sum = getTotalPrice(books);
        System.out.println("Tổng số tiền của 10 cuốn sách là: " + sum);

        int count = countBookByLanguage(books, "java");
        System.out.println("Số sách Programming có ngôn ngữ Java là: " + count);

        int count1 = countBookByPrice(books,100);
        System.out.println("Số sách Fiction có giá < 100 là: " + count1);

        int count2 = countBookByCategory(books,"Vien tuong 1");
        System.out.println("Số sách Fiction có category 'Vien tuong 1' là: " + count2);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập sách bạn cần tìm: ");
        String name = scanner.nextLine();
        findBook(books,name);
 }
    public static int getTotalPrice(Book[] books){
        int sum = 0;
        for (int i = 0; i < books.length; i++) {
             sum += books[i].getPrice() ;
        }
        return sum;
    }
    public static int countBookByLanguage(Book[] books, String language){
        int count = 0;
        for (int i = 0; i < books.length; i++) {

            if (books[i] instanceof  ProgrammingBook){
                if (((ProgrammingBook)books[i]).getLanguage().equals(language))
                    count ++;
            }
        }
        return count;
    }
    public static int countBookByPrice(Book[] books, int price){
        int count = 0;
        for (int i = 0; i < books.length; i++) {

            if (books[i] instanceof FictionBook){
                if (books[i].getPrice() < price)
                    count ++;
            }
        }
        return count;
    }
    public static int countBookByCategory(Book[] books, String category){
        int count = 0;
        for (int i = 0; i < books.length; i++) {

            if (books[i] instanceof FictionBook){
                if (((FictionBook)books[i]).getCategory().equals(category))
                    count ++;
            }
        }
        return count;
    }
    public static void findBook(Book[] books, String name){
        boolean check = false;
        for (int i = 0; i < books.length; i++) {

            if (books[i].getName().equals(name)){
                System.out.println("Sách " + books[i].getName() + " có giá " + books[i].getPrice());
                check = true;
                break;
            }
        }
        if (check == false)
            System.out.println("Không tìm thấy!");
    }
}
