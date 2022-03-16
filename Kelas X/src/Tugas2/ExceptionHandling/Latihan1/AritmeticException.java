package Tugas2.ExceptionHandling.Latihan1;

import java.util.Scanner;

public class AritmeticException {
    public static void main(String args[])
    {
        /* Input User */
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the value for c");

        /* Try Catch */
        try{                                            // Mencoba program
            int c = console.nextInt();
            int res=c/0;
            System.out.println(" The result is "+res);
        }catch (Exception e){                           // Menangkap error
            System.out.println("Terjadi Exception! ");
            System.out.println("Detail : " + e);
            System.out.println("Program Selesai");
        }
    }
}
