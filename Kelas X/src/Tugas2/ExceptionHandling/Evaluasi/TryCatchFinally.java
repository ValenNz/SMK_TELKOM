package Tugas2.ExceptionHandling.Evaluasi;

import java.io.FileInputStream;
import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String[] args) {
        // DEKLARASI
        int[] array = {0,1,2,3};

        /* Input User */
        Scanner userInput = new Scanner(System.in);
        System.out.print("nilai array ke: ");
        int index = userInput.nextInt();

        try {
            System.out.printf("index ke-%d, adalah %d\n", index, array[index]);             // %d (angka/desimal)
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Index yang anda masukan tidak sesuai dengan jumlah array");
        } finally {
            System.out.println("finally"); // akan dijalankan ketika 2 exception dijalankan (mengeclose file yang telah dibuka)
        }
    }

}
