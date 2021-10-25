
package lesson11;

public class Lesson11 {

    public static void main(String[] args) {
        
        //Encapsulation -Getter/Setters
        
        Shape s = new Shape();
        
        s.setDepth(0);
        s.setWidth(0);
        s.setHeight(0);
        
        int d = s.getDepth();
        System.out.println(d);
        
    }
    
}
