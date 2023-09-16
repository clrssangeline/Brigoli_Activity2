
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Clarisse Angeline
 */
import java.util.LinkedList;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String Isbn() {
        return isbn;
    }

    public String toString() {
        return "\n Title: " + title + "\n Author: " + author + "\n ISBN: " + isbn;
    }
}

class Library {
    private LinkedList<Book> books;

    public Library() {
        books = new LinkedList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added to the library: " + book);
    }
    
    public Book findBook(String isbn) {
        for (Book book : books) {
            if (book.Isbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }
}
   public class NewClass1{ 
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Library myLibrary;
        myLibrary = new Library();
        
        System.out.println("Welcome to Book Worm!");
        menu();
        Scanner scn = new Scanner(System.in);
        int choice=scn.nextInt();
        while (choice > 0 && choice < 3) {
        switch (choice) {
            case 1:
                num1 (myLibrary);
                
                break;
            case 2:
                num2(myLibrary);
                break;
            case 3:
                break;
            default:
                    System.out.println("invalid choice");
                    
        }
            System.out.println("Anything else? \n Y/N");
            scn.nextLine();
            String answer = scn.nextLine();

            if (!answer.equalsIgnoreCase("y")) {
                break;
            }else
            menu();
          choice = scn.nextInt();     
    }    
    }
    
    public static void menu(){
        System.out.println("1. Add book");
        System.out.println("2. Looking for a book using ISBN");
    }
    
    public static void num1(Library myLibrary){
        Scanner scan= new Scanner (System.in);
        System.out.println("Title of the book ");
        String title=scan.nextLine();
        System.out.println("The Author of the book ");
        String author=scan.nextLine();
        System.out.println("ISBN");
        String ID = scan.nextLine();
        Book newBook = new Book (title,author,ID);
        myLibrary.addBook(newBook);
        
    }
    public static void num2(Library myLibrary){
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter the ISBN of the book \n");
        String look = scan.nextLine();
        Book foundBook = myLibrary.findBook(look);
        if (foundBook != null) {
            System.out.println("Book found: " + foundBook);
        } else {
            System.out.println("Book with ISBN " + look + " not found.");
        }  
    }
}
