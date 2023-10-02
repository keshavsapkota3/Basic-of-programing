package houseofjava;
import java.util.*;
public class lucky7 {
public static void main(String[] args) {
	Random random= new Random();
	Scanner myObj=new Scanner(System.in);
	int fund=5;
	System.out.println("FUNDS: $"+fund);
	System.out.println("Enter the the number that's you want to guess");
	int userInput=myObj.nextInt();
	while(userInput !=-1) {
		fund =fund-1;
	int count=0;
	boolean foundnumber =false;
	 for(int i=0; i<3; i++) {
		 int randomnumber = random.nextInt(10)+1;
		 System.out.println("Random number "+(i+1)+": "+randomnumber);
		 if(randomnumber==userInput) {
			 foundnumber =true;
			count=count+1; 		
		 }	
	 }
	 if(count==1) {
		 System.out.println("You won the game");
		 fund=fund+3;
		 System.out.println("FUNDS: $"+fund);
		 
	 }else if(count==2) {
		 System.out.println("You won the game");
		 fund=fund+5;
		 System.out.println("FUNDS: $"+fund);
	 }else if(count==3) {
		 System.out.println("You won the game ");
		 fund=fund+10;
		 System.out.println("FUNDS: $"+fund);
	 }else {
		 System.out.println("YOu have lost the game go cry and go home");
		 System.out.println("FUNDS: $"+fund);
	 }
	 
	 System.out.println("TO play agian enter the number between 1-10(-1 for exit the game)");
	  userInput=myObj.nextInt();
	 if(fund==0) {
		 System.out.println("Deposite some money to play this game");
		 System.out.println("Note: If you don't have enough money don't play this game");                                                                                                                                                                  
		 break;
	 }
	 
}
	
	System.out.println("Your final fund is "+fund);
}
}