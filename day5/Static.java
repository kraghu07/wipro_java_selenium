package day5;
class InputValidator{
	static boolean isValidAmount(double amount) {
		return amount>0;
	}
}
public class Static {
	 public static void main(String[] args) {
	        System.out.println(InputValidator.isValidAmount(500)); // true
	        System.out.println(InputValidator.isValidAmount(-10)); // false
}

}



//cannot be overriden
//static method belongs to call not to objects
//can be called from interface name only


