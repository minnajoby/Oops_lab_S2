import java.util.Scanner;

public class StringSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of strings to store: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        String[] strings = new String[n];

        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }
        System.out.print("\nEnter the string to search for: ");
        String searchString = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (strings[i].equals(searchString)) {
                System.out.println("String found at index: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("String not found.");
        }
        scanner.close();
    }
}
