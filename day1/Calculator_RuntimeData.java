package day1;

public class Calculator_RuntimeData {

	// File: Calculator.java
	    public int add(int a, int b) {
	        return a + b;
	    }
	    public static void main(String[] args) {
	    	Calculator_RuntimeData calc = new Calculator_RuntimeData();
	        int sum = calc.add(3, 4);
	        System.out.println("Sum = " + sum);
	    }
	}
//JVM Runtime Data Areas Overview
//When this program runs, the JVM organizes memory into several logical regions:
//1. Method Area (shared)
//Stores class metadata, bytecodes, static variables, and runtime constant pool.
//Calculator class bytecode, its method definitions (add, main), and resolved references
//are placed here
//2. Heap (shared)
//Holds instances and arrays.
//When new Calculator() is called, space for the Calculator object is allocated in the heap
//3. Java Stacks (per thread)
//Each method call creates a stack frame containing:
//Local variables (a, b, sum, this, and object references)
//Operand stack (used for intermediate computations)
//For add(3,4):
//A frame is created with a=3, b=4, then return result pushed to parent frame’s operand stack
//4. Program Counter (PC) Register (per thread)
//Keeps track of the current instruction's bytecode address.
//It advances through bytecode for main and add methods
//5. Native Method Stack (per thread)
//Used if Java code invokes native libraries (none used here), but still reserved by the JVM
//🛠 Step-by-Step Execution Flow with Areas
//Class Loading
//The Calculator class is loaded into the Method Area.
//main() Execution Begins
//A stack frame is created for main.
//calc reference is stored in its local variables.
//Creating Instance (new Calculator())
//Allocates memory for Calculator object in Heap.
//calc points to this heap object.
//Calling add()
//A new frame for add(int a, int b) is pushed:
//a=3, b=4 in local variables.
//The addition result is computed using the operand stack and returned.
//Returning to main()
//The returned value is stored in sum within the main frame.
//Printing
//System.out.println() runs (its native parts use the Native Method Stack and heap).
//Cleanup
//Stack frames for add and main are popped.
//Threads end; heap memory is later reclaimed by Garbage Collector.

