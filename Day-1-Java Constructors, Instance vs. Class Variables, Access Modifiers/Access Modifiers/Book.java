class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String isbn, String title, String author) {
        this.ISBN = isbn;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String a) {
        this.author = a;
    }
}

class EBook extends Book {
    public EBook(String isbn, String title, String author) {
        super(isbn, title, author);
    }

    public void showDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
    }
}
