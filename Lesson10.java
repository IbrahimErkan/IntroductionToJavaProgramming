
package lesson10;

import test.Shape;

public class Lesson10 {

    public Lesson10() {
        Shape s = new Shape();
        s.
    }
    
    
    

    public static void main(String[] args) {
        
        //Methods
        /*
        -Davranısları belirler
        -Kodun tekrar kullanımı acısından onemlidir
        -Bir metod aldıgı parametrelere gore farklı davranabilir
        */
        
        Lesson10 d = new Lesson10();
        int tot = d.total(10, 15);
        System.out.println("10 + 15 = "+tot);
    }
    
    public int total(int firstNumber, int secondNumber){
        int conclusion = firstNumber + secondNumber;
        return conclusion;
    }
    
}
