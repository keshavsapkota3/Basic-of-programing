package houseofjava;
import java.util.*;
public class returnmethod {
	public static void main(String[] args) {
		Scanner myObj= new Scanner(System.in);
		System.out.println("Enter the first number");
		int a =myObj.nextInt();
	    System.out.println("Enter the second number");
	    int b=myObj.nextInt();
	    
	    int c=maximum(a,b);
	    System.out.println(c+" is the maximum number.");
	    
	
	}
	
	public static int maximum(int n1, int n2) {
		if(n1>n2) {
			return n1;
		}else {
			return n2;
		}
	}

}
