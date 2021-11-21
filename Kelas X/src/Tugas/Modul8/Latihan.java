package Tugas.Modul8;

import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
//        String nama[]=new String[3];
//        nama[0] = "Bidi";
//        nama[1] = "Sugeng";
//        nama[2] = "Lasmini";
//
//        System.out.println("nama : " + nama[1]);

        String [] nama ={"Raihan","Nuevalen","Shevia","Zhidan","Oryza"};
        int [] nilai ={90,95,85,75,80};
        String [] keterangan = {"Sangat baik", "Sangat Baik", "Baik", "Cukup", "Baik"};
        Scanner input = new Scanner(System.in);

        System.out.print("No : ");
        int pilihan = input.nextInt();

        if(pilihan <=4 ) {
            System.out.println("Nama : " + nama[pilihan]);
            System.out.println("Nilai : " + nilai[pilihan]);
            System.out.println("Keterangan  : " + keterangan[pilihan]);
        } else {
            System.out.println("data tidak ditemukan");
        }

    }
}
