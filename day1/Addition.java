package day1;

public class Addition {

	
	 public static void main(String[] args) {
	        int a = 5;
	        int b = 7;
	        int sum = a + b;
	        System.out.println("Sum = " + sum);
	    }
}
//first step is it is going to compile the program
//javac
//This produces Addition.class, which contains Java bytecode.
//Next step is to run the java program
//Loading Sequence (Delegation Model):
//When Addition starts, the JVM needs to load classes in this order:
//Bootstrap Class Loader loads core Java classes like java.lang.Object that every class relies on
//Platform (Extension) Class Loader loads platform-related classes, for example those in JDBC or other Java extensions if used
//Application (System) Class Loader loads Addition.class from your classpath .
//Execution Flow:
//JVM first checks each loader in order (bootstrap → platform → application) to find Addition.
//The Application Loader finds your class, loads and defines it in the JVM.
//JVM verifies and links the class (memory allocation, bytecode checks).
//JVM initializes and runs main(), calculating a + b and printing the result.
//Bootstrap Loader handles Java core classes (java.*).
//Platform Loader handles extension/platform-level libraries.
//Application Loader loads AddNumbers.class from your classpath.
//JVM uses lazy loading, loading classes only when needed
