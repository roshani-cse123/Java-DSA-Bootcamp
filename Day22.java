import java.util.Scanner;

class Day22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.println("Your age is " + age);

        if (age < 0) {
            System.out.print("Please enter a valid age.");
        } else if (age == 0) {
            System.out.print("You're not born yet.");
        } else if (age <= 1) {
            System.out.print("You're an infant.");
        } else if (age < 18) {
            System.out.print("You're just a child.");
        } else if (age < 75) {
            System.out.print("You are an adult.");
        } else {
            System.out.print("You are a senior citizen.");
        }

        input.close();
    }
}
