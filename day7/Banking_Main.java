package day7;

public class Banking_Main {
		public static void main(String[] args) throws InterruptedException {
			  BankMultiThread account=new BankMultiThread(1000.0);
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

