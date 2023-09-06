package newjavaproject;
import java.util.Scanner;
public class hello {
	public static void main(String[] args){
        Scanner myObj= new Scanner(System.in);
        
        System.out.println("What is your name?");
        String name= myObj.nextLine();
        System.out.println("Your name is "+ name );
        if(name.isEmpty()){
           System.out.println("Eror");
           
        }
        
    }
}
