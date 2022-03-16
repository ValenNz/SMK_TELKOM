package Tugas2.PBO;

/* For input User */
import java.util.Scanner;

public class Latihan6 {
    public static void main(String[] args) {
        /* Input User */
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukan nilai WEB : ");
        int nilai = masukan.nextInt();

        /* Conditional Selection */
        if (nilai >= 90)                    // Jika yang dimasukan nilai >= 90
            System.out.println("Nilai A");  // Maka output yang keluar code ini

        else if (nilai >= 75)               // Jika yang dimasukan nilai >= 75
            System.out.println("Nilai B");  // Maka output yang keluar code ini

        else if (nilai >= 50)               // Jika yang dimasukan nilai >= 50
            System.out.println("Nilai C");  // Maka output yang keluar code ini

        else if (nilai >= 35)               // Jika yang dimasukan nilai >= 35
            System.out.println("Nilai D");  // Maka output yang keluar code ini

        else                                // Jika nilai tidak terseleksi diatas
            System.out.println("Nilai E");  // maka kode ini yang keluar

    }
}
