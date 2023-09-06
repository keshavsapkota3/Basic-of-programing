package newjavaproject;
import java.util.Scanner;

public class Aniversary {
public static void main(String[] args) {
	System.out.println("Enter your age here....");
	Scanner myObj=new Scanner(System.in);
	int age = myObj.nextInt();
	if(age>=18) {
		System.out.println("Congratulation bro now can drive right way");
		
	}
	if(age%10==0&&age%10==5) {
		System.out.println("Anniversary Party!!");
		if(age==100) {
			for(int i=0; i<3; i++) {
				System.out.println("Congratulation");
			}
			
		}
		
	}
	if(age>=40&&age<=50) {
		System.out.println("You are in middle age of your life bro");
	}
	
}
}
