package newjavaproject;
import java.util.*;
public class Arrayx1 {
public static void main(String[] args) {
	Scanner myObj=new Scanner(System.in);
	System.out.println("How many student?");
	int hell=Integer.parseInt(myObj.nextLine());

	System.out.println("now enter the name of student");
	String[] hello= new String[hell];
	
	for(int i=0; i<hell; i++) {
		System.out.println( i+1+":");
		hello[i]=myObj.nextLine();
	}
   for(int i=0; i<hell; i++) {
	   System.out.println(hello[i]);
   }
	}
	
}

