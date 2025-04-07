package Inheritance;
class Book{
    private String title;
    private int publicationYear;
    public Book (String title, int publicationYear){
        this.title = title;
        this.publicationYear = publicationYear;
    }
    public String getTitle(){
        return title;
    }
    public int getPublicationYear(){
        return publicationYear;
    }
    public void displayInfo(){
        System.out.println("Book title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}
class Author extends Book{
    private String name;
    private String bio;
    public Author(String title, int publicationYear, String name, String bio){
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: " + name);
        System.out.println("Bio: " + bio);
    }
}
public class BookSystem {
    public static void main(String[] args) {
        Author details = new Author("Harry Potter: The Sorcerer's Stone", 1998, "J K Rowling", "J K Rowling is an author that's all i know");
        details.displayInfo();
    }
}
