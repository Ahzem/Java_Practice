import java.util.Scanner;

public class Item {
    private String itemCode;
    private String itemName;
    private int itemPrice;

    public void inpuDetails(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the item code: ");
        itemCode = scanner.nextLine();
        System.out.print("Enter the item name: ");
        itemName = scanner.nextLine();
        System.out.print("Enter the item price: ");
        itemPrice = scanner.nextInt();
        scanner.close();
    }

    public void displayDetails(){
        System.out.println("Item code: " + itemCode);
        System.out.println("Item name: " + itemName);
        System.out.println("Item price: " + itemPrice);
    }

}