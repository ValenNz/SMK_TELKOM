package UKL_XR7_27_smt1.SoalLatihan;

import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
            int angka;
            System.out.println("Masukkan sebuah integer:");

            //Input dari user disimpan dalam variabel angka
            Scanner input = new Scanner(System.in);
            angka = input.nextInt();


            // BILANGAN GANJIL GENAP
            if ( angka % 2 == 0  )
                System.out.println(angka + " adalah bilangan genap");
            else
                System.out.println(angka + " adalah bilangan ganjil");

            // BILANGAN PRIMA
        int temp;
        boolean prima = true;

        //penggunaan for loop
        for(int pembagi = 2; pembagi <= angka / 2; pembagi++){
            temp = angka % pembagi;
            if(temp == 0){
                prima = false;
                break;
            }
        }

        if(prima && ((angka > 0)&&(angka != 1)))
            System.out.println(angka + " adalah bilangan prima");
        else
            System.out.println(angka + " bukanlah bilangan prima");

    }
    }


