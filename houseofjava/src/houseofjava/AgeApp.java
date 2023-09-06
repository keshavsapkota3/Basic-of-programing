package newjavaproject;
import java.util.Scanner;
public class AgeApp{
	public static void main(String[] args) {
		
		Scanner myObj= new Scanner(System.in);
		System.out.println("Enter the your age the i will analysis your grou bro");
		int age=myObj.nextInt();
		if(age<=18) {
			System.out.println(" You are underage");
			if(age>=15) {
				System.out.println("You can ride a mopped");
				
			}
		}
		else if(age>=65) {
			System.out.println("You are an retire bro ");
			
		}
		else {
			System.out.println("You are an adult");
		}
		
	}
}