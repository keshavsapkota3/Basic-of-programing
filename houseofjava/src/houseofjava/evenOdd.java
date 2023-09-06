package newjavaproject;
import java.util.Scanner;
public class evenOdd {
 public static void main(String[] args) {
	 Scanner myObj=new Scanner(System.in);
	 int num1=myObj.nextInt();
	 
	 
	 
//	  method calling 
	 
	findEvenOdd(num1);

	 
 }
 public static void findEvenOdd(int num1) {
	 
	 
	 
	 if (num1%2==0) {
		 
		 
		 System.out.println("the number you have enter is even ");
		 
	 }
	 else {
		 System.out.println("the number is odd ");
		 
	 }
	 
	 
 }

}
