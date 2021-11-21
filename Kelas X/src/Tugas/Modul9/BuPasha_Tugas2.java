package Tugas.Modul9;

import java.util.Arrays;

public class BuPasha_Tugas2 {
        public static void main(String[] args) {
            int[] angka = {10,20,4,5,8};

            printArray(angka, "array ");
            reverse(angka);
            printArray(angka, "reverse ");
        }
    private static void reverse(int[] data){
        Arrays.sort(data); // untuk mengurutkan array
        int[] arrayBuffer = Arrays.copyOf(data, data.length);

        for (int i = 0; i < data.length; i++){
            data[i] = arrayBuffer[(arrayBuffer.length - 1) - i];
        }
    }
    private static void printArray(int[] data, String message){
        System.out.println(message + " = " + Arrays.toString(data));
    }
}
