import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

class Library{
    String[] books;
    int no_of_books;
    int issued_count;
    String[] issuedBooks;
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
        this.issuedBooks = new String[100];
    }

    void addBook (String bookName) {
        books[no_of_books] = bookName;
        this.no_of_books += 1;
    }

    boolean checkAvailability (String bookName){
        return Arrays.asList(books).contains(bookName);
    }

    void issueBook (String issuedBook){
        if(checkAvailability(issuedBook)){
        this.issuedBooks[issued_count] = issuedBook;
            issued_count++;

        int index = Arrays.asList(books).indexOf(issuedBook);

        books[index] = null;

        } else {
            System.out.println("This book is not available currently at this moment.");
        }
    }

    void showAvailableBook (boolean issued) {
        if(!issued){
            System.out.println("Available book : ");
            for(String book : books){
                if(book!= null){
                    System.out.print(book + ",");
                }
            }
            System.out.println();
        }else {
            System.out.println("Issued book : ");
        for(String book : issuedBooks){
            if(book!= null){
                System.out.print(book + ",");

            }
        }
            System.out.println();
        }
    }
}

public class Book_Library {
    static void main() {
    Library library = new Library();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the book you want to add :- ");
        library.addBook(sc.nextLine());
        library.showAvailableBook(false);
        System.out.print("Enter the name of the book you want to issue :- ");
        library.issueBook(sc.nextLine());
        library.showAvailableBook(false);
        library.showAvailableBook(true);

        System.out.println("Do you want add more books , yes or no?");
        if (sc.nextLine().trim().equalsIgnoreCase("yes")) {
            System.out.print("Enter the name of the book you want to add :- ");
            library.addBook(sc.nextLine());
        }else{
            System.out.println("Do you want issue more books , yes or no?");
            if (sc.nextLine().trim().equalsIgnoreCase("yes")){
                System.out.print("Enter the name of the book you want to issue :- ");
                library.issueBook(sc.nextLine());
            }else{
                System.out.println("Thanks and visit again.");
            }
        }
    }
}
