import java.util.Scanner;
import java.util.InputMismatchException;
public class Q1 {
    void checking(double num) {
        if (Double.isNaN(num)) {
            System.out.println("Input a number!");
        } else if (num > 0) {
            System.out.println("The Number Is Positive");
        } else if (num < 0) {
            System.out.println("The number is Negative");
        } else {
            System.out.println("It is a Zero");
        }
	}

    public static void main(String[] args){
		try {
			Scanner read = new Scanner(System.in);
			double num = read.nextDouble();
			Q1 number = new Q1();
			number.checking(num);
		}
		catch (InputMismatchException e){
			System.out.println("Enter an invalid number");
		}
    }
}
