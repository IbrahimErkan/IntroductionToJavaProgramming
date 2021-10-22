
package lesson6;

import java.util.Scanner;


public class Lesson6 {

    
    public static void main(String[] args) {
        
        //Switch Case
        
        Scanner s = new Scanner(System.in);
        System.out.println("What day are we on?");   
        String day = s.next();
        
        switch(day){
            case "Monday":
                System.out.println("Monday working day");
                break;
            case "Tuesday":
                System.out.println("Tuesday working day");
                break;
            case "Wednesday":
                System.out.println("Wednesday working day");
                break;
            case "Thursday":
                System.out.println("Thursday working day");
                break;
            case "Friday":
                System.out.println("Friday working day");
                break;
            default:
                System.out.println("not working day");
                break;
                    
        }
        
        
    }
    
}
