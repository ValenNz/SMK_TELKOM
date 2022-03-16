package Tugas2.Inheritance.Praktikum;

/**
 * use overloading show gaji
 */

public class Gaji extends Data{

    /* Overloading method reurn value */
    public static int penghasilan(int uang){
        return uang;
    }

    public static double penghasilan(double uang){
        return(int)uang;
    }

    /* Method output */
   void cetak(){
       System.out.println("Nomor pegawai             : " + super.Nomor);
        System.out.println("Bekerja di bagian admin");
    }
    }

