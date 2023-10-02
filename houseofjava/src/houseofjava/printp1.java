package houseofjava;
import java.util.*;
public class printp1 {
	public static void main(String [] args) {
		Scanner myObj= new Scanner(System.in);
		System.out.println("how many row?");
		int a=myObj.nextInt();
		for(int i=0; i<a; i++) {
			System.out.println();
			for(int j=0; j<a; j++) {
				System.out.print(j);
			}
		}
		
		}

}
