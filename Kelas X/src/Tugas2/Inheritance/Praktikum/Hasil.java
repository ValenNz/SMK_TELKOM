package Tugas2.Inheritance.Praktikum;

public class Hasil {
    public static void main(String[] args) {

        /* Deklarasi */
        int a = Gaji.penghasilan(1200000);
        int b = Gaji.penghasilan(2400000);

        /* fill field */
        Data data = new Data();
        data.name = "Diah";
        data.Gender = "Perempuan";

        Gaji hasil = new Gaji();
        hasil.Nomor = 333333;

        /* Ouptput program */
        data.cetak();
        hasil.cetak();
        System.out.println("Gaji utama yang didapat   : " + a);
        System.out.println("Gaji yang didapt jika bekerja secara baik menjadi : " + b);
    }
}
