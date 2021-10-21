/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson3;

import java.util.Scanner;

/**
 *
 * @author erkan
 */
public class Lesson3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //String Definition
        
        char c = 'a';
        String s = "Lesson3 String topic text";
        System.out.println(s.charAt(6));
        System.out.println(s.indexOf("t"));
        System.out.println(s.length());
        System.out.println(s.replace('i', 'o'));
        System.out.println(s.substring(2,6));
        
        
        //String Concatenation
        
        String h = "Hello";
        String w = "World!";
        
        System.out.println(h+" "+w);
        System.out.println("Hello"+" " +w);
        
        
        //Getting User Input
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a String expression: ");
        int str = x.nextInt();
        /*
        next() -> string
        nextLine() -> string
        nextByte
        nextShort
        nextInt
        nextDouble
        nextFloat
        */
        
        System.out.println(str*str);
    }
    
}
