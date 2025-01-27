public class StringAlphabetCheck {
    // Method to check if the string contains only alphabetic letters
    public static boolean isAlphabetic(String input) {
        // Validate if the input is not null and matches only alphabetic characters
        return input != null && input.matches("[a-zA-Z]+");
    }

    public static void main(String[] args) {
        // Test cases
        String test1 = "Hello";
        String test2 = "Java123";
        String test3 = "World!";
        String test4 = "";

        // Print the results
        System.out.println("Is '" + test1 + "' alphabetic? " + isAlphabetic(test1)); // true
        System.out.println("Is '" + test2 + "' alphabetic? " + isAlphabetic(test2)); // false
        System.out.println("Is '" + test3 + "' alphabetic? " + isAlphabetic(test3)); // false
        System.out.println("Is '" + test4 + "' alphabetic? " + isAlphabetic(test4)); // false
    }
}
