package Tugas.Modul6;

import java.util.Scanner;

public class Evalusai_cara1 {
    public static void main(String[] args) {

        int nilai;
        String predikat = "";

        Scanner inputUser = new Scanner(System.in);

        System.out.print("nilai = ");
        nilai = inputUser.nextInt();

        if (nilai > 95 && nilai <=100){
            predikat = "A";
            System.out.println("Predikat =" + predikat);
        } else if (nilai > 90 && nilai <=  95) {
            predikat = "A";
            System.out.println("Predikat =" + predikat + "-");

        } else if (nilai > 85 && nilai <=  90) {
            predikat = "B";
            System.out.println("Predikat =" + predikat + "+");
        } else if (nilai > 80 && nilai <=  85) {
            predikat = "B";
            System.out.println("Predikat =" + predikat);
        } else if (nilai > 74 && nilai <=  80) {
            predikat = "B";
            System.out.println("Predikat =" + predikat + "-");

        } else if (nilai > 69 && nilai <=  74) {
            predikat = "C";
            System.out.println("Predikat =" + predikat + "+");
        } else if (nilai > 64 && nilai <=  69) {
            predikat = "C";
            System.out.println("Predikat =" + predikat);
        } else if (nilai > 59 && nilai <=  64) {
            predikat = "C";
            System.out.println("Predikat =" + predikat + "-");

        } else if (nilai > 54 && nilai <=  59) {
            predikat = "D";
            System.out.println("Predikat =" + predikat + "+");
        } else if (nilai >= 0 && nilai <=  54) {
            predikat = "D";
            System.out.println("Predikat =" + predikat + "+");

        } else {
            System.out.println("Nilai yang anda masukan tidak terdafar pada List");
        }


        {


            switch (predikat) {
                case "A":
                    System.out.println("Kriteria Sangat baik");
                    break;
                case "B":
                    System.out.println("Kriteria Baik");
                    break;
                case "C":
                    System.out.println("Kriteria Cukup");
                    break;
                case "D":
                    System.out.println("Kriteria Kurang");
                    break;
            }

        }

    }
}
