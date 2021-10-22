/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson4;

/**
 *
 * @author erkan
 */
public class Lesson4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Increment Decrement Operators
        short i = 5;
        System.out.println(i);
        i++;
        System.out.println(i);
        
        
        int a = 2;
        System.out.println(a++);
        System.out.println(a);
        
        /*
        first increase/decrease then commit => Prefix
        process first then increase/decrease => Postfix
        */

        
        //Assignment Operators
        int x = 7;
        x += 2; // x = x+2;  x=7
        System.out.println(x);
        x -= 4; // x = x-4;  x=5
        System.out.println(x);
        x *= 6; // x=30
        System.out.println(x);
        x /= 2; // x=15
        System.out.println(x);
        x %= 2; // x=1
        System.out.println(x);
        
        
    }
    
}
