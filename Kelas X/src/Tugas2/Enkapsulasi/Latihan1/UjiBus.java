package Tugas2.Enkapsulasi.Latihan1;

class Bus{
    /* Deklarasi  varibael */
    public int penumpang,maxpenumpang;

    /* Method untuk mencetak hasil */
    public void cetak(){
        System.out.println("Penumpang sekarang = " + penumpang);
        System.out.println("Penumpang seharusnya adalah  = " + maxpenumpang);
    }
}

public class UjiBus {
    public static void main(String[] args) {

        /* membuat object bus mini */
        Bus busMini = new Bus();
        busMini.penumpang = 5; // jumlah awal penumpang
        busMini.maxpenumpang = 5; // jumlah awal maxPenumpang


        // Operasi penambahan penumpang
        busMini.cetak(); // output

        busMini.penumpang = busMini.penumpang + 5; // 1. penumpang ditambah 5
        busMini.cetak(); // output

        busMini.penumpang = busMini.penumpang - 2; // 2. penumpang dikurang 2
        busMini.cetak(); // output

        busMini.penumpang = busMini.penumpang + 8; // 3. penumang ditambah 8
        busMini.cetak(); // output

    }
}
