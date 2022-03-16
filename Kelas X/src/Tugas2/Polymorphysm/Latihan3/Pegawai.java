package Tugas2.Polymorphysm.Latihan3;

public class Pegawai {
    /* Deklarasi */
        String nama;
        int gaji;
        Pegawai(){
        }

        /* Consrtructor parent class */
        Pegawai (String nama){
            this.nama=nama;                 // var nama = param nama
            System.out.println("pegawai");
        }

        /* Method Parent class */
        public int gaji(){
            return 0; // set gaji = 0
        }
    }

