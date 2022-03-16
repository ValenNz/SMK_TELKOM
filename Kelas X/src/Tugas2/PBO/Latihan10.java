package Tugas2.PBO;

import java.util.Scanner;

public class Latihan10 {
    public static void main(String[] args) {
        /* Input User */
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukan batas bilangan : ");
        int batas = masukan.nextInt();

        /* Dekklarasi hasil */
        int hasil = 0;

        /* Looping */
        for(int i = 1; i <= batas; i++)                          // akan looping sesuai user memasukan angka berapa
            hasil += i;                                          // akan menghitung 0 + 1 + 2 + hingga batas dimasukan user
        System.out.println("Total jumlahnya adalah : " + hasil); // output

    }
}
