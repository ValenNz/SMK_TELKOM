package Tugas2.PBO.Praktikum;

import java.util.Scanner;

public class LuasPermukanBola {
    public static void main(String[] args) {

        // input jari jari
    Scanner input = new Scanner(System.in);
    System.out.println("*** Operasi perhitungan Luas permukaan Bola *** ");
    System.out.print("Masukan Jari Jarinya : ");
    int r = input.nextInt();

    // operasi luas permukaan bola
    float hasil = (4 * 3.14f * (r * r));

    // output dari hasil operasi
    System.out.println("Luas Permukaan Bola : " + hasil);



    }
}









