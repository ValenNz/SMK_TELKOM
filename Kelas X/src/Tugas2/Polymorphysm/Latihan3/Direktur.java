package Tugas2.Polymorphysm.Latihan3;

public class Direktur extends Pegawai {

    /* Deklarasi With Value */
    private static final int gajiDir=100000;
    private static final int tunjangan=50000;

    /* Method Override from parent class */
    @Override
    public int gaji(){
        return gajiDir; // return value gajiDir = 100.000
    }

    /* Method Tunjangan */
    public int tunjangan(){
        return tunjangan; // return value tunjangan = 50000
    }

}
