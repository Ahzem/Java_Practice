public class Main {
    // Method to find the middle character(s) of a word
    public static String getMiddleCharacter(String word) {
        int length = word.length();
        int middle = length / 2; // Calculate the middle index
        
        if (length % 2 == 0) {
            // If the length is even, return two middle characters
            return word.substring(middle - 1, middle + 1);
        } else {
            // If the length is odd, return the single middle character
            return word.substring(middle, middle + 1);
        }
    }

    public static void main(String[] args) {
        // Test the method with different words
        String word1 = "hello";
        String word2 = "even";
        
        System.out.println("Middle character(s) of '" + word1 + "': " + getMiddleCharacter(word1)); // Output: l
        System.out.println("Middle character(s) of '" + word2 + "': " + getMiddleCharacter(word2)); // Output: ve
    }
}
