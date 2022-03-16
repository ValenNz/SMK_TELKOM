package Tugas2.PBO;

public class Latihan3 {
    public static void main(String[] args) {
        /* Deklarasi */
        int bil_a, bil_b, hasil;

        /* Add value variabel */
        bil_a = 454;
        bil_b = 546;

        /* Operasi */
        hasil = bil_a + bil_b;
        System.out.println("Hasil penjumlahann kedua bilangan :");
        System.out.println(hasil);

        /* Deklarasi with value */
        int p = 5;
        int l = 10;
        int t = 5;

        /* Output */
        System.out.println("Nilai panjang balok :" + p );
        System.out.println("Nilai lebar balok :" + l );
        System.out.println("Nilai tinggi balok :" + t );
        System.out.println("==============================");
        System.out.println("Menghitung Luas Permukan Balok");
        System.out.println("==============================");
        System.out.println("Luas Permukaan Balok =" +((2*p*l)+(2*p*t)+(2*l*t)));
    }
}
