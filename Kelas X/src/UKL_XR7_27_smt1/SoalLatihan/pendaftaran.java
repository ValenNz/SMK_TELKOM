package UKL_XR7_27_smt1.SoalLatihan;

import java.util.Scanner;

public class pendaftaran {
    public static void main(String[] args) {
        try {
            // DEKLARASI
            char gP;

            // INPUT
            Scanner input = new Scanner(System.in);
            System.out.println("Masukkan Jalur Pendaftaran : ");
            String jP = input.nextLine();
            System.out.println("Masukkan Pendapatan Orang tua anda : ");
            int pO = input.nextInt();
            System.out.println("Berapa Bulan SPP yang akan dibayar?");
            int bulanSPP = input.nextInt();


            if (pO < 2000000) gP = 'A';
            else if (pO >= 2000000) gP = 'B';
            else if (pO > 10000000) gP = 'C';
            else throw new Exception("TERDAPAT KESALAHAN PADA INPUT PENDAPATAN!");

            if (jP.equalsIgnoreCase("SBMPTN")){
                switch (gP) {
                    case 'A' -> System.out.println("Biaya : " + (5000000 + (500000 * bulanSPP)));
                    case 'B' -> System.out.println("Biaya : " + (15000000 + (1000000 * bulanSPP)));
                    case 'C' -> System.out.println("Biaya : " + (30000000 + (2000000 * bulanSPP)));
                    default -> throw new Exception("TERDAPAT KESALAHAN PADA PERHITUNGAN DSP SPP!");
                }
            } else if (jP.equalsIgnoreCase("SNMPTN")) {
                switch (gP) {
                    case 'A' -> System.out.println("Biaya : " + (7000000 + (500000 * bulanSPP)));
                    case 'B' -> System.out.println("Biaya : " + (15000000 + (1000000 * bulanSPP)));
                    case 'C' -> System.out.println("Biaya : " + (35000000 + (2000000 * bulanSPP)));
                    default -> throw new Exception("TERDAPAT KESALAHAN PADA PERHITUNGAN DSP SPP!");
                }
            } else if (jP.equalsIgnoreCase("MANDIRI")) {
                switch (gP) {
                    case 'A' -> System.out.println("Biaya : " + (10000000 + (1000000 * bulanSPP)));
                    case 'B' -> System.out.println("Biaya : " + (25000000 + (2000000 * bulanSPP)));
                    case 'C' -> System.out.println("Biaya : " + (50000000 + (3000000 * bulanSPP)));
                    default -> throw new Exception("TERDAPAT KESALAHAN PADA PERHITUNGAN DSP SPP!");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }

