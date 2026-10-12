public class Day_14_SimpleCalculator {

    public static void showWelcomeMessage() {
        System.out.println("Welcome to the Calculator!");
    }

    public static void addNumbers(int first, int second) {
        int result = first + second;
        System.out.println("Addition Result: " + result);
    }

    public static int multiplyNumbers(int first, int second) {
        return first * second;
    }

    public static void main(String[] args) {
        showWelcomeMessage();

        addNumbers(10, 5);

        int multiplicationResult = multiplyNumbers(4, 3);
        System.out.println("Multiplication Result: " + multiplicationResult);
    }
}
