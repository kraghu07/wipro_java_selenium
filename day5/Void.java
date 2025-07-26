package day5;


class ReceiptPrinter{
	void printreceipt(String name,double amount) {
		 System.out.println("Customer: " + name);
	        System.out.println("Amount Paid: $" + amount);
	}
}
public class Void {
	public static void main(String[] args) {
        ReceiptPrinter rp = new ReceiptPrinter();
        rp.printreceipt("Dhoni", 7777777);
        
        System.out.println();
    }
}