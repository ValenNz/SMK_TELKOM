package Tugas2.Inheritance.Latihan4;

public class persegi extends BangunDatar {
    /* Deklarasi */
    float sisi;

    /* Method rumus luas */
    public void luas(){
        float luas=sisi*sisi;
        System.out.println("Luas Persegi = " + luas);
    }

    /* Method rumus keliling */
    public void keliling(){
        float keliling=4*sisi;
        System.out.println("keliling Persegi = " + keliling);
    }


}

