import java.util.Scanner;
class Book{
    private String bookTitle;
    private String authorName;
    private double price;
    private int availability;
    public Book(String bookTitle, String authorName, double price, int availability){
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.price = price;
        this.availability = availability;
    }
    // Getter methods to access book details
    public String getTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return authorName;
    }

    public double getPrice() {
        return price;
    }

    public int getAvailability() {
        return availability;
    }
    public boolean borrowBook(){
        if(availability<=0){
            System.out.println("Book is not available"+bookTitle);
            return false;
        }
        else{
            availability--;
            System.out.println("Book is Successfully borrowed: "+bookTitle+"\n Author Name:"+authorName+"\n Price is: "+price);
            return true;
        }
    }
    public void returnBook() {
        availability++; // Increase availability when the book is returned
        System.out.println("Thank you for returning the book: " + bookTitle);
    }

    public void displayBookInfo() {
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author: " + authorName);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + availability + " copies");
    }
}
public class LibrarySystem {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Book Title");
        String bookTitle = sc.nextLine();

        System.out.println("Author Name");
        String authorName = sc.nextLine();

        System.out.println("Enter price");
        double price=sc.nextDouble();

        System.out.println("Enter Availability");
        int availability=sc.nextInt();

        Book book1 = new Book(bookTitle, authorName, price,availability);
        book1.displayBookInfo();
        book1.borrowBook();
        book1.displayBookInfo();

    }
    
}
