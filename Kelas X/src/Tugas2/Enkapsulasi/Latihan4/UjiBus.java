package Tugas2.Enkapsulasi.Latihan4;

class Bus{

    // Deklarasi
    private int penumpang,maxpenumpang;

    // Constructor (method yang pertama dipanggil)
    public Bus(int maxpenumpang){
        this.maxpenumpang=maxpenumpang;
        penumpang = 0;
    }

    //Method mutator
    public void pluspenumpang(int penumpang){
        int temp; // Deklarasi hasil
        temp=this.penumpang+penumpang; // operasi hasil
        // Seleksi kondisi
        if (temp>=maxpenumpang){
            System.out.println("Overload penumpang");
        }
        else {
            this.penumpang=temp;
        }

    }

    // Method untuk check password
    public void getPassword(int password){
        if (password==90){
            System.out.println("password benar");
        }
        else{
            System.out.println("pass salah");
        }
    }

    // Output hasil
    public void cetak(){
        System.out.println("Penumpang sekarang = "+penumpang);
        System.out.println("penumpang seharusnya adalah ="+maxpenumpang);
    }
}

public class UjiBus {
    public static void main(String[] args) {

        // Output
        Bus busMini=new Bus(10); // object maxPenumpang

        busMini.getPassword(40); // nilai parram password
        busMini.getPassword(90); // nilai param password

        busMini.cetak(); // ouput kosongan

        busMini.pluspenumpang(3); // nilai param penummpang + 3
        busMini.cetak();

        busMini.pluspenumpang(1); // nilai param penumpang + 1
        busMini.cetak();

        busMini.pluspenumpang(1); // nilai param penumpanh + 1
        busMini.cetak();
    }
}
