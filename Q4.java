import java.util.Scanner;

public class Q4{
	public static void main(String[] args){
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter the Weight (Kg)");
		double weight = read.nextDouble();
		
		System.out.println("Enter the height (m)");
		double height = read.nextDouble();
		
		System.out.printf("Your BMI is: %.2f", weight/(height*height));
	}
	

}