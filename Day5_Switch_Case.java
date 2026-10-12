public class Day5_Switch_Case {
    public static void main(String[] args) {
        String vegetables = "potato";

        switch (vegetables) {
            case "ladyfinger":
                System.out.println("It makes a really tasty dish");
                break;
            case "potato":
                System.out.println("My favorite dish");
                break;
            case "tomato":
                System.out.println("Sweet and tasty dish");
                // Culturally treated as a vegetable, though botanically classified as a fruit
                break;
            default:
                System.out.println("Please enter a valid vegetable");
                break;
        }
    }
}
