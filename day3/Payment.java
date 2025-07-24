package day3;

abstract class Payments
{
	double amount ;
	
	Payments(double amount)
	{
		this.amount = amount ;
	}
	
	abstract void makePayment() ;
	
	void showSuccessMessage()
	{
		System.out.println("Payment successfull "+amount);
	}
	
}
class CreditCardPayment extends Payments
{
	CreditCardPayment(double amount)
	{
		super(amount) ;
		
	}
	
	void makePayment()
	{
		System.out.println("Credit Card payment is Done...");
	}
}
class UpiPayment extends Payments
{
	 UpiPayment(double amount)
	 {
		super(amount) ;
	}
	
	 void makePayment()
	 {
		 System.out.println("Upi payment is Done...");
	 }
}
public class Payment
{
	public static void main(String[] args)
	{
		Payments py = new CreditCardPayment(45000) ;
		py.makePayment();
		System.out.println("Credit Card Payment Process is Completed ");
		
		Payments py2 = new UpiPayment(30000) ;
		py2.makePayment();
		System.out.println("Upi Payment Process is Completed ");
	}
}


////1.  Package Example with Abstract Class
////bank/Payment.
//
//
//package bank;
//
//public abstract class Payment {
//    protected double amount;
//
//    public Payment(double amount) {
//        this.amount = amount;
//    }
//
//    public void printReceipt() {
//        System.out.println("Payment of ₹" + amount + " processed.");
//    }
//
//    public abstract void makePayment();  // abstract method
//}
//
//
////bank/CreditCardPayment.
//
//
//package bank;
//
//public class CreditCardPayment extends Payment {
//    public CreditCardPayment(double amount) {
//        super(amount);
//    }
//
//    @Override
//    public void makePayment() {
//        System.out.println("Processing Credit Card Payment...");
//        printReceipt();
//    }
//}
//
//
//// bank/UpiPayment.
//
//
//package bank;
//
//public class UpiPayment extends Payment {
//    public UpiPayment(double amount) {
//        super(amount);
//    }
//
//    @Override
//    public void makePayment() {
//        System.out.println("Processing UPI Payment...");
//        printReceipt();
//    }
//}
//
//
//// 2. Interface with  8 Enhancements
////billing/BillGenerator.
//
//
//package billing;
//
//@FunctionalInterface
//public interface BillGenerator {
//    void generate(double amount);
//
//    // Default method
//    default void showBillFormat() {
//        System.out.println("***** BILL RECEIPT *****");
//    }
//
//    // Static method
//    static void displayHeader() {
//        System.out.println("Welcome to Online Billing System");
//    }
//}
//
//
//// 3. Main Class Using Everything + Lambda
////MainClass.
//
//
//package app;
//
//import bank.CreditCardPayment;
//import bank.UpiPayment;
//import billing.BillGenerator;
//
//public class MainApp {
//    public static void main(String[] args) {
//        // Abstract Class Demo
//        CreditCardPayment ccp = new CreditCardPayment(5000);
//        ccp.makePayment();
//
//        UpiPayment upi = new UpiPayment(1500);
//        upi.makePayment();
//
//        // Interface + Lambda Demo
//        BillGenerator.displayHeader();  // static method from interface
//
//        BillGenerator bill = (amount) -> {
//            System.out.println("Amount: ₹" + amount);
//            System.out.println("Thank you for your payment!");
//        };
//
//        bill.showBillFormat();  // default method
//        bill.generate(6500);    // lambda expression used
//    }
//}
//
//
//
//
////
//// Summary of Concepts Covered:
////Concept
////Where Used
////abstract class
////Payment class in bank package
////interface
////BillGenerator in billing package
////default method
////showBillFormat() in interface
////static method
////displayHeader() in interface
////lambda expression
////BillGenerator bill = (amount) -> ...
////packages
////bank, billing, app
//
//
//
//
