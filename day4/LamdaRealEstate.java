package day4;

	import java.util.*;
	import java.util.function.Predicate;
	import java.util.function.Consumer;

	class Property {
	    private String address;
	    private double price;
	    private int bedrooms;

	    public Property(String addr, double price, int beds) {
	        this.address = addr;
	        this.price = price;
	        this.bedrooms = beds;
	    }
	    public String getAddress() { return address; }
	    public double getPrice() { return price; }
	    public int getBedrooms() { return bedrooms; }

	    @Override
	    public String toString() {
	        return String.format("Property[address='%s', price=%.2f, bedrooms=%d]",
	                             address, price, bedrooms);
	    }
	}

	public class LamdaRealEstate {
	    static List<Property11> Property11 = new ArrayList<>();

	    public static void main(String[] args) {
	        Property11.add(new Property11("123 Main St", 250_000, 3));
	        Property11.add(new Property11("456 Oak Ave", 150_000, 2));
	        Property11.add(new Property11("789 Pine Rd", 500_000, 4));
	        Property11.add(new Property11("321 Cedar Ln", 200_000, 3));

	        // 1. Filter properties under $300k
	      filterAndAct(p -> p.getPrice() < 300_000,
	                     p -> System.out.println("Affordable: " + p));
	  
	        System.out.println();

	        // 2. Filter 3‑bedroom properties for showing
	        filterAndAct(p -> p.getBedrooms() == 3,
	                     p -> System.out.println("Schedule showing: " + p));
	    }

	    static void filterAndAct(Predicate<Property11> tester, Consumer<Property11> action) {
	        for (Property11 p : Property11) {
	            if (tester.test(p)) {
	                action.accept(p);
	            }
	        }
	    }
	}
