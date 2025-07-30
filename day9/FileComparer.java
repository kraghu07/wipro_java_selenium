package day9;

import java.io.*;
import java.util.*;

public class FileComparer {
    public static boolean areFilesIdentical(String file1, String file2) throws IOException {
        try (BufferedReader br1 = new BufferedReader(new FileReader(file1));
             BufferedReader br2 = new BufferedReader(new FileReader(file2))) {

            String line1, line2;
            while ((line1 = br1.readLine()) != null) {
                line2 = br2.readLine();
                if (line2 == null || !line1.equals(line2)) {
                    return false;
                }
            }
            return br2.readLine() == null; // Ensure second file isn't longer
        }
    }

    public static void main(String[] args) throws IOException {
        boolean result = areFilesIdentical("C://Users/raghu/OneDrive/Desktop/ALLTextDocs/file1.txt", "C://Users/raghu/OneDrive/Desktop/ALLTextDocs/file2.txt");
        System.out.println(result ? "Files are the same." : "Files are different.");
    }
}