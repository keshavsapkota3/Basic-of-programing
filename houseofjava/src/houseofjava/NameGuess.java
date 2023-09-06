package newjavaproject;
import java.util.Scanner;
public class NameGuess {
	public static void main(String[] args) {
		Scanner myObj=new Scanner(System.in);
		String name ="Emma";
		int count=1;
		System.out.println("Guess my name(type stop to exit)");
		do {
			String Gname=myObj.nextLine();
			
			if(!Gname.equals("stop")) {
				count=count++;
			}
			if(Gname.equalsIgnoreCase(name)) {
				System.out.println("Congratulation");
				break;
				
			}
			else if(Gname.equalsIgnoreCase("stop")) {
				break;
			}
			System.out.println("Guess my name (type stop to exit");
		}while(true);
		System.out.println("You guessed "+count+" times");
	}

}
