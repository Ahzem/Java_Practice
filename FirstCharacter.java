import java.util.Scanner;

public class FirstCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a word
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // Get the first character of the word
        // char firstChar = ;
        System.out.println("The first character is: " + word.charAt(0));

        scanner.close(); // Close the scanner
    }
}
