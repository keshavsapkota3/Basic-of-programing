package houseofjava;
import java.util.*;
public class namegues{
	public static void main(String [] args) {
		Scanner myObj= new Scanner(System.in);
		String correct="Emma";
		int count=0;
		String hello;
		while(true) {
			System.out.println("Guessed my name (type stop to exit)");
			hello= myObj.nextLine();
			if(!hello.equalsIgnoreCase("stop"))
			{
				
				count+=1;
			}
				
			if(hello.equalsIgnoreCase(correct)) {
				System.out.println("Congratulation");
				break;
			}
			if(hello.equalsIgnoreCase("Stop")) {
				break;
			}
		
		}
		System.out.println("You guessed "+count+" times.");
	}
}