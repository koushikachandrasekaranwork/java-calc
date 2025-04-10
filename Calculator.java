public class Calculator {

    // Method for addition
    public static int add(int a, int b) {
        return a + b;
    }

    // Method for subtraction
    public static int sub(int a, int b) {
        return a - b;
    }

  
    public static void main(String[] args) {
        // Test the methods
        int a = 10;
        int b = 5;

        System.out.println("Addition: " + add(a, b));
        System.out.println("Subtraction: " + sub(a, b));
       // System.out.println("Multiplication: " + mul(a, b));
       // System.out.println("Division: " + div(a, b));
    }
}