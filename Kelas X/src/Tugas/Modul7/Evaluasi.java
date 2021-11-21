package Tugas.Modul7;

public class Evaluasi {
    public static void main(String[]args){

        int a = 0;
        boolean kondisi = true;


        do {
            a+=3;
            System.out.println(a);

            if (a == 15) { // untuk cek kondisi
                kondisi = false;
            }

        }while(kondisi);
    }
}
