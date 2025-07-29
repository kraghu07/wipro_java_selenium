package day8;

import java.util.Map;
import java.util.TreeMap;

public class Collections_Treemap {
    public static void main(String[] args) {
        TreeMap<Integer, String> studentMap = new TreeMap<>();

        // Adding entries
        studentMap.put(102, "Aisha");
        studentMap.put(101, "Rahul");
        studentMap.put(104, "Meena");
        studentMap.put(103, "Zain");

        // Iterating over TreeMap (automatically sorted by key)
        System.out.println("TreeMap entries (sorted by key):");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

