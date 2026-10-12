public class Day_15 {
    public static int getBirthYear(int age) {
        return 2026 - age;
    }

    public static void main(String[] args) {
        String name = "Alice";
        int age = 25;
        System.out.println(name + " was born in " + getBirthYear(age));
    }
}
