package Tugas2.ExceptionHandling.Evaluasi;

import java.util.Scanner;

public class KeywordThrows {

    /* Method Exception throws by Method (Return Value) */
    private static int ambilData(int[] array, int index) throws Exception { //kita lempar exceptionyas ke tempat yang memanggil fungsinya
        int hasil = array[index]; // mengakses index dari array
        return hasil;
    }

    /* Exception throws by Method */
    public static void main(String[] args) {
        /* Deklarasi Array */
        int[] arrayData = {0,1,2,3};

        /* Input User */
        Scanner userInput = new Scanner(System.in);
        System.out.print("data ke-:");
        int indexInput = userInput.nextInt();

        /* Deklarasi */
        int data2 = 0;

        try{                        // Mencoba Program
            data2 = ambilData(arrayData, indexInput);
        } catch (Exception e) {     // Menangkap error program
            System.err.println(e);  // err = tulijan menjadi merah | e = exception (error)
        }

        System.out.printf("data dari array ke-%d adalah %d\n\n", indexInput, data2);

    }
}