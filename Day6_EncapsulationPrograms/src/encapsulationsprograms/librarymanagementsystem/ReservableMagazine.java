package encapsulationsprograms.librarymanagementsystem;

class ReservableMagazine extends Magazine implements Reservable {
    private boolean isAvailable;

    public ReservableMagazine(String itemId, String title, String author, int issueNumber) {
        super(itemId, title, author, issueNumber);
        this.isAvailable = true; // By default, the magazine is available
    }

    @Override
    public void reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Magazine reserved: " + getTitle());
        } else {
            System.out.println("Sorry, the magazine is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
