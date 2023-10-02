package houseofjava;

import java.util.Scanner;

public class addtwo {

	public static void main(String[] args ) {
		
		Scanner myObj= new Scanner(System.in);
		System.out.println("Enter the first number");
		
		int num1=myObj.nextInt();
		
		System.out.println("Enter the second number ");
		int num2=myObj.nextInt();
		
		int result=add(num1,num2);
		
		System.out.println(" The sum of these are are "+result);
		
	}
	public static int add(int num1, int num2){
		
		int s= num1+num2;
		return s;
		
	}


	}


