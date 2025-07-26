package day6;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCsv {

public static void main(String[] args) {
	String filepath="C:\\Users\\raghu\\Desktop\\Wipro.csv";
	try {
		FileWriter writer=new FileWriter(filepath);
		
		//write headers
		
		writer.append("ID,Name,Age,Department,Salary\n");
		
		//write data rows
		writer.append("101,Ram,22,HR,5000\n");
		 writer.append("102,Krish,30,IT,75000\n");
         writer.append("103,Bhim,29,Finance,68000\n");

         writer.close();

         System.out.println("CSV file written successfully!");

     } catch (IOException e) {
         System.out.println("Error writing CSV: " + e.getMessage());
		
	}
}
}