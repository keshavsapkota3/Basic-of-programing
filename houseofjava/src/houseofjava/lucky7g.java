package houseofjava;
import java.util.*;
public class lucky7g {
	public static void main(String[] args) {
		Scanner myObj= new Scanner(System.in);
		Random random=new Random();
		int count=0;
		int fund=5;
    	int userInput;
    	do {
    		System.out.println("Enter the number between 1-10 or type stop to exit the game ");
    		userInput=myObj.nextInt();
    		fund=fund-1;
    	
    		
		for(int i=0; i<3;  i++) {
			int newrandomnumber = random.nextInt(10)+1;
			System.out.println("Random "+(i+1)+":   "+newrandomnumber);
		if(userInput==newrandomnumber) {
			count=count+1;
		}
	
		}
		if(count==1) {
			fund=fund+3;
		}
		if(count==2) {
			fund=fund+5;
			
		}
		if(count==3) {
			fund=fund+10;
		}
		if (count>0) {
			System.out.println("You won");
		}
		else {
			System.out.println("You lost the game");
		}
		System.out.println("FUND: "+fund);
	}while(fund>0);
		
	}

}
