import java.util.Scanner;

public class InputTypeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println("You entered the integer: " + number);
        } else {
            System.out.println("That's not a valid integer!");
        }

        scanner.close();
    }
}
