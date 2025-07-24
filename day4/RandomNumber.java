package day4;

import java.util.Random;
	public class RandomNumber {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Random random = new Random();
			int RandomNumber = random.nextInt(1000);
			System.out.println("Random number:"+RandomNumber);
		}

	}