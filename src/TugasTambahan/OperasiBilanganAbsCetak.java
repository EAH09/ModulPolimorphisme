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
public final class OperasiBilanganAbsCetak {
    
    private void cetakSemua(OperasiBilanganAbs[] OB ,  double a, double b){
        //polimorphisme
        for (int i = 0;  i < OB.length; i++){
            OB[i].set_A(a);
            OB[i].set_B(b);
            OB[i].get_C();
            OB[i].tampil();
            
            
        }
    }
    public static void main (String [] args){
        
        System.out.println("=====Operasi Bilangan=====");
        System.out.println("");
        double a = 10.5;
        double b = 4.5;
        
        OperasiBilanganAbs Penjumlahan = new OperasiPenjumlahan();
        OperasiBilanganAbs Pengurangan = new OperasiPengurangan();
        OperasiBilanganAbs Perkalian = new OperasiPerkalian();
        OperasiBilanganAbs Pembagian = new OperasiPembagian();
        
        OperasiBilanganAbs [] OB = {Penjumlahan, Pengurangan, Perkalian,Pembagian};
        
        OperasiBilanganAbsCetak tampil = new OperasiBilanganAbsCetak();
        
        tampil.cetakSemua(OB, a, b);
       
        } 
        
        
        
        
        
    
    
}
