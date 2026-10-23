import java.util.Scanner;

public class Day28 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);

		System.out.print("Press 1 if you want to convert from celcius to ferenhit ");
		System.out.println("Press 2 if you want to convert from ferenhit to celcius ");
       
		double temp ;
		int choice;
	
		choice = scanner.nextInt();
	 
		if (choice == 1) {
			System.out.println("Please enter the Tempreature ");
			temp = scanner.nextDouble();
			temp = (temp * 9 / 5) + 32;
			System.out.printf("The Tempreature in ferinhit is : %.2f\n", temp);
		}
		else if (choice == 2) {
			System.out.println("Please enter the Tempreature ");
			temp = scanner.nextDouble();
			temp = (temp - 32) * 5 / 9;	
			System.out.printf("The Tempreature in celcius is : %.2f\n", temp);
		}
		else { 
			System.out.println("Incorrect input");
		}
						
		scanner.close();
	}
}
