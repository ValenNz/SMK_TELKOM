package Tugas.Modul8;

import java.util.Scanner;

public class pertemuan2 {

    public static void main(String[] args) {
        System.out.println("\n-- NO 1 --");
        String [] nama ={"sukhaku", "Matatabi", "Isobu", "Son goku", "Chomel", "Gyuki", "Kurama"};
        System.out.println(nama[2]);



        System.out.println("\n-- NO 3 --");
        String [] nama2 ={"Valen","Dito","Dea","Ridho"};
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan pilihan anda : ");
        int pilihan = input.nextInt();

        if(pilihan <=3 ) {
            System.out.println(nama2[pilihan]);
        } else {
            System.out.println("data tidak ditemukan");
        }

    }

}
