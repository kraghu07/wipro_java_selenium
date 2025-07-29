package day8;

import java.util.Collections;
import java.util.LinkedList;

public class Collections_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        
        // Adding elements
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Bangalore");
        cities.add("Chennai");

        // Sorting the list
        Collections.sort(cities);

        // Reversing the list
        Collections.reverse(cities);

        // Printing elements
        System.out.println("Sorted and reversed LinkedList:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}