package Tugas2.Inheritance.Praktikum;

/**
 * use overriding
 */
public class Data {
    /* Deklarasi */
    String name;
    String Gender;
    int Nomor;

    /* Method hasil */
   void cetak(){
        System.out.println("Berikut identitas pegawai ");
        System.out.println("Nama                      : " + this.name);
        System.out.println("Jenis Kelamin             : " + this.Gender);
    }

}
