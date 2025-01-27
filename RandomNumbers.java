import java.util.Random;

// Generate ten two-digit random numbers and display their sum.
public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(90) + 10;
            System.out.println(number);
            sum += number;
        }

        System.out.println("The sum of the numbers is: " + sum);
    }
}