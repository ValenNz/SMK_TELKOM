package UKL_XR7_27_smt1.SoalLatihan;

import java.util.Scanner;

public class listrik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int id,kwh;
        int golongan ;

        System.out.print("Masukan Id anda : ");
        id = input.nextInt();
        System.out.print("Masukan Pemakaian Listrik Kwh : ");
        kwh = input.nextInt();
        System.out.print("Masukan Golongan anda : ");
        golongan = input.nextInt();


        switch(id){
            case 1:
                System.out.println(" Nama : Galuh");
                System.out.println(" Alamat : Sawojajar");
                System.out.println(" Golonngan : " + golongan );
                break;
            case 2:
                System.out.println("Nama : Indro");
                System.out.println("Alamat : Kedungkandang");
                break;
            case 3:
                System.out.println("Nama : Jedi");
                System.out.println("Alamat : Ijen");
                break;
            case 4:
                System.out.println("Nama : Kanu");
                System.out.println("Alamat : Dinoyo");
            default:
                System.out.println("Id yang anda masukan tidak terdaftar");
        }
        int bayar = hitung(golongan,kwh);

        int total = bayar + 13000;
        if(total > 50000)
            total=50000;

        System.out.println("Total pengeluaran Anda : " + total);
    }

    public static int hitung(int golongan, int kwh ){
        int hasil = 0;

        if (golongan == 1) {
            hasil = kwh * 1000;
        }else if (golongan == 2) {
            hasil = kwh * 1300;
        }else if (golongan == 3){
            hasil = kwh * 1500;
        }else {
            System.out.println("golongan yang anda masukan tidak terdaftar");
        }
        return hasil;

    }
}
