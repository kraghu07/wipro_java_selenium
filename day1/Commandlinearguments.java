package day1;

public class Commandlinearguments {	
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two numbers.");
            return;
        }
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println("Sum = " + (a + b));
        } catch (NumberFormatException e) {
            System.out.println("Invalid integer input: " + e.getMessage());
        }
    }
}
//These are values you pass to your Java program when you run it from the terminal or IDE.
//They are received by main as a String array: String[] args.
//Each space-separated item becomes an element (args[0], args[1], ...),
//and you can check how many were passed using args.length
