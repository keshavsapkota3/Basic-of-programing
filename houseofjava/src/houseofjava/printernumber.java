package newjavaproject;

public class printernumber {
	public static void main(String[] args) {
		int number1 =23;
		int number2 =23;
		
		if(number1==number2) {
			System.out.println("number 1 and the number2 are equal ");
			number2=25;
			System.out.println(number2);
			
		}
		else {
			System.out.print("the number are not equal");
		}
		if(number1>=number2) {
			System.out.println("Number1 is greater than number two");
			number2=25;
			
		}
		else {
			System.out.println("Number two is larger than number1");
			
		}
		
	}

}
