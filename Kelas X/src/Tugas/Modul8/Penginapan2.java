package Tugas.Modul8;

import java.util.Scanner;

public class Penginapan2 {

    public static void main(String[] args) {
        // PENGULANGAN SECARA TERUS MENERUS
        try{

            // DEKLARASI
            String [] cottage = {"Duku", "Jeruk","Alpukat","Jambu Air","Durian","Melon","Belimbing","Mangga","Kedondong","Barrack"};
            int total=0;

            // INPUT FROM USER
            System.out.println("\n===== WELCOME =====");
            Scanner input = new Scanner(System.in);
            System.out.print("Cottage              : ");
            String cott = input.next();
            System.out.print("Lama Menginap (hari) : ");
            int waktu = input.nextInt();
            System.out.print("Tipe Hari            : ");
            String hari = input.next();

            // OPERASI TOTAL / BIAYA
            switch(hari){
                case "Weekday":
                    if(cott.equalsIgnoreCase(cottage[0]) || cott.equalsIgnoreCase(cottage[1])){
                        total+=915000;
                    }else if(cott.equalsIgnoreCase(cottage[2]) || cott.equalsIgnoreCase(cottage[3])){
                        total+=575000;
                    }else if(cott.equalsIgnoreCase(cottage[4]) || cott.equalsIgnoreCase(cottage[5])){
                        total+=595000;
                    }else if(cott.equalsIgnoreCase(cottage[6]) || cott.equalsIgnoreCase(cottage[7]) || cott.equalsIgnoreCase(cottage[8])){
                        total+=495000;
                    }else if(cott.equalsIgnoreCase(cottage[9])){
                        total+=25000;
                    }else {
                        System.out.println ("Cottage yang anda masukan tidak terdaftar");
                    }
                    break;


                case "Weekend":
                    if(cott.equalsIgnoreCase(cottage[0]) || cott.equalsIgnoreCase(cottage[1])){
                        total+=1025000;
                    }else if(cott.equalsIgnoreCase(cottage[2]) || cott.equalsIgnoreCase(cottage[3])){
                        total+=695000;
                    }else if(cott.equalsIgnoreCase(cottage[4]) || cott.equalsIgnoreCase(cottage[5])){
                        total+=715000;
                    }else if(cott.equalsIgnoreCase(cottage[6]) || cott.equalsIgnoreCase(cottage[7]) || cott.equalsIgnoreCase(cottage[8])){
                        total+=575000;
                    }else if(cott.equalsIgnoreCase(cottage[9])){
                        total+=25000;
                    }else {
                        System.out.println ("Cottage yang anda masukan tidak terdaftar");
                    }
                    break;

                case "Holiday":
                    if(cott.equalsIgnoreCase(cottage[0]) || cott.equalsIgnoreCase(cottage[1])){
                        total+=1225000;
                    }else if(cott.equalsIgnoreCase(cottage[2]) || cott.equalsIgnoreCase(cottage[3])){
                        total+=895000;
                    }else if(cott.equalsIgnoreCase(cottage[4]) || cott.equalsIgnoreCase(cottage[5])){
                        total+=915000;
                    }else if(cott.equalsIgnoreCase(cottage[6]) || cott.equalsIgnoreCase(cottage[7]) || cott.equalsIgnoreCase(cottage[8])){
                        total+=755000;
                    }else if(cott.equalsIgnoreCase(cottage[9])){
                        total+=35000;
                    }else {
                        System.out.println ("Cottage yang anda masukan tidak terdaftar");
                    }
                    break;
                default:
                    System.out.println ("Hari yang anda masukan tidak terdaftar");
            }
            // BIAYA MENGINAP
            total*=waktu;

            // OUTPUT TOTAL TAGIHAN
            System.out.println("Total Tagihan        : " + total);

            // PENGECUALIAN ERROR
        } catch (Exception e) {
            e.printStackTrace();
    }
    }
}

