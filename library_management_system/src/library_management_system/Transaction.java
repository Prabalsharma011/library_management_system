package library_management_system;
import java.util.Date;
public class Transaction {
    private User user;
    private Book book;
    private Date date;
    private String action;  // "borrow" or "return"

    public Transaction(User user, Book book, String action) {
        this.user = user;
        this.book = book;
        this.date = new Date();  // Log the current date
        this.action = action;
    }

    @Override
    public String toString() {
        return action + " transaction - User: " + user.getUserName() + ", Book: " + book.getTitle() + ", Date: " + date;
    }

}
