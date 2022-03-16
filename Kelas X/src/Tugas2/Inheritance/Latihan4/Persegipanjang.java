package Tugas2.Inheritance.Latihan4;

public class Persegipanjang extends BangunDatar {
    /* Deklarasi */
    float panjang,lebar;

    /* Method rumus luas*/
    public void luas(){
        float luas=panjang*lebar;
        System.out.println("Luas Persegi panjang = " + luas);
    }

    /* Method rumus keliling*/
    public void keliling(){
        float keliling=2*(panjang+lebar);
        System.out.println("Keliling Persegi panjang = " + keliling);
    }

}

