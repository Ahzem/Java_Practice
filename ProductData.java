import java.util.Scanner;

public class ProductData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Product code: ");
        int productCode = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Product Name: ");
        String productName = scanner.nextLine();

        System.out.print("Enter Price Rs.: ");
        double price = scanner.nextDouble();

        ProductDetails.displayProductDetails(productCode, productName, price);

        scanner.close();
    }
}

class ProductDetails {
    public static void displayProductDetails(int productCode, String productName, double price) {
        System.out.println("Product Code: " + productCode);
        System.out.println("Product Name: " + productName);
        System.out.println("Price Rs." + price);
    }
}
