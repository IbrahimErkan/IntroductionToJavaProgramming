
package lesson15;

public class Lesson15 {

    public static void main(String[] args) {
        
        //Nesne Tabanlı Programlama özellikleri
        
        /* Çok Biçimlilik (Polymorphism)
        -Bir çok forma sahip olma -Shape class
        */
        
        /* Kapsülleme (Encapsulation)
        -Uygulama (implementation) detaylarını gizleme 
        -Bilgi gizleme
        */
        
        /* Kalıtım
        -Shape, Polygon, Rectangle
        */
        
        /* Abstraction
        - Nesneden soyut olarak sınıf oluşturulur
        */
        
        
        Animal a = new Animal();
        a.noise();
        
        Animal cat = new Cat();
        Animal dog = new Dog();
        
        cat.noise();
        dog.noise();
        
    }
    
}
