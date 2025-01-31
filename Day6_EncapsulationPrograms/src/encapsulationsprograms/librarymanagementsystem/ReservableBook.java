package encapsulationsprograms.librarymanagementsystem;

class ReservableBook extends Book implements Reservable {
    private boolean isAvailable;

    public ReservableBook(String itemId, String title, String author, String genre) {
        super(itemId, title, author, genre);
        this.isAvailable = true; // By default, the book is available
    }

    @Override
    public void reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book reserved: " + getTitle());
        } else {
            System.out.println("Sorry, the book is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
