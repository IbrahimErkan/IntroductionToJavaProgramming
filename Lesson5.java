
package lesson5;

import java.util.Scanner;

public class Lesson5 {

    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = s.nextInt();
        
        System.out.println("Enter your nationality:");
        String nationality = s.next();
        
        // < , > , <= , >= , == , !=
        // AND , OR , && , ||
        
        if (age >= 18) {
            if (nationality.equals("TC")) {
            System.out.println("You can get a license.");
            }else{
                System.out.println("You can't get a license!");
            }
        } else {
            System.out.println("You are not age appropriate, you cannot get a driver's license!");
        }
        System.out.println("end of main method....");
    }
    
}
