
package lesson7;


public class Lesson7 {
    
    public static void main(String[] args) {
        
        // Loops
        
        //While
        int i=1;
        while (i<1000) {            
            System.out.println(i++);
            //i++;
        }
        
        System.out.println("--------------------------");
        
        //For
        int j;
        for(j = 1; j < 1000; j*=2){
            System.out.println(j);
        }
        
        System.out.println("--------------------------");
        
        //Do-While
        int k=10;
        do{
            System.out.println(k);
            k *= 2;
        }while(k<100);
        
        
        //break  -->  overtakes the loop..
        int a=1;
        while(a<1000){
            System.out.println(a);
            a *= 2;
            if(a > 4){
                break;
            }
        }
        
        
        //continue  --> moves to the next step in the loop..
        int x=1;
        while(x<1000){
            x *= 2;
            if(x == 8){
                continue;
            }
            System.out.println(x);
        }
        
        
        //sample
        int total = 0, q = 0;
        
        while(q<100){
            total += q;
            q++;
        }
        System.out.println("Total : " + total);
        System.out.println("Average : " + (total/q));
    }
    
}
