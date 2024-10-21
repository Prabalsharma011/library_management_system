package library_management_system;
import java.util.ArrayList;
import java.util.List;

public class Library {

	private List<Book> catalog;
    private List<User> users;
    private List<Transaction> transactions;

    public Library() {
        catalog = new ArrayList<>();
        users = new ArrayList<>();
        transactions = new ArrayList<>();
    }

    // Add a book to the catalog
    public void addBook(Book book) {
        catalog.add(book);
        System.out.println("Added book: " + book.getTitle());
    }

    // Register a new user
    public void addUser(User user) {
        users.add(user);
        System.out.println("Registered user: " + user.getUserName());
    }

    // Lend a book
    public void lendBook(User user, Book book) {
        user.borrowBook(book);
        transactions.add(new Transaction(user, book, "borrow"));
    }

    // Return a book
    public void returnBook(User user, Book book) {
        user.returnBook(book);
        transactions.add(new Transaction(user, book, "return"));
    }

    // Display all books in the catalog
    public void displayCatalog() {
        System.out.println("Library Catalog:");
        for (Book book : catalog) {
            System.out.println(book);
        }
    }

    // Display all transactions
    public void displayTransactions() {
        System.out.println("Transaction History:");
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }
}
