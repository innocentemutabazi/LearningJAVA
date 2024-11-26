import java.util.*;

class Book {
    String title;
    String author;
    int quantity;

    public Book(String title, String author, int quantity) {
        this.title = title;
        this.author = author;
        this.quantity = quantity;
    }

    public void updateQuantity(int quantity) {
        this.quantity += quantity;
    }
}

public class LibrarySystem {

    static List<Book> library = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nLibrary System");
            System.out.println("1. Add Books");
            System.out.println("2. Borrow Books");
            System.out.println("3. Return Books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume the newline character

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    borrowBook();
                    break;
                case 3:
                    returnBook();
                    break;
                case 4:
                    System.out.println("Exiting the system. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addBook() {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();  // consume the newline character

        boolean found = false;
        for (Book book : library) {
            if (book.title.equals(title)) {
                book.updateQuantity(quantity);
                System.out.println("Book quantity updated.");
                found = true;
                break;
            }
        }

        if (!found) {
            library.add(new Book(title, author, quantity));
            System.out.println("New book added to the library.");
        }
    }

    private static void borrowBook() {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter quantity to borrow: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();  // consume the newline character

        boolean found = false;
        for (Book book : library) {
            if (book.title.equals(title)) {
                found = true;
                if (book.quantity >= quantity) {
                    book.updateQuantity(-quantity);
                    System.out.println("Successfully borrowed " + quantity + " copy(s) of " + title + ".");
                } else {
                    System.out.println("Error: Not enough copies available.");
                }
                break;
            }
        }

        if (!found) {
            System.out.println("Error: Book not found.");
        }
    }

    private static void returnBook() {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter quantity to return: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();  // consume the newline character

        boolean found = false;
        for (Book book : library) {
            if (book.title.equals(title)) {
                found = true;
                book.updateQuantity(quantity);
                System.out.println("Successfully returned " + quantity + " copy(s) of " + title + ".");
                break;
            }
        }

        if (!found) {
            System.out.println("Error: This book doesn't belong to the library.");
        }
    }
}
