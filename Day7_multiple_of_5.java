import java.util.Scanner;

public class Day7_multiple_of_5 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        
        int input = num.nextInt();
        
        if (input % 5 == 0) {
            System.out.println("The number is a multiple of 5");
        } else {
            System.out.println("The number is not a multiple of 5");
        }
        
        num.close(); 
    }
}
	
