package newjavaproject;
import java.util.Scanner;
class while1{
	public static void main(String[] args) {
		Scanner myObj=new Scanner(System.in);
		System.out.println("Upto how?");
		int a =myObj.nextInt();
		int i=1;
		do {
			System.out.println(i);
			i++;
		}while(i<=a);
		}
	
}

