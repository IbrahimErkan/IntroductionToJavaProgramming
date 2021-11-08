/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dizilmpl;

import java.util.Arrays;

/**
 *
 * @author erkan
 */
public class Stack {
    int[] q;
    int es;
    
    public Stack(int boyut){
        q = new int[boyut];
        es = 0;
    }
    
    public void push(int a){
        if (es == q.length) {
            System.out.println("Yığıt Dolu!");
        } else{
            q[es++] = a;
        }
    }
    
    public int pop(){
        int r = q[es-1];
        
        q[--es] = 0;
        
        return r;
    }
    
    public void yazdir() {
        System.out.println(Arrays.toString(q));
    }
}
