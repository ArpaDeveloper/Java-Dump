package main;

public class Main 
{
    public static void main( String[] args )
    {
        //Inputs/Variables
        Author author = new Author("George Orwell", "British");
        Book book1 = new Book("1984", "978-0451524935", author);
        Book book2 = new Book("Animal Farm", "978-0451526342", author);
        Bookshelf bookshelf = new Bookshelf();

        //Add books to shelf
        bookshelf.addBook(book1);
        bookshelf.addBook(book2);


        System.out.println("Initial bookshelf contents:");
        bookshelf.displayBooks();
        System.out.println("");
        bookshelf.removeBook(book1);
        System.out.println("");
        System.out.println("Updated bookshelf contents:");
        bookshelf.displayBooks();
    }
}
