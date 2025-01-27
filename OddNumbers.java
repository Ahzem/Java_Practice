public class OddNumbers {
    public static void main(String[] args) {
        int number = 1; // Start from 1

        while (number <= 10) { // Loop until 10
            if (number % 2 == 1) { // Check if the number is odd
                System.out.println(number);
            }
            number++; // Increment the number
        }
    }
}
