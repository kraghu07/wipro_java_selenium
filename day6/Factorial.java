package day6;
import java.util.Scanner;
public class Factorial {

 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 try {
		 System.out.println("Enter a number : ");
		 int num=sc.nextInt();
		 
		 if(num<0) {
			 throw new IllegalArgumentException("Factorial is not defined for negative numbers");
			 
		 }
		 long factorial=1;
		 
		 for(int i=1;i<=num;i++) {
			 factorial=factorial*i;
		 }
		 System.out.println("Factorial of " + num + " is: " + factorial);
     } catch (IllegalArgumentException e) {
         System.out.println("Invalid input: " + e.getMessage());
     } catch (Exception e) {
         System.out.println("Something went wrong. Please enter a valid integer.");
     } finally {
         sc.close();
     }
		 
	 }
}