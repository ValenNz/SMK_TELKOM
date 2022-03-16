package Tugas2.PBO;

/* For input User */
import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        /* Input User */
        Scanner masukan = new Scanner (System.in);

        /* Deklarasi */
        int a,b;

        /* Process Inout User */
        System.out.print("Masukan nilai a : ");
        a = masukan.nextInt();
        System.out.print("Masukan nilai b : ");
        b = masukan.nextInt();

        /* Output */
        System.out.println();
        System.out.println("Nilai Variabel yang ada pada program :");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
