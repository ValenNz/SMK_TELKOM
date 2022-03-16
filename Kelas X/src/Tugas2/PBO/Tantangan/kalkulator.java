package Tugas2.PBO.Tantangan;

/* Import Scanner*/
import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {

        /* Deklarasi Variebale */
        double a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai a : ");
        a = input.nextDouble();
        System.out.print("Masukkan Operasi : ");
        var operasi = input.next();
        System.out.print("Masukkan nilai b : ");
        b = input.nextDouble();

        System.out.println("Hasilnya adalah : " + hitung(a, operasi , b));

    }

    /* Method Return Value */
    public static double hitung (double a,String operasi, double b){
        switch(operasi){
            case "+":
                return a + b;

            case "-":
                return a - b;

            case "*":
                return a * b;

            case "/":
                return a / b;

            case "%":
                return a % b;

            default:
                return 0;

        }

    }

}
