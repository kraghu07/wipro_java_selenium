package day9;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Number: ");
		int a=sc.nextInt();
		System.out.println("Result :"+a);
		sc.close();
	}
}