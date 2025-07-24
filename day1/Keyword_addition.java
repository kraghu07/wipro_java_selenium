package day1;

import java.util.Scanner;
public class Keyword_addition {
	public static void main(String[] args) {
		   // keywords: public, static, void
	        Scanner sc = new Scanner(System.in);   
	        // keywords: new, class name Scanner
	        System.out.print("Enter first number: ");
	        int a = sc.nextInt();   
	        // keyword: int
	        System.out.print("Enter second number: ");
	        int b = sc.nextInt();  
	        // keyword: int
	        int sum = a + b;        
	        // keyword: int
	        System.out.println("Sum = " + sum);
	        sc.close();             
	        // closes the scanner
	    }
}
//Keyword	Purpose in This Program
//import	Brings in Scanner so you can use it
//public	Makes the class and main method accessible from outside
//class	Declares a new class named Keyworaddition
//static	main belongs to the class itself, not an object
//void	main doesn't return a value
//new	Creates a new Scanner object to read input
//int	Declares integer variables (a, b, sum)
//String[] args	Handles command line args—String is a class, [] is array notation
