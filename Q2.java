import java.util.Scanner;
import java.util.InputMismatchException;

public class Q2{
	public static void main(String[] args){
		try {
			Scanner read = new Scanner(System.in);
			System.out.println("Enter a Number");
			int num = read.nextInt();
			System.out.println(Integer.toString(num, 2));
		}
		catch (InputMismatchException e){
			System.out.println("Enter an invalid number");
		}
	}

}
