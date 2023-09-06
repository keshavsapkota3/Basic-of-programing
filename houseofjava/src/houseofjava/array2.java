package newjavaproject;
import java.util.Scanner;
public class array2 {
public static void main(String[] args ) {
	String[] furniture = {"Table", "Sofa", "Shelf", "Painting"};
	for(int i=0; i<furniture.length; i++) {
		if(furniture[i].equalsIgnoreCase("sofa")) {
			System.out.println("Sofa found");
		}
	
	}
}
}
