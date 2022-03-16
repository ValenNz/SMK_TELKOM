package Tugas2.PBO;

/* For input User */
import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {
        /* Input User */
        Scanner masukan = new Scanner(System.in);

        /* Deklarasi */
        int nilai;

        /* Process Inout User */
        System.out.print("Masukan nilai akhir PBO : ");
        nilai = masukan.nextInt();

        /* condition selection */
        if (nilai < 70)                              // jika nilai yag dimasukan < 70
            System.out.println("Siswa tidak lulus"); // maka output yang keluar code ini

        if (nilai > 70)                              // Jika nila yang dimasukan > 70
            System.out.println("Siswa lulus");       // Maka output yang keluar code ini


    }
}
