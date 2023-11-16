import java.util.Scanner;
import java.util.InputMismatchException;

public class Q5{
	double weight;
	double height;
	double bmi;
	
	void calc_bmi(double bmi){
		if (bmi < 18.5){
			System.out.println("You are underweight.");
		} else if (bmi<25 && bmi>18.5){
			System.out.println("Your weight is normal.");
		} else if (bmi<30 && bmi>25){
			System.out.println("You are overweight.");
		} else {
			System.out.println("You are obese.");
		}
	}
	
	public static void main(String[] args){
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter the Weight (Kg)");
		double weight = read.nextDouble();
		
		System.out.println("Enter the height (m)");
		double height = read.nextDouble();
		
		double bmi = weight/(height*height);
		
		Q5 result = new Q5();
		result.calc_bmi(bmi);
	}
}
