import java.util.Scanner;

public class Day_13_RootCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        System.out.print("Enter the root degree (e.g., 2 for square root, 3 for cube root): ");
        double rootDegree = scanner.nextDouble();

        double squareRoot = Math.sqrt(number);
        double generalRoot = Math.pow(number, 1.0 / rootDegree);

        System.out.println("\n--- Results ---");
        System.out.println("Square root of " + number + " is: " + squareRoot);
        System.out.println(rootDegree + "-th root of " + number + " is: " + generalRoot);

        scanner.close();
    }
}
