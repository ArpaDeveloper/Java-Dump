package main;

import java.util.ArrayList;

public class Bookshelf {

    //Arraylist
    private ArrayList<Book> books;

    //Constructor
    public Bookshelf(){
        this.books = new ArrayList<>();
    }

    //Method to add a book
    public void addBook(Book book){
        books.add(book);
       // System.out.println("Adding "+book.getTitle()+"...");
    }

    //Method to remove book
    public void removeBook(Book book){
        books.remove(book);
        System.out.println("Removing "+book.getTitle()+"...");
    }

    //Method to display books
    public void displayBooks(){
        if(books.isEmpty()){
            System.out.println("Bookshelf is empty");
        }
        else{
            System.out.println("Books on the shelf:");
            for(Book book : books){
                System.out.println("Title: "+book.getTitle()+", Author: "+book.getAuthor().getName()+", ISBN: "+book.getIsbn());
            }
        }
    }

}
