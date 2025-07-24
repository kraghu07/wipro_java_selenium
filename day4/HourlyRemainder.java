package day4;

import java.util.Timer;
import java.util.TimerTask;

public class HourlyRemainder {
	public static void main(String[] args) {
		String[] tasks= {
				"Dring Water",
				"Do Java Programs",
				"Complete your Lunch",
				"Watch Movie",
				"Practice Codes"
		};
		double[] times= {11.00,12.00,01.00,02.00,03.00};
		String a="";
		
		for(int i=0;i<times.length;i++) {
			if(times[i]<10) {
				a="pm";
			}else {
				a="am";
			}
			System.out.println("Now the time is : "+times[i]+""+a);
			System.out.println("So your task is :"+tasks[i]);
			System.out.println("---------------------------");
		}
		
	}
	
}







//package day4;
//
//import java.util.Timer;
//import java.util.TimerTask;
//
//public class HourlyRemainder {
//
//    public static void main(String[] args) {
//
//        Timer timer = new Timer();
//
//        // Task to be scheduled
//        TimerTask reminderTask = new TimerTask() {
//            @Override
//            public void run() {
//                System.out.println("Reminder: Time to do your task! [" + java.time.LocalTime.now() + "]");
//            }
//        };
//
//        // Schedule the task to run every hour (3600000 milliseconds)
//        long delay = 0;                 // Start immediately
//        long interval = 60 * 60 * 1000; // 1 hour in milliseconds
//
//        timer.scheduleAtFixedRate(reminderTask, delay, interval);
//
//        // Optional: Keep the program running (comment this out in GUI or services)
//        System.out.println("Hourly reminder started. Press Ctrl + C to stop.");
//    }
//}
