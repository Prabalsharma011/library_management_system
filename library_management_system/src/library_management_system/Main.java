package library_management_system;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create library
        Library library = new Library();

        // Add books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567890");
        Book book2 = new Book("1984", "George Orwell", "0987654321");
        library.addBook(book1);
        library.addBook(book2);
        

        // Register users
        User user1 = new User("Alice", 1);
        User user2 = new User("Bob", 2);
        library.addUser(user1);
        library.addUser(user2);

        // Lend and return books
        library.lendBook(user1, book1);
        library.returnBook(user1, book1);
        
        // Show catalog and transactions
        library.displayCatalog();
        library.displayTransactions();

	}

}
