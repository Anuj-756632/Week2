public class Book {
    // Static variable: shared across all books
    static String libraryName = "City Central Library";
    
    // Final variable: ISBN cannot be changed once assigned
    final String isbn;
    
    // Instance variables
    String title;
    String author;

    // Constructor to initialize book details
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;  // ISBN is final, so it can only be assigned once
    }

    // Static method to display the library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Instance method to display book details
    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
            displayLibraryName(); // Display the library name for each book
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create some book instances
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        Book book2 = new Book("1984", "George Orwell", "9780451524935");

        // Display book details
        book1.displayBookDetails();
        book2.displayBookDetails();
    }
}
