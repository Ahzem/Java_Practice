import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
	    int choice = scanner.nextInt();
	    
	    String[] categories = {"PCs", "Notebooks", "Tablets", "Phones", "Аccessories"};
	    
	    //complete the code
        try {
            int[] N = new int[categories.length]; // Initialize N array with the length of categories
            for (int i = 0; i < categories.length; i++) {
                N[i] = i; // Assigning index values to elements in the array
            }

            if (choice >= 0 && choice < categories.length) {
                System.out.println(categories[N[choice]]); // Accessing the category based on user's choice
            } else {
                System.out.println("Wrong Option");
            }
        } catch (Exception e) {
            System.out.println("Wrong Option");
        }
    }
}