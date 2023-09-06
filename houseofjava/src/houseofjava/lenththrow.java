package newjavaproject;
import java.util.*;
public class lenththrow {
	public static void main(String[] args) {
		Scanner myobj= new Scanner(System.in);
		int[] hello= new int[3];
		for(int i=0; i<3; i++) {
			System.out.println("Throw length");
			hello[i]=myobj.nextInt();
		}
		for(int i=0; i<3; i++) {
			System.out.println("Throw "+(i+1)+": "+hello[i]);
		}
	}

}
