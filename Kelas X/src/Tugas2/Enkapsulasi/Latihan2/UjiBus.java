package Tugas2.Enkapsulasi.Latihan2;

class Bus{

    // Deklarasi var
    private int penumpang,maxpenumpang;

    // Constructor (method ysang pertama dipanggil)
    public Bus(int maxpenumpang){
        this.maxpenumpang=maxpenumpang; // menghubungkan max penumpang deklarasi dengan max penumpang parameter
        penumpang = 0; // set max penumpang dari 0
    }

    //method mutator
    public void pluspenumpang(int penumpang){
        int temp; // deklarasi hasil
        temp=this.penumpang+penumpang; // operasi penjumlahan hasil

        // seleksi kondisi
        if (temp>=maxpenumpang){
            System.out.println("Overload penumpang");
        }
        else {
            this.penumpang=temp;
        }
    }

    // Method output program
    public void cetak(){
        System.out.println("Penumpang sekarang = "+penumpang);
        System.out.println("penumpang seharusnya adalah ="+maxpenumpang);
    }


}
public class UjiBus {
    public static void main(String[] args) {

            Bus busMini=new Bus(10); // set awal maxpenumpang

        // output hasil menggunakan nameclass.method cetak()
            busMini.cetak();

            busMini.pluspenumpang(3); // param penumpang
            busMini.cetak();

            busMini.pluspenumpang(1); // param penumpang
            busMini.cetak();

            busMini.pluspenumpang(1); // param penumpang
            busMini.cetak();


        }
}
