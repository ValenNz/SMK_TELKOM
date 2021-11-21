package Tugas.Modul8;

import com.sun.security.jgss.GSSUtil;

public class PakZakaria_Challange {
    public static void main(String[] args) {
        System.out.println("\n===== RATA RATA =====");
        double umur[] = {30,50,32,40,21,15};
        double jumlah = 0;


        for(int i = 1; i < umur.length; i++) {
            jumlah = jumlah + umur[i];
        }
        double ratarata = jumlah/umur.length;
        System.out.println(ratarata);


        System.out.println("\n===== UMUR TEMUDA =====");
        double umurTermuda = umur[0];
        for(int i = 1; i < umur.length; i++) {
            if(umur[i] < umurTermuda) {
                umurTermuda = umur [i];
            }
        }
        System.out.println("Umur termuda: " + umurTermuda);

        System.out.println("\n===== JUMLAH REMAJA =====");
        double jumlahRemaja = 0;
        for(int i = 1; i < umur.length; i++) {
            if (umur[i] >= 12 && umur[i] <= 17) {
                jumlahRemaja++;
            }
            }
            System.out.println("Jumlah Remaja" + jumlahRemaja);
        }



        }

