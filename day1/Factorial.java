package day1;

import java.util.Scanner;
public class Factorial {
    static int fact(int n) {
        return (n <= 1) ? 1 : n * fact(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.println("Factorial: " + fact(num));
//        Multiplication
        System.out.println(num*num);
//        Series of Number Generation
        for(int i=1;i<=num;i++) {
            System.out.println(i);	
        }
        sc.close();
    }
}

