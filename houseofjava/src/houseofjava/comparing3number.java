package newjavaproject;

public class comparing3number {
	public static void main(String[] args ) {
		int number1=2;
		int number2=34;
		int number3=56;
		if(number1==number2||number2==number3) {
			System.out.println("some of this number values are  same you have to cahnge it");
			
			
		}
		if(number1>number2&& number1>number3) {
			System.out.println("Basically number 1 is bigger here");
			
		}
		else if(number2>number1&&number2>number3) {
			System.out.println("The number 2 is the greatest number among them ");
			
		}
		else {
			System.out.println("Number 3 is  the greatest number among them");
		}
	}

}
