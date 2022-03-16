package Tugas2.Inheritance.Latihan4;

public class Hitung {

    public static void main(String[] args) {
        /* Make Object */
        BangunDatar bangundatar=new BangunDatar();

        /* Fll for class persegi */
        persegi Persegi = new persegi();
        Persegi.sisi=8;

        /* Fll for class persegi panjang */
        Persegipanjang perjang =new Persegipanjang();
        perjang.lebar=11;
        perjang.panjang=2;

        /* Call method */
        bangundatar.luas();
        bangundatar.keliling();

        Persegi.luas();
        Persegi.keliling();

        perjang.luas();
        perjang.keliling();

    }

}
