package newjavaproject;
import java.util.*;
public class additems {
	public static void main(String[] args) {
		ArrayList<String> itemsList= new ArrayList<String>();
		Scanner myObj= new Scanner(System.in);
		do {
			System.out.println("Add items (x = exit)");
			String items= myObj.nextLine();
			if(items.equalsIgnoreCase("x")) {
				break;
			}else {
				itemsList.add(items);
			}
			}while(true);
		for(String hello:itemsList ) {
			System.out.println(hello);
		}
	}

}
