package library_management_system;

public class Book {
	private String title;
    private String author;
    private String isbn;
    private boolean isLent;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isLent = false;
    }

    // Getters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public boolean isLent() { return isLent; }

    // Lend a book
    public void lendBook() {
        if (!isLent) {
            isLent = true;
        } else {
            System.out.println("The book is already lent.");
        }
    }

    // Return a book
    public void returnBook() {
        if (isLent) {
            isLent = false;
        } else {
            System.out.println("The book is not lent.");
        }
    }

    @Override
    public String toString() {
        return "Book[Title=" + title + ", Author=" + author + ", ISBN=" + isbn + "]";
    }

}
