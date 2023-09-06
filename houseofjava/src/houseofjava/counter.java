package newjavaproject;
import java.util.*;
public class counter{
	  static int count=0;
	  
	  counter(){
		  count++;
		  System.out.println(count);
		  
	  }
	  public static void main(String[] args) {
		  counter s1=new counter();
		  counter s2=new counter();
		  counter s3=new counter();
	  }
}