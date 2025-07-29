package day8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Collection_Comparable implements Comparable<Collection_Comparable> {
    private String name;
    private int age;

    public Collection_Comparable(String n, int b) {
        this.name = n;
        this.age = b;
    }

    @Override
    public int compareTo(Collection_Comparable other) {
        return this.age - other.age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    public static void main(String[] args) {
        List<Collection_Comparable> a = Arrays.asList(
        		new Collection_Comparable("Seetha", 25),
        		new Collection_Comparable("A", 25),
            new Collection_Comparable("Ram", 24)
        );

        Collections.sort(a);

        System.out.println("Sorted List:");
        System.out.println(a);
    }
}