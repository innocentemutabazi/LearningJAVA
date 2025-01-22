import java.util.HashMap;
import java.util.Scanner;

public class LibrarySystem {
    private HashMap<String, Integer> library = new HashMap<>();

    // Method to add a book
    public void addBook(String title, String author, int quantity) {
        if (library.containsKey(title)) {
            library.put(title, library.get(title) + quantity);
            System.out.println("Book quantity updated.");
        } else {
            library.put(title, quantity);
            System.out.println("Book added to the library.");
        }
    }

    // Method to borrow a book
    public void borrowBook(String title, int quantity) {
        if (library.containsKey(title)) {
            int availableQuantity = library.get(title);
            if (availableQuantity >= quantity) {
                library.put(title, availableQuantity - quantity);
                System.out.println("You have successfully borrowed " + quantity + " book(s).");
            } else {
                System.out.println("Error: Not enough copies available.");
            }
        } else {
            System.out.println("Error: This book is not available in the library.");
        }
    }

    // Method to return a book
    public void returnBook(String title, int quantity) {
        if (library.containsKey(title)) {
            library.put(title, library.get(title) + quantity);
            System.out.println("You have successfully returned " + quantity + " book(s).");
        } else {
            System.out.println("Error: This book does not belong to the library.");
        }
    }

    // Method to run the main program
    public void start() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nLibrary System:");
            System.out.println("1. Add Books");
            System.out.println("2. Borrow Books");
            System.out.println("3. Return Books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String titleToAdd = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int quantityToAdd = scanner.nextInt();
                    addBook(titleToAdd, author, quantityToAdd);
                    break;

                case 2:
                    System.out.print("Enter book title to borrow: ");
                    String titleToBorrow = scanner.nextLine();
                    System.out.print("Enter quantity to borrow: ");
                    int quantityToBorrow = scanner.nextInt();
                    borrowBook(titleToBorrow, quantityToBorrow);
                    break;

                case 3:
                    System.out.print("Enter book title to return: ");
                    String titleToReturn = scanner.nextLine();
                    System.out.print("Enter quantity to return: ");
                    int quantityToReturn = scanner.nextInt();
                    returnBook(titleToReturn, quantityToReturn);
                    break;

                case 4:
                    System.out.println("Exiting the system.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }

    public static void main(String[] args) {
        LibrarySystem librarySystem = new LibrarySystem();
        librarySystem.start();
    }
}
