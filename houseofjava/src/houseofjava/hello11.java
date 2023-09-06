package newjavaproject;
import java.util.Scanner;
public class hello11 {
	public static void main(String[] args) {
		Scanner myObj=new Scanner(System.in);
		System.out.println("How many row ?");
		int a =myObj.nextInt();
		for(int i=5; i>=1; i--)
		{
			System.out.println();
			{
				for(int j=1; j<=i; j++) {
					System.out.print(j);
				}
			}
		}
	}

}
