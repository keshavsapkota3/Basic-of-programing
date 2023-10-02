package houseofjava;
import java.util.*;
public class multidarray {
public static void main(String[] args) {
	Scanner myObj=new Scanner (System.in);
	System.out.println("Enter the number of row?");
	int row= myObj.nextInt();
	System.out.println("Enter the number of column?");
	int col=myObj.nextInt();
	int [][]array=new int[3][3];
	
//	Enter the element of the array
	
	for (int i=0; i<3; i++) {
		for(int j=0; j<3; j++){
			System.out.println("Enter the value of"+i+","+j);
		array[i][j]=myObj.nextInt();
			
		}
	}
	
//	Printing the element of matrix
	
	for(int i=0; i<3; i++ ) {
		System.out.println();
		for(int j=0; j<3; j++) {
			System.out.print(array[i][j]+" ");
		}
	}
	System.out.println();
	
	int value=0; int max=0; 
	for (int i=0; i<3; i++) {
		for (int j=0; j<3; j++) {
			value = value+array[i][j];
			if(max<array[i][j]) {
				max=array[i][j];
			} 
		}
	}
	
	System.out.println("The sum of the element is"+value);
	System.out.println("The maximum number is "+max);
	int min=max;
	for(int i=0; i<3; i++)
	{
		for(int j=0; j<3; j++) {
			if(min>array[i][j]) {
				min=array[i][j];
			}
		}
	}
	System.out.println("THe minimum number is "+min);
}
}