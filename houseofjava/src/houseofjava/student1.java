package houseofjava;
import java.util.Scanner;
public class student1 {
 int age;
 float height;
 int class1;
 student1(int nummber1, int number2, float number3 ){
	 this.age=age;
	 this.class1=class1;
	 this.height=height;
	 
 }
  void display() {
	  System.out.println("The age of the student"+ age+" height of the student is "+height +" The class of the student is "+class1);
  }
public static void main(String[] args) {
	
//	now i have to create object for the intialize the value of the method 
	
	student1 s1= new student1();
	student1 s2= new  student1(); 
	
	
  s1.display();
}
}
