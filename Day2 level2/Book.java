public class Book {
    // Static variable
    static String libraryName = "City Library"; // Shared across all books
    
    // Final variable
    private final String isbn; // Ensures ISBN can't be changed once assigned
    
    // Instance variables
    private String title;
    private String author;
    
    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    
    // Static method to display library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
    
    // Method to display book details if the object is an instance of Book class
    public void displayBookDetails(Object obj) {
        if (obj instanceof Book) {
            System.out.println("Library: " + libraryName);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("This is not a valid Book object.");
        }
    }

    // Getter for ISBN (to avoid direct modification of the final variable)
    public String getIsbn() {
        return isbn;
    }

    // Getter for Title
    public String getTitle() {
        return title;
    }

    // Getter for Author
    public String getAuthor() {
        return author;
    }
    
    public static void main(String[] args) {
        // Creating book objects
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        Book book2 = new Book("1984", "George Orwell", "9780451524935");
        
        // Displaying library name using the static method
        Book.displayLibraryName();
        
        // Displaying book details
        book1.displayBookDetails(book1);
        book2.displayBookDetails(book2);
    }
}
