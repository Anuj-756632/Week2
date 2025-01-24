// Parent class Book
class Book {
    // Instance variables
    public String ISBN;   // public - can be accessed directly
    protected String title;  // protected - can be accessed within the same package or subclass
    private String author;   // private - can only be accessed via getter/setter methods

    // Constructor to initialize Book details
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public getter method to access author name
    public String getAuthor() {
        return author;
    }

    // Public setter method to modify author name
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
    }
}

// Subclass EBook
class EBook extends Book {
    // Constructor to initialize EBook details (calling parent constructor)
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    // Method to display the details of the EBook, including access to protected ISBN and title
    public void displayEBookDetails() {
        System.out.println("ISBN: " + ISBN);    // Accessing public ISBN directly
        System.out.println("Title: " + title);  // Accessing protected title directly
        System.out.println("Author: " + getAuthor());  // Accessing private author through getter method
    }
}

public class BookLibrarySystem {
    public static void main(String[] args) {
        // Creating an instance of Book
        Book book = new Book("978-3-16-148410-0", "Java Programming", "John Doe");
        book.displayBookDetails();

        // Creating an instance of EBook
        EBook ebook = new EBook("978-1-234-56789-7", "Advanced Java", "Jane Smith");
        ebook.displayEBookDetails();

        // Modifying the author name using setter method
        ebook.setAuthor("Alice Johnson");
        System.out.println("\nUpdated EBook Details:");
        ebook.displayEBookDetails();
    }
}
