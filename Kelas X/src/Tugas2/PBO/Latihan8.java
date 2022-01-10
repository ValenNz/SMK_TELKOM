package Tugas2.PBO;

import java.util.Scanner;

public class Latihan8 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukan nilai TPA : ");
        int TPA = masukan.nextInt();
        System.out.print("Masukan nilai Bahasa Inggris :");
        int BahasaInggris = masukan.nextInt();
        if ((TPA > 85) && (BahasaInggris > 80))
            System.out.println("Siswa dapat Beasiswa");
        else
            System.out.println("Siswa tidak dapat Beasiswa");
    }
}
