import java.util.Scanner;
class DayExtra {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);


        
        System.out.println("Enter your First number: ");
        double a = input.nextDouble();
        
        System.out.println("Enter your Second number: ");
        double b = input.nextDouble();
    
             //now we want to do the hypotenuse 
             // hypo = sart(a,b);
       double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("The hypotenuse is : " + c);
            
    input.close();
    
    
    }
}  
