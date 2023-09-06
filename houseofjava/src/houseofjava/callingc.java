package newjavaproject;
import java.util.*;
public class callingc {
	public static callingc s1;
	String name;
	int age;

}
class call1{
	public static void main(String[] args) {
		Scanner myObj=new Scanner(System.in);
		callingc s1=new callingc();
		s1.name="keshav";
		s1.age=13;
		System.out.println("Your name is "+ s1.name +"your age is "+s1.age);
	}
}

