package Tugas.Modul6;

import java.util.*;

public class Resep_makanan {
    public static void main(String[] args) {
        Scanner inputUser;
        int Resep;

        System.out.println("\n-----> WELCOME <-----");
        inputUser = new Scanner(System.in);

        System.out.print("Masukan nama anda = ");
        String userName = inputUser.nextLine();
        System.out.println("Nama anda adalah: " + userName);

        System.out.println(" \nDaftar Resep = ");
        System.out.println("1. Pisang Rebus");
        System.out.println("2. Milk Shake Banana");
        System.out.println("3. Pisang Goreng");
        System.out.println("4. Pisang Rebus");
        System.out.println("5. Telur Mata Sapi");
        System.out.println("6. Sandwich Telur");
        System.out.print("Pilih Resep : ");
        Resep = inputUser.nextInt();

        if (Resep == 1) {
            System.out.println("\nResep " + Resep + " = Pisang Rebus ");
        } else if (Resep == 2) {
            System.out.println("\nResep " + Resep + " = Milk Shake Banana ");
        } else if (Resep == 3) {
            System.out.println("\nResep " + Resep + " = Pisang Goreng ");
        } else if (Resep == 4) {
            System.out.println("\nResep " + Resep + " = Telur Rebus ");
        } else if (Resep == 5) {
            System.out.println("\nResep " + Resep + " = Telur Mata Sapi ");
        } else if (Resep == 6) {
            System.out.println("\nResep " + Resep + " = Sandwich Telur ");
        } else {
            System.out.println("\nResep yang anda masukan tidak terdaftar");

    }
            {


                switch (Resep) {
                    case 1:
                        System.out.println("Bahan Pembuatan = Pisang");
                        break;
                    case 2:
                        System.out.println("Bahan Pembuatan = Pisang dan Susu");
                        break;
                    case 3:
                        System.out.println("Bahan Pembuatan = Pisang dan Minyak Goreng");
                        break;
                    case 4:
                        System.out.println("Bahan Pembuatan = Telur");
                        break;
                    case 5:
                        System.out.println("Bahan Pembuatan = Telur dan Minyak Goreng");
                        break;
                    case 6:
                        System.out.println("Bahan Pembuatan = Telur dan Roti");
                        break;
                }
            }
        }

    }

