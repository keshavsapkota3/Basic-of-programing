package houseofjava;
import java.util.*;
public class printp2 {
	public static void main(String[] args) {
		Scanner myObj=new Scanner(System.in);
		System.out.println("Enter the rows?");
		int a= myObj.nextInt();
		
		
		for(int i=0; i<a; i++) {
			System.out.println();
			for(int j=0; j<=a-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print("*");
			}
		}
	}

}
