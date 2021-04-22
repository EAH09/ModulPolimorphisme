/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasTambahan;

/**
 *
 * @author erisa
 */
public class OperasiPenjumlahan extends OperasiBilanganAbs {
    
    
    @Override
    protected void set_A(double a){
        this.a = a;
    }
    @Override
    protected double get_A(){
        return this.a;
    }
    
    @Override
    protected void set_B(double b){
        this.b = b;
    }
    @Override
    protected double get_B(){
        return this.b;
    }
    
    @Override
    protected void set_C(){
        this.c = this.a + this.b;
        
    }
    @Override
    protected double get_C(){
        return this.c;
        
    }

    @Override
    protected void tampil() {
        
        set_C();
        System.out.println("Operasi Penjumlahan");
        System.out.println("A = "+get_A());
        System.out.println("B = "+get_B());
        System.out.println("Hasil A + B = "+ get_C());
        System.out.println("--------------------------");
        
    }
    
    
    
    
}
