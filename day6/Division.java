package day6;

public class Division {

    public static void main(String[] args) {
        int numerator = 18;
        int denominator = 0;

        try {
            int result = numerator / denominator;
            System.out.println("Division successful! Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        finally {
        	
        System.out.println("Program completed.");
        }
    }
}