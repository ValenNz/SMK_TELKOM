package Tugas2.PBO.OOP1;


import java.util.Scanner;

class siswa {

    Scanner input = new Scanner(System.in);
    siswa(){
        System.out.println("Masukan nama murid : ");
        String nama =  input.nextLine();
        System.out.println("Masukan nilai murid : ");
        int nilai = input.nextInt();

        System.out.println("NIlai Produktif RPL 5 " + nama + " adalah = " + nilai + "\n" + ((nilai<80) ? "Anda harus belajar lebih giat lagi " : "Selamat anda lulus"));

     }



}
