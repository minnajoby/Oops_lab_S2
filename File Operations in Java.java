import java.io.*;
import java.util.Scanner;

public class FileOperations {
    private static final String FILE_NAME = "sample.txt";
    
    public static void writeToFile(String data) {
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            writer.write(data);
            System.out.println("Data written to " + FILE_NAME);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
    
    public static void appendToFile(String data) {
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write(data);
            System.out.println("Data appended to " + FILE_NAME);
        } catch (IOException e) {
            System.out.println("Error appending to file: " + e.getMessage());
        }
    }
    
    public static void readFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("Data read from " + FILE_NAME + ":");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + FILE_NAME + " not found.");
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nFile Operations Menu:");
            System.out.println("1. Write to file");
            System.out.println("2. Append to file");
            System.out.println("3. Read from file");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice) {
                case 1:
                    System.out.print("Enter data to write: ");
                    String writeData = scanner.nextLine();
                    writeToFile(writeData);
                    break;
                case 2:
                    System.out.print("Enter data to append: ");
                    String appendData = scanner.nextLine();
                    appendToFile(appendData);
                    break;
                case 3:
                    readFromFile();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}
