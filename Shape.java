/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson11;

/**
 *
 * @author erkan
 */
public class Shape {
    
    private int width;
    private int depth;
    private int height;

    
    public int getDepth(){
        return depth;
    }
    
    public void setDepth(int a){
        if(a == 1){
            depth = 0;
        }else{
            depth = a;
        }
    }
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if(width == 1){
            this.width = width;        
        }else{
            this.width = width;        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if(height == 1){
            this.height = height;        
        }else{
            this.height = height;
        }
    }
    
    
}
