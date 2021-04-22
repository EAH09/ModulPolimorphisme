/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author erisa
 */
public class Staf extends Pegawai {
    
    private static final int gajistaf=500000;
    private static final int bonusstaf=10000;
    
    @Override
    public int gaji(){
        return gajistaf;
    }
    
    public int Bonus(){
        return bonusstaf;
    }
    
}
