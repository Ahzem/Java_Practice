public class WordCounter {
    // Method to count the number of words in a sentence
    public static int countWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0; // Return 0 for null or empty sentences
        }
        
        // Split the sentence into words using spaces as the delimiter
        String[] words = sentence.trim().split("\\s+");
        
        // Return the length of the array (number of words)
        return words.length;
    }

    public static void main(String[] args) {
        // Test cases
        String sentence1 = "Hello world";
        String sentence2 = "    This is a test sentence.   ";
        String sentence3 = "";
        String sentence4 = "OneWord";

        // Print the results
        System.out.println("Number of words in: '" + sentence1 + "' -> " + countWords(sentence1)); // Output: 2
        System.out.println("Number of words in: '" + sentence2 + "' -> " + countWords(sentence2)); // Output: 5
        System.out.println("Number of words in: '" + sentence3 + "' -> " + countWords(sentence3)); // Output: 0
        System.out.println("Number of words in: '" + sentence4 + "' -> " + countWords(sentence4)); // Output: 1
    }
}
