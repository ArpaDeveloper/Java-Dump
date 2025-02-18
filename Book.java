package main;

public class Book {
    //Variables
    private String title;
    private String isbn;
    private Author author;

    //Constructor
    public Book(String title, String isbn, Author author){
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }

    //Getters
    public String getTitle(){
        return title;
    }

    public String getIsbn(){
        return isbn;
    }

    public Author getAuthor(){
        return author;
    }
}
