package day6;

public class ATM {

 public static void main(String[] args) {
	 int balance=4000;
	 int withdrawalamount=3000;
	 
	 try {
		 if(withdrawalamount>balance) {
			 throw new ArithmeticException("Insufficient balance");
		 }
		 else {
			 balance=withdrawalamount-balance;
			 System.out.println("Withdrwal successfull");
			 System.out.println("Remaining balance is: "+balance);
		 }
	 }
		 catch(ArithmeticException e) {
			 System.out.println("Transaction failed");
		 }
}
}