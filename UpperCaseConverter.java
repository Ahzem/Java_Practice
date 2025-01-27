import java.util.Scanner;

public class UpperCaseConverter {
    // Method to convert a character to uppercase
    public static char makeUpper(char ch) {
        return Character.toUpperCase(ch);
    }

    public static void displayDetails(){
        System.out.println("Item code = u1");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter an alphabetical character: ");
        String inputChar = scanner.next();

        // Convert to uppercase and display
        char upperChar = makeUpper(inputChar.charAt(0));
        System.out.println("Uppercase character: " + upperChar);

        displayDetails();

        scanner.close();
    }
}
