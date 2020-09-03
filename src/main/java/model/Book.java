package model;

public class Book {

    private String publishser;
    private int year;
    private String author;
    private String title;
    private String isbn;

    // only in featureA branch

    public Book(String publishser, int year, String author, String title, String isbn) {

        this.publishser = publishser;
        this.year = year;
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getPublishser() {
        return publishser;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPublishser(String publishser) {
        this.publishser = publishser;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAuthor(String author) {
        this.author = author;
    }



}
