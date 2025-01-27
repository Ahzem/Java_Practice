import java.util.Scanner;

public class UtilityMethods {
    
    // i) Method to count the number of vowels in a word
    public static int vowelCount(String word) {
        int count = 0;
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    // ii) Method to convert an alphabetical character to uppercase
    public static char makeUpper(char ch) {
        return Character.toUpperCase(ch);
    }

    // iii) Method to get the decimal part of a floating-point number
    public static double getDeci(double num) {
        return num - Math.floor(num);
    }

    // iv) Method to check whether an integer is even
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Testing vowelCount
        System.out.print("Enter a word: ");
        String word = scanner.next();
        System.out.println("Number of vowels: " + vowelCount(word));

        // Testing makeUpper
        System.out.print("Enter an alphabetical character: ");
        char ch = scanner.next().charAt(0);
        System.out.println("Uppercase character: " + makeUpper(ch));

        // Testing getDeci
        System.out.print("Enter a floating-point number: ");
        double num = scanner.nextDouble();
        System.out.println("Decimal part: " + getDeci(num));

        // Testing isEven
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        System.out.println("Is the number even? " + isEven(number));

        scanner.close();
    }
}
