package library_management_system;
import java.util.ArrayList;
import java.util.List;

public class User {
	private String userName;
    private int userId;
    private List<Book> borrowedBooks;

    public User(String userName, int userId) {
        this.userName = userName;
        this.userId = userId;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getter method for userName
    public String getUserName() {
        return userName;
    }
    
    // Borrow a book
    public void borrowBook(Book book) {
        if (!book.isLent()) {
            borrowedBooks.add(book);
            book.lendBook();
            System.out.println(userName + " has borrowed: " + book.getTitle());
        } else {
            System.out.println(book.getTitle() + " is currently unavailable.");
        }
    }

    // Return a book
    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.returnBook();
            System.out.println(userName + " has returned: " + book.getTitle());
        } else {
            System.out.println("This book was not borrowed by " + userName);
        }
    }

    @Override
    public String toString() {
        return "User[Name=" + userName + ", ID=" + userId + "]";
    }

}
