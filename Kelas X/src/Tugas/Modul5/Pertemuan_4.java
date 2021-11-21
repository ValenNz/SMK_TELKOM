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
public class Pertemuan_4 {
    
    public static void main(String[] args) {
    int a = 60;    
        int b = 13;    
        System.out.println("nilai a="+a);
        System.out.println("nilai b="+b);
        
        ++a; b++;
        System.out.println("nilai a kedua="+a);
        System.out.println("nilai b kedua="+b);
        
        int hasilA=a++;
        int hasilB=b--;
        System.out.println("nilai hasilA="+hasilA);
        System.out.println("nilai hasilB="+hasilB);
        
        hasilA= ++a;
        hasilB= --b;
        System.out.println("nilai a ketiga="+a);
        System.out.println("nilai b ketiga="+b);
        System.out.println("nilai hasilA kedua="+hasilA);
        System.out.println("nilai hasilB kedua="+hasilB);

	}
}

