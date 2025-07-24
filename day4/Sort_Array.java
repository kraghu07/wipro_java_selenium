package day4;

import java.util.ArrayList;
import java.util.Collections;
public class Sort_Array {
public static void main(String[] args) {
	ArrayList<String> employees = new ArrayList<String>();
	employees.add("ANI");
	employees.add("Ram");
	employees.add("Jhon");
	employees.add("Alex");
	employees.add("Mahesh");
	
	
	System.out.println("ArrayList before sorting is : " + employees);
 
	Collections.sort(employees);
	
	System.out.println("ArrayList after sorting is : " + employees);
}
}
