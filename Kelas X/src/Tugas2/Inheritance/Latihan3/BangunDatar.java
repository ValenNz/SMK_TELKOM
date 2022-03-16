package Tugas2.Inheritance.Latihan3;

public class BangunDatar {
    /* Deklarasi */
    double luas;

    /* method Luas */
    void luas(double panjang , double lebar){
        luas = panjang*lebar;
        System.out.println("luas pertama = "+luas);
    }

    void luas(int panjang, int lebar, int a){
        luas= panjang * lebar*a;
        System.out.println("luas kedua = "+luas);
    }

}
