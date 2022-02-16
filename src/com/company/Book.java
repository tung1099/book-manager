package com.company;

public class Book {
    private String bookCode;
    private String name;
    private String author;
    private int a;

    public Book() {
    }

    public Book(String bookCode, String name, String author, int price) {
        this.bookCode = bookCode;
        this.name = name;
        this.author = author;
        this.a = price;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return a;
    }

    public void setPrice(int price) {
        this.a = price;
    }
}
