package houseofjava;
import java.util.*;
public class Login {
	
	
//	Method that is generating the Username.  
	
	public static void GenerateUsername(String firstN, String LastN) {
	  //To generate the number upto length of  random character
		Random random1= new Random();
		
        //	Making character set to add a random word if the first name and last name is less than 4.
		
		 String characterList="abcdefghijklmnopqrstuvwxyzöä"; //including ö ä.
		 
        //		 Creating StringBuilder to generate random word
		 StringBuilder random= new StringBuilder();
		 String name1;
		 String name2;
		 
		 int count1=firstN.length();
		 // To count the length of the first name.
		 int gap1=0; 
		 // To store number of word that require to become at least 4.
		 char[] newRandomw;
		 if(count1<4)     //This is for if the first name is less than 4 word then making it 4 word letter by adding the random word including Ö and ä;
		 {
			 gap1=4-count1;
			 newRandomw=new char[gap1];
			 
		 for(int i=0; i<gap1; i++) {
				int randomnumber= random1.nextInt(characterList.length());
				 newRandomw[i]=characterList.charAt(randomnumber);
			  
				 
		 }			 
          name1=new String(newRandomw);
         firstN=    firstN.concat(name1);
		 }
		 
		 
//		 For the last name 
		 
//		 To count the length of the last name
		 int count2 =LastN.length();
		 
//		 To store the number of word that require to become atleast 4
		 int gap2 =0;
		 char[] newRandome;
		 if(count2<4) {
			 gap2=4-count2;
			 newRandome=new char[gap2];
			 for(int i=0; i<gap2; i++) {
				 int randomnumber = random1.nextInt(characterList.length());
				 newRandome[i]=characterList.charAt(randomnumber);
			 }
			 name2= new String(newRandome);
			 LastN= LastN.concat(name2);
			String hello=firstN.substring(0,4);
			 hello=hello.concat(LastN);
			 System.out.println(hello); //Displaying User name if the name or last name is less than 4 letter
		 }
		 
		 //passing value to the substring method called makingSubstring.
		 if(firstN.length()>4&&LastN.length()>4) {
			 makingSubstring(firstN, LastN);
		 }
		 
		 
	}
	
//	method for making subString;
 public static void makingSubstring(String nameF,  String  nameL) {
	 
	 nameF=nameF.substring(0,4);
	 nameL=nameL.substring(nameL.length()-4, nameL.length()); 
	 System.out.println(nameF+nameL);
	 
 }

	




//	Method that is generating the email address
	
	public static void GenerateEmail(String first, String last, String domain) {
		

		System.out.println(first+"."+last+"@"+domain);
		
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner myObj= new Scanner(System.in);
//		User input part
		System.out.println("First name?");
		String fName= myObj.nextLine();
		fName=fName.toLowerCase();
		System.out.println("Last name?");
		String lName =myObj.nextLine();
		lName=lName.toLowerCase();
		System.out.println("Business domain name?");
		String cName= myObj.nextLine();
		cName=cName.toLowerCase();
		if(fName.equals("")||lName.equals("")) {
			System.out.println("Error! First and /or las name is missing");
		
		}
		GenerateEmail(fName,lName,cName);
		GenerateUsername(fName,lName); //calling the method;
		
	}

}
