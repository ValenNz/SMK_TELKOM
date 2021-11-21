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
public class Evaluasi {
    public static void main(String[] args) {
        // inisialisasi sebagai stok
        int Laptop = 7, Hardisk = 11, Mouse = 21;
        int harga_Laptop, harga_Hardisk, harga_Mouse;
        harga_Laptop = 10000000;
        harga_Hardisk = 1500000;
        harga_Mouse = 150000;
        long total,  bayar;
        

        /*operator penugasan (pembelian yang mengurangi stok)*/ 
//        jambu-=2; 
//        semangka-=3;
        /* Operator Aritmatika (total barang tersedia)*/
        total=Laptop+Hardisk+Mouse;
        
    System.out.println("jumlah barang yang tersedia =" +Laptop+ "+" +Hardisk+ "+" +Mouse+ "=" +total);
        
        bayar = (total*harga_Laptop)+(total*harga_Hardisk)+(total*harga_Mouse);
        //total aset yang dimiliki
        System.out.println("total aset yang dimiliki  = Rp"+bayar);    
    		}
}