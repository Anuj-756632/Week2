import java.util.ArrayList;

class Book{
	 String title;
     String author;
	
	public Book(String title,String author){
		this.title=title;
		this.author=author;
	}
}

class Library {
      ArrayList<Book> books;  // Library holds a list of books

    // Constructor
    public Library() {
        this.books = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }
}
public class LibraryManagement {
    public static void main(String[] args) {
        // Creating Book objects
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("Moby Dick", "Herman Melville");

        // Creating Library instance
        Library library = new Library();

        // Adding books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Printing all books in the library
        System.out.println("Books in the Library:");
		for(Book book : library.books)
		{
			System.out.println(book.title +" "+ book.author);
		}
    }
}

	