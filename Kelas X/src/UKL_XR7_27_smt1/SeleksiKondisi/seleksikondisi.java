package UKL_XR7_27_smt1.SeleksiKondisi;

import java.util.Scanner;

public class seleksikondisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // DEKLARASI
        int adm = 10000;
        int total = 0;
        String [] name = {"Ali", "Budi", "Dani", "Edi", "Umar"};

        // INPUT
        System.out.println("Masukan id anda : ");
        int id = input.nextInt();
        System.out.println("Masukan Banyak Pemakaian Air dalam (m3) : ");
        int m3 = input.nextInt();

        // SELEKSI KONDISI
        if (m3 > 0 && m3  <= 10 )
            total = (m3 * 2000) + adm;
        else if (m3 > 10 && m3 <=20 )
            total = (m3 * 3000) + adm;
        else if (m3  > 20 && m3 <=30 )
            total = (m3 * 4000) + adm;
        else if (m3 > 30 )
            total = (m3 * 5000) + adm;
        else System.out.println("Terdapat kesalahan pada perhitungan !!! ");

        // pajak
        int ppn = total * 10 / 100;
        int hasil = total + ppn;

        // OUTPUT
        System.out.println("\n===== TAGIHAN AIR =====");
        System.out.println("ID            :\t" + id);
        System.out.println("Nama          :\t" + name[id-1]);
        System.out.println("Total tagihan :\t" + hasil );
    }

}
