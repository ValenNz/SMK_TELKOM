package Tugas2.Polymorphysm.Latihan3;

public class Staf extends Pegawai {

    /* Deklarasi With Value */
    private static final int gajiStaf=50000;
    private static final int bonusStaf=10000;

    /* Method Override from parent class */
    @Override
    public int gaji(){
        return gajiStaf; // return value gajiStaf = 50000
    }

    /* Method Tunjangan */
    public int Bonus(){
        return bonusStaf; // return value bonus = 10000
    }
}

