package newjavaproject;
import java.util.*;
public class jcons {
	int age;
	String name;
	
	public jcons(String string, int i) {
		this.name=string;
		this.age=i;
	}
	public void display() {
		System.out.println("The name of the person is "+name+ " Age of this person is "+age);
	}
	public static void main(String[] args) {
		jcons s1=new jcons("Keshav",23);
		jcons s2=new jcons("Ramesh",25);
		s2.display();
		s1.display();
		
	}
}
