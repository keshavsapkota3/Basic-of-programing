package newjavaproject;
import java.util.Scanner;
public class hello1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many rows?\n");
        int numRows = scanner.nextInt();

        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
