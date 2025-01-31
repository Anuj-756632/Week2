package encapsulationsprograms.librarymanagementsystem;

class ReservableDVD extends DVD implements Reservable {
    private boolean isAvailable;

    public ReservableDVD(String itemId, String title, String author, String director) {
        super(itemId, title, author, director);
        this.isAvailable = true; // By default, the DVD is available
    }

    @Override
    public void reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("DVD reserved: " + getTitle());
        } else {
            System.out.println("Sorry, the DVD is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
