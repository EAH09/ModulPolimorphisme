/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum1;

/**
 *
 * @author erisa
 */
public class TestRect extends Rect {
    public static void main (String [] args){
        
        Rect r = new Rect (1,1,4,4);
        Rect rr = new Rect (2,3,5,6);
        
        System.out.println("<" + rr.x1 + "," + rr.y1 + "> is inside the union");
        System.out.println(r + " Union "+ rr + " = " + r.union(rr));
        System.out.println(r + " Intersection " + rr + " = " + r.Intersection(rr) );
        
        
        
        
        
        
        /*Rect kotak1 = new Rect(2,3, 5,6);
        Rect kotak2 = new Rect(1,1, 4, 4);
        
        //objek union dan intersection
        Rect intersection = kotak2.Intersection(kotak1);
        Rect union = kotak2.union(kotak1);
        
        //membuat variable untuk memfromat string, biar mudah
        String koordinatKotak1 = String.format("[%d, %d ; %d,%d]", kotak1.x1, kotak1.y1, kotak1.x2, kotak1.y2);
        String koordinatKotak2 = String.format("[%d, %d ; %d,%d]", kotak2.x1, kotak2.y1, kotak2.x2, kotak2.y2);
        String koordinatUnion = String.format("[%d, %d ; %d,%d]", union.x1, union.y1, union.x2, union.y2);
        String koordinatIntersect = String.format("[%d, %d ; %d,%d]", intersection.x1, intersection.y1, intersection.x2, intersection.y2);
        
        System.out.println("<" + kotak1.x2 +","+ kotak1.y2 + ">" + " is inside the union");
        System.out.println(koordinatKotak2 + " union " + koordinatKotak1 + " = " + koordinatUnion );
        System.out.println(koordinatKotak2 + " union " + koordinatKotak1 + " = " + koordinatIntersect );*/
    }
    
}
