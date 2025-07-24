package day4;

interface Addition{
	double add(double a, double b); 
}
public class LamdaCalculator {
	public static void main(String[] args) {
//		Lambda Syntax: cn var=(parameter list) -> Body(Logic)
		Addition addn = (a,b) -> (a+b);
		double result=addn.add(10,20);
		System.out.println("Sum : "+ result);
		
		Addition Subn = (a,b) -> a-b;
//		double result1=addn.add(10,20);
		System.out.println("Sum : "+ Subn.add(30,10));
		
		Addition divn = (a,b) -> {
			double result2=a/b;
//			System.out.println("Sum : "+ result2);
			return result2;
		};
//		divn.add(20,10);
		double a=20,b=10;
		divn.add(a,b);
		
	}

}
