package encapsulationsprograms.librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create library items
        LibraryItem book = new ReservableBook("B001", "The Great Gatsby", "F. Scott Fitzgerald", "Fiction");
        LibraryItem magazine = new ReservableMagazine("M001", "Time Magazine", "Henry Luce", 1045);
        LibraryItem dvd = new ReservableDVD("D001", "Inception", "Christopher Nolan", "Christopher Nolan");

        // List to store different types of LibraryItem objects
        List<LibraryItem> libraryItems = new ArrayList<>();
        libraryItems.add(book);
        libraryItems.add(magazine);
        libraryItems.add(dvd);

        // Process each library item: get details, check availability, and reserve
        for (LibraryItem item : libraryItems) {
            System.out.println("Item Details: " + item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item;
                System.out.println("Item Available for Reservation: " + reservableItem.checkAvailability());
                reservableItem.reserveItem();
                System.out.println("Item Available after Reservation: " + reservableItem.checkAvailability());
            }

            System.out.println();
        }
    }
}

