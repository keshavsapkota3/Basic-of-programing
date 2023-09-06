package newjavaproject;
import java.util.ArrayList;
import java.util.*;

public class arrayL1 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Kia");
        cars.add("Tesla");
        cars.add("BMW");
        cars.add("Renault");
        
        for (String car : cars) {
            System.out.println(car); // Corrected from System.out.prinln(name);
        }
        System.out.println("MODIFIED LIST");
        cars.remove("Tesla");
        cars.add(2, "Ford");
        for (String  car : cars) {
            System.out.println(car);
            
        }
        Collections.sort(cars);
        for (String car : cars) {
            System.out.println(car);
            
        }

    }
}