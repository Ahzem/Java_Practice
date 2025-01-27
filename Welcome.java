// class Car {
//     // Class variable (shared by all cars)
//     static int totalCars = 0;

//     // Instance variables (unique to each car)
//     String brand;
//     String color;

//     // Constructor
//     Car(String brand, String color) {
//         this.brand = brand;
//         this.color = color;
//         totalCars++; // Increment totalCars for every new Car object
//     }

//     // Method to display car details
//     void displayDetails() {
//         System.out.println("Brand: " + brand + ", Color: " + color);
//     }

//     // Static method to display total number of cars
//     static void displayTotalCars() {
//         System.out.println("Total Cars: " + totalCars);
//     }
// }

// public class Welcome {
//     public static void main(String[] args) {
//         // Create individual car objects
//         Car car1 = new Car("Toyota", "Red");
//         Car car2 = new Car("Honda", "Blue");
//         Car car3 = new Car("Ford", "Black");

//         // Display details for each car (instance variables)
//         car1.displayDetails();
//         car2.displayDetails();
//         car3.displayDetails();

//         // Display the total number of cars (class variable)
//         Car.displayTotalCars();
//     }
// }


// Class with private fields (Encapsulation)
class BankAccount {
    private String accountNumber;
    private double balance;

    // Constructor to initialize account details
    public BankAccount(String accNumber, double initialBalance) {
        this.accountNumber = accNumber;
        this.balance = initialBalance;
    }

    // Getter method to access account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter method to check balance (read-only access)
    public double getBalance() {
        return balance;
    }

    public int getAccountNumberLength() {
        return accountNumber.length();
    }

    public void setAccountNumber(String accNumber) {
        this.accountNumber = accNumber;
    }

    public void setBalance(double initialBalance) {
        this.balance = initialBalance;
    }

    // Setter method to deposit money (write access)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Setter method to withdraw money (with validation)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

public class Welcome {
    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount myAccount = new BankAccount("123456789", 1000.0);

        // Accessing balance using getter
        // System.out.println("Account Number: " + myAccount.getAccountNumber());
        // System.out.println("Initial Balance: $" + myAccount.getBalance());

        String a = myAccount.getAccountNumber();
        System.out.println(a);
        
        myAccount.setAccountNumber("987654321");
        a = myAccount.getAccountNumber();
        System.out.println(a);
    
        // Depositing money
        myAccount.deposit(500.0);
        // System.out.println("Updated Balance: $" + myAccount.getBalance());

        // Withdrawing money
        myAccount.withdraw(300.0);
        // System.out.println("Balance after withdrawal: $" + myAccount.getBalance());

        // Trying to withdraw more than the balance
        myAccount.withdraw(1500.0);
    }
}
