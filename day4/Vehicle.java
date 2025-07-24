package day4;

abstract class Vehicle {
//	public static void main(String[] args) {
//		System.out.println("I am driving Fortuner");
//	}

	abstract void speed();
	abstract void brand() ;
}

class Car extends Vehicle {
	void speed() {
		System.out.println("speed of the car: 4km/hr");
	}
	void brand() {
		System.out.println("Brand is Toyata Fortuner");
	}
}

class Bike extends Vehicle {
	void speed() {
		System.out.println("speed of the Bike: 200km/hr");
	}
	void brand() {
		System.out.println("Brand is Ninza H2");
	}
}