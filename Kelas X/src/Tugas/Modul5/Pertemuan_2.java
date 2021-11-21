/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL_5;

/**
 *
 * @author ROG
 */
public class Pertemuan_2 {
    public static void main(String[] args) {
        int mawar = 21, melati = 2, matahari = 5;
        double harga;
        harga = 4500.5;
        double total, bayar;
        
        /*operator penugasan*/
        melati+=2;
        
        /* Operator Aritmatika */
        total = mawar + melati + matahari;
        bayar=total*harga;
        
        
        System.out.println("jumlah barang yang dibeli = "+mawar+"+"+melati+"+"+matahari+"="+total);
        System.out.println("total yang dibayar  = Rp"+bayar);
        System.out.println("Bunga Mawar > bunga melati true");
        System.out.println("pembelian bunga mawar lebih banyak dari matahari dan melati true");
    }
    
}
