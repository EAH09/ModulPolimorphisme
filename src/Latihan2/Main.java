/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author erisa
 */
public class Main {
    public static void main (String [] args){
        Line a = new Line(12, 10, 9, 7);
        Line b = new Line (14, 11, 10,8);
        
        if(a.isEqual(a,b)){
            System.out.println("Panjang Garis a sama dengan Garis b");
        }
        if(a.isGreater(a,b)){
            System.out.println("Panjang Garis a lebih besar dari Garis b");
            
        }
        if(a.isLess(a, b)){
            System.out.println("Panjang Garis a lebih kecil dari Garis b");
        }
        
        
    }
    
}
