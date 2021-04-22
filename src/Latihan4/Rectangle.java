/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author erisa
 */
public class Rectangle extends Shape{
    //private variable
    private int length;
    private int width;
    //contruktor
    public Rectangle(String color, int length, int width){
        super(color);
        this.length=length;
        this.width=width;
        
    }
    @Override
    public String toString(){
        return "Rectangle[leght="+length + ",width" + ","+super.toString()+"]";
    }
    //override the inherited getRea() to privide the proper implementation
    @Override
    public double getArea(){
        return length*width;
    }
    
    
    
}
