
package lesson14;

public class Lesson14 {

    public static void main(String[] args) {
        
        // Static / Final
        /*Static
        -It belongs to the class, not the object.
        -Static variables are usually defined with a capital letter.
        */
        
        /*Final
        -Sabit(Constant) - PI
        -Metod final ise Override edilemez.
        -Sınıf final ise genişletilemez.
        
        */
        
        Car2 c1 = new Car2();
        Car2 c2 = new Car2();
        
        c1.hp = 100;
        c2.brand = "Test";
        
        c2.hp = 120;
        c2.brand = "Attempt";
        
        System.out.println(c1.hp);
        System.out.println(c2.hp);
    }
    
}
