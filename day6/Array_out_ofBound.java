package day6;

public class Array_out_ofBound {
	    public static void main(String[] args) {
	        int[] numbers = {10, 20, 30, 40, 50};  // length = 5

	        try {
	            System.out.println("Value at 6th position: " + numbers[9]);  // index 5 is out of bounds
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Error: You're trying to access an index that doesn't exist.");
	            System.out.println("Exception Message: " + e.getMessage());
	        }

	        System.out.println("Program continues...");
	    }
	}