package inheritanceproblems.singleinheritance;

public class Author extends Book {
    String name;
    String bio;
    public Author(String name,String bio,String title,int publicationYear){
        super(title,publicationYear);
        this.name=name;
        this.bio=bio;
    }
    public void displayDetails(){
        System.out.println("Name: "+name+"\nBio: "+bio);
        super.displayDetails();
    }
}
