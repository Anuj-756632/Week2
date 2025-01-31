package inheritanceproblems.singleinheritance.librarymanagementsystem;

public class Book {
    String title;
    int publicationYear;
    public Book(String title,int publicationYear){
        this.title=title;
        this.publicationYear=publicationYear;
    }
    public void displayDetails(){
        System.out.println("Title: "+title+"\nPublication Year: "+publicationYear);
    }

}
