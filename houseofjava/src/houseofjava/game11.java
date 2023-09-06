package newjavaproject;
import java.util.Scanner;
import java.util.Random;
public class game11 {
	public static void main(String[] args) {
    Scanner myObj= new Scanner(System.in);
    int a = myObj.nextInt();
    Random random= new Random();
    
    int min=10;
    int max=20;
    
    
    for(int i=1; i<=3; i++) {
    	int randomNumber=random.nextInt(max-min+1);
    	if(randomNumber==7) {
    		System.out.println()
    	}
    }
	}

}
