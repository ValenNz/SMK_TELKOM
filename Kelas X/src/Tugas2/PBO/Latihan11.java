package Tugas2.PBO;

import java.util.Scanner;

public class Latihan11 {
    public static void main(String[] args) {
        /* Input User */
        Scanner masukan = new Scanner(System.in);

        /* Deklarasi */
        int a = 0,  total = 0, bil = 7;

        /* While loop */
        while (bil != 0 ){              // bil tidak sama dengan 0
            a++;                        // value a akan menambah
            System.out.print("Masukan bilangan ke- " + a + " : ");
            bil = masukan.nextInt();
            total += bil;               // value total akan menambaj sesuai bilangan
        }
        System.out.println("Total jumlah " +(a-1)+ "bilangan : ");
        System.out.println(total);

    }
}
