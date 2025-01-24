import java.util.Scanner;
class Book{
    private String title;
    private String author;
    private double price;
    Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void displayBookDetails() {
        System.out.println("Book Title is: " + title+" \nAuthor is: " +author+" \nPrice is: " + price);
    }
}
public class UseBook {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter book title ");
        String title = sc.nextLine();

        System.out.println("Enter Author name");
        String author = sc.nextLine();

        System.out.println("Enter Price");
        double price = sc.nextDouble();
        Book book=new Book(title,author,price);
        book.displayBookDetails();

    }
    
}
