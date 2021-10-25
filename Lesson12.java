/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson12;

/**
 *
 * @author erkan
 */
public class Lesson12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Value and Reference Type
        
        Human human = new Human("Mehmet");
        System.out.println(human.getName());
        System.out.println(human.getAge());
        
        addOneYear(human);
        
        System.out.println(human.getName());
        System.out.println(human.getAge());
    }
    
    public static void addOneYear(Human h){
        human.setAge(human.getAge() + 1);
    }
    
}
