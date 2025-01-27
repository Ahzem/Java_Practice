public class HexagonAreaCalculator {
    // Method to calculate the area of a regular hexagon
    public static double calculateHexagonArea(double sideLength) {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Side length must be positive!");
        }
        return (3 * Math.sqrt(3) / 2) * Math.pow(sideLength, 2);
    }

    public static void main(String[] args) {
        // Example usage
        double sideLength1 = 5;
        double sideLength2 = 7.5;

        System.out.println("The area of a hexagon with side length " + sideLength1 + " is: " + calculateHexagonArea(sideLength1));
        System.out.println("The area of a hexagon with side length " + sideLength2 + " is: " + calculateHexagonArea(sideLength2));
    }
}
