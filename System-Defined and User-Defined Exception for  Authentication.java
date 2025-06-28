import java.io.*;
import java.util.Scanner;

class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}

public class ExceptionHandlingDemo {

    public static void readFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("File Contents:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + filename);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    public static void authenticate(String username, String password) throws AuthenticationException {
        String validUsername = "admin";
        String validPassword = "admin123";

        if (!username.equals(validUsername) || !password.equals(validPassword)) {
            throw new AuthenticationException("Invalid username or password!");
        }
        System.out.println("Authentication successful! Welcome, " + username + "!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter filename to read: ");
        String filename = scanner.nextLine();
        readFile(filename);

        System.out.print("\nEnter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        try {
            authenticate(username, password);
        } catch (AuthenticationException e) {
            System.out.println("Authentication Failed: " + e.getMessage());
        }
        scanner.close();
    }
}
