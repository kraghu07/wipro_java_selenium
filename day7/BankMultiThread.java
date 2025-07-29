package day7;

public class BankMultiThread {
		private double balance;
		
		public BankMultiThread(double initialBalance) {
			this.balance=initialBalance;
		}
		public synchronized void deposit(double amount) {
			balance=balance+amount;
			System.out.printf("%s deposited:%2f,Balance:%2f%n",Thread.currentThread().getName(),amount,balance);
		}
		public synchronized void withdraw(double amount) {
			if(balance>=amount) {
				balance=balance-amount;
				System.out.printf("%s withdrew:%.2f,Balance:%.2f%n",Thread.currentThread().getName(),amount,balance);
				
			}else {
				System.out.printf("%s:Insuffieceint fund for withdrawing:%.2f,Balance:%.2f%n",Thread.currentThread().getName(),amount,balance);
				
			}
		}
		public double getBalance() {
			return balance;
		}
	  public class Banking_Demo{
		  public static void main(String[] args) throws InterruptedException {
			  Bank_mul account=new Bank_mul(1000.0);
			  Thread t1=new Thread(()->{
				  for(int i=0;i<3;i++) {
					  account.deposit(200.0);
					  sleep(100);
				  }
			  },"Deposit-Thread");
			  Thread t2=new Thread(()->{
				  for(int i=0;i<3;i++) {
					  account.withdraw(150.0);
					  sleep(120);
				  }
			  },"Withdraw-thread");
			  
			  t1.start();
			  t2.start();
			  t1.join();
			  t2.join();
			  System.out.printf("Final Balance=%.2f%n", account.getBalance());
		  }
	public static void sleep(int i) {
		  try {
			  Thread.sleep(2000);
		  }catch(InterruptedException ignored)
		  {}
		  }
	  }
		
	}