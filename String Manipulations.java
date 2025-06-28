import java.util.Scanner;

public class StringManipulations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int length = inputString.length();
        System.out.println("Length of the string: " + length);

        String upperCaseString = inputString.toUpperCase();
        System.out.println("String in uppercase: " + upperCaseString);

        String lowerCaseString = inputString.toLowerCase();
        System.out.println("String in lowercase: " + lowerCaseString);

        if (length > 3) {
            char charAtPosition = inputString.charAt(3);
            System.out.println("Character at position 3: " + charAtPosition);
        } else {
            System.out.println("String is too short to extract character at position 3.");
        }

        if (length > 5) {
            String substring = inputString.substring(2, 5);
            System.out.println("Substring from index 2 to 5: " + substring);
        } else {
            System.out.println("String is too short to extract a substring from index 2 to 5.");
        }

        String reversedString = new StringBuilder(inputString).reverse().toString();
        System.out.println("Reversed string: " + reversedString);

        scanner.close();
    }
}
