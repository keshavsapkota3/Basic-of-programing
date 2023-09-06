package newjavaproject;
import java.util.Scanner;
public class teaching {
	public static void main(String[] args) {
		Scanner myObj=new Scanner(System.in);
		System.out.println("Enter the first number");
		String a=myObj.nextLine();
		System.out.println("Enter the second number?");
		String  b=myObj.nextLine();
		int c=Integer.parseInt(a)*Integer.parseInt(b);
		System.out.println("The multiplication of numbers is "+c);
		System.out.println("What is your name bro?");
		String name= myObj.nextLine();
		System.out.println("Your name is "+name);
	}

}
