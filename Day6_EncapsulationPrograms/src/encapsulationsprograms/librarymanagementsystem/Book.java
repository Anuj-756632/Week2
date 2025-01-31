package encapsulationsprograms.librarymanagementsystem;

class Book extends LibraryItem {
    private String genre;

    public Book(String itemId, String title, String author, String genre) {
        super(itemId, title, author);
        this.genre = genre;
    }

    @Override
    public int getLoanDuration() {
        return 14; // Books are available for a 14-day loan period
    }

    public String getGenre() {
        return genre;
    }
}

class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(String itemId, String title, String author, int issueNumber) {
        super(itemId, title, author);
        this.issueNumber = issueNumber;
    }

    @Override
    public int getLoanDuration() {
        return 7; // Magazines are available for a 7-day loan period
    }

    public int getIssueNumber() {
        return issueNumber;
    }
}

class DVD extends LibraryItem {
    private String director;

    public DVD(String itemId, String title, String author, String director) {
        super(itemId, title, author);
        this.director = director;
    }

    @Override
    public int getLoanDuration() {
        return 3; // DVDs are available for a 3-day loan period
    }

    public String getDirector() {
        return director;
    }
}

