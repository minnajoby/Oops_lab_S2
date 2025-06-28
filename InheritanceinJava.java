import java.util.Scanner;

class Publisher {
    String publisherName;
    String publisherAddress;

    public void inputPublisherDetails(Scanner scanner) {
        System.out.print("Enter Publisher Name: ");
        publisherName = scanner.nextLine();

        System.out.print("Enter Publisher Address: ");
        publisherAddress = scanner.nextLine();
    }

    public void displayPublisherDetails() {
        System.out.println("Publisher Name: " + publisherName);
        System.out.println("Publisher Address: " + publisherAddress);
    }
}

class Book extends Publisher {
    String bookTitle;
    String authorName;
    double price;

    public void inputBookDetails(Scanner scanner) {
        System.out.print("Enter Book Title: ");
        bookTitle = scanner.nextLine();

        System.out.print("Enter Author Name: ");
        authorName = scanner.nextLine();

        System.out.print("Enter Book Price: ");
        price = scanner.nextDouble();
        scanner.nextLine(); 
    }

    public void displayBookDetails() {
        displayPublisherDetails();
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author Name: " + authorName);
        System.out.println("Book Price: " + price);
    }
}

class Literature extends Book {
    String genre;

    public void inputLiteratureDetails(Scanner scanner) {
        inputBookDetails(scanner);
        System.out.print("Enter Genre (e.g., Poetry, Drama): ");
        genre = scanner.nextLine();
    }

    public void displayLiteratureDetails() {
        displayBookDetails();
        System.out.println("Literature Genre: " + genre);
    }
}

class Fiction extends Book {
    String subGenre;

    public void inputFictionDetails(Scanner scanner) {
        inputBookDetails(scanner);
        System.out.print("Enter Fiction Subgenre (e.g., Mystery, Thriller): ");
        subGenre = scanner.nextLine();
    }

    public void displayFictionDetails() {
        displayBookDetails();
        System.out.println("Fiction Subgenre: " + subGenre);
    }
}

public class BookManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Literature literatureBook = new Literature();
        Fiction fictionBook = new Fiction();

        System.out.println("Enter details for Literature Book:");
        literatureBook.inputPublisherDetails(scanner);
        literatureBook.inputLiteratureDetails(scanner);

        System.out.println("\nEnter details for Fiction Book:");
        fictionBook.inputPublisherDetails(scanner);
        fictionBook.inputFictionDetails(scanner);

        System.out.println("\n--- Literature Book Details ---");
        literatureBook.displayLiteratureDetails();

        System.out.println("\n--- Fiction Book Details ---");
        fictionBook.displayFictionDetails();

        scanner.close();
    }
}
