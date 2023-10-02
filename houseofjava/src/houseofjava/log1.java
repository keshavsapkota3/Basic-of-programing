package houseofjava;
import java.util.*;
public class log1 {
	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);



        // Prompt for and read user input

        System.out.println("First name?");

        String firstName = in.nextLine();



        System.out.println("Last name?");

        String lastName = in.nextLine();



        System.out.println("Business domain name?");

        String businessDomainName = in.nextLine();



        // Check if any of the input fields is empty

        if (firstName.equals("") || lastName.equals("") || businessDomainName.equals("")) {

            System.out.println("Error! First and/or last name is missing.");

        } else {

            // Generate email and username

            GenerateEmail(firstName, lastName, businessDomainName);

            GenerateUsername(firstName, lastName);

        }

    }



    public static void GenerateEmail(String fName, String lName, String businessDomain) {

        // Convert names and domain to lowercase

        String lowerCaseFirstName = fName.toLowerCase();

        String lowerCaseLastName = lName.toLowerCase();

        String lowerCaseBusinessDomain = businessDomain.toLowerCase();



        // Generate and print the email

        System.out.println(lowerCaseFirstName + "." + lowerCaseLastName + "@" + lowerCaseBusinessDomain);

    }



    public static void GenerateUsername(String fName, String lName) {

        // Extract first four characters from first name and last four characters from last name

        String firstFourChar = fName.substring(0,4);

        String lastFourChar = lName.substring(lName.length() - 4);



        // Generate and print the username

        System.out.println(firstFourChar + lastFourChar);

    }
}




