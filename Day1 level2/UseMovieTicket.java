import java.util.Scanner;
class MovieTicket {
    // Attributes of the MovieTicket class
    private String movieName;
    private String seatNumber;
    private double price;

    // Constructor to initialize the movie ticket details
    public MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Method to book a ticket
    public void bookTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Method to display the ticket details
    public void displayTicketDetails() {
        System.out.println("Movie Ticket Details:");
        System.out.println("Movie Name: " + this.movieName);
        System.out.println("Seat Number: " + this.seatNumber);
        System.out.println("Price: $" + this.price);
    }
}
public class UseMovieTicket {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Movie name: ");
        String movieName=sc.nextLine();

        System.out.println("Enter the Seat no: ");
        String seatNumber=sc.next();

        System.out.println("Enter the Ticket price: ");
        double price=sc.nextDouble();
        // Create a MovieTicket object
        MovieTicket ticket = new MovieTicket(movieName, seatNumber, price);

        // Book a ticket with details
        ticket.bookTicket("The Avengers", "A12", 12.99);

        // Display the booked ticket details
        ticket.displayTicketDetails();
    }
}
