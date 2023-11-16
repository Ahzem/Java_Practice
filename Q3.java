import java.util.Scanner;
import java.util.InputMismatchException;

public class Q3{
	public static void main(String[] args){
		try {
			Scanner read = new Scanner(System.in);
			System.out.println("Enter a Inches");
			int num = read.nextInt();
			System.out.println(num +" Meter is, " + (num/39.37) + " Inches");
		}
		catch (InputMismatchException e){
			System.out.println("Enter an invalid number");
		}
	}

}
