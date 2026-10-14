import java.util.Scanner;

class Day23 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double principal;
        double rate;
        int years;
        double timesCompounded; 
        double total;
        
        System.out.print("Enter the principal amount: ");
        principal = input.nextDouble(); 

        System.out.print("Enter the annual interest rate (in decimal, e.g., 0.05 for 5%): ");
        rate = input.nextDouble(); 
        
        System.out.print("Enter the number of years: ");
        years = input.nextInt(); 

        System.out.print("Enter the number of times interest is compounded per year (e.g., 12 for monthly): ");
        timesCompounded = input.nextDouble(); 
        
        // Formula: A = P(1 + r/n)^(n*t)
        total = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.println("Your total balance is: " + total);
        
        input.close();   
    }
}
