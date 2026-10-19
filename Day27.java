import java.util.Scanner;

public class Day27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your email id :   ");
        
        String email = scanner.nextLine();
        
        if (!email.contains("@")) {
            System.out.println("Please enter a valid email id as an email id must contain the @!");
        } else if (email.contains(" ")) {
            System.out.println("Please enter a valid email id (no spaces allowed).");
        } else {
            int atIndex = email.indexOf("@");
            String username = email.substring(0, atIndex);
            String domain = email.substring(atIndex + 1);
            
            System.out.println("Your username is :  " + username);
            System.out.println("Your domain is :   " + domain);
        }
        
        scanner.close();
    }
}
