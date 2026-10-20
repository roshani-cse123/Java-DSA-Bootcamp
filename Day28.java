/*

Problem 1: The URL Parser (Beginner)

Goal: Write a program that takes a website URL as input and extracts the website name and its extension.
• Input Example: ://google.com
• Validation: The URL must contain www. and .com. If it doesn't, print an error message.

*/
import java.util.Scanner;
public class Day28 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
          String URL;  
      		String name ;
      		String extension;
      		    		    		
		System.out.println("Enter the website URL :   ");
		URL = scanner.nextLine();
		if (URL.contains("www.") &&	URL.contains(".com")){
	   
	   	int  firstdot = URL.indexOf(".");
	   	int seconddot  = URL.lastIndexOf(".");
	   	 
	   	name = URL.substring(firstdot + 1, seconddot);
	   	extension =URL.substring(seconddot + 1);
	   	
	   	System.out.println("The name of the website is :   " + name);
	   	System.out.println("The name of the extension is :  " + extension );
	   	  		
	  	}else { 
	  	System.out.println("you have entered the wrong URL");
	    }
	  	scanner.close();
	}
}
