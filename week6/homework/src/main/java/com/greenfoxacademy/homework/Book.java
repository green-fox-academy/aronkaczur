package com.greenfoxacademy.homework;

public class Book {
    private static int nextId = 0;

    private int id;
    private String title;
    private String author;
    private Integer releaseYear;

    public Book(String title, String author, Integer releaseYear) {
        this.id = nextId++;
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
    }

    public static void setNextId(int nextId) {
        Book.nextId = nextId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Book(int id, String title, String author, Integer releaseYear) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
    }

    public static int getNextId() {
        return nextId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }
}
