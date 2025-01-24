import java.util.Scanner;
class Book{
    private String title;
    private String author;
    private double price;

    public  Book(){
        this.title ="null";
        this.author ="null";
        this.price =0.0;
    }
    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void bookDetails(){
        System.out.println("The title of the book is: " + title+"\nAuthor name is: " + author+"\nPrice is: " + price);
    }
}
public class BookMain{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Book Title");
        String title=sc.nextLine();

        System.out.println("Enter Author Name");
        String author=sc.nextLine();

        System.out.println("Enter Price");
        double price=sc.nextDouble();
        // Book book=new Book();
        Book book2=new Book(title,author,price);
        
        book2.bookDetails();
    }
}