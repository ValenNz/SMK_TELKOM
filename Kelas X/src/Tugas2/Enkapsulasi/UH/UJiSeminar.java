package Tugas2.Enkapsulasi.UH;


class Seminar{

    // Deklarasi
    private int Audience, maxAudience, audienceBaru;
    private double tinggibadanAudience;



    // Constructor (Method yang pertama dipangggil)
    public Seminar(int maxAudience){
        this.maxAudience = maxAudience;
        Audience = 0;
        audienceBaru = 1;
    }

    // Method Mutator agar penumpang bertambah
    public void addAudience(int Audience){
        // deklarasi
        int temp;
        // operasi penjumlahan
        temp = this.Audience+Audience;
        // Seleksi kondisi
        if(temp >= maxAudience){
            System.out.println("Audience melebihi kuota");
        }else{
            this.Audience=temp;
            audienceBaru++; // audienceBaru akan menambah
        }
    }

    // method tinggi siswa
    public void getAudience(int audience){
        this.tinggibadanAudience = audience;
        if( tinggibadanAudience >= 170 ){
            System.out.println("Tinggi audience 170 cm " );
        }else{
            System.out.println("Tinggi audience dibawah 170 cm " );
        }
    }

//     method rata rata
    public int getAverage(){
        return this.Audience/this.audienceBaru;
    }

    // method hasil
    public void cetak(){
        System.out.println("\nAudience Sekarang                  = " + Audience);
        System.out.println("Maksimum audience yang seharusnya adalah = " + maxAudience);
        System.out.println("Rata rata audience yang hadir pada acara    = " + getAverage());
    }


}
public class UJiSeminar {
    public static void main(String[] args) {
        // Membuat object maxPenumpang
        Seminar people = new Seminar(5);

        // Nilai param tinggi
        people.getAudience(170);
        people.getAudience(160);

        people.cetak();

        people.addAudience(1); //tambah 1 penumpang
        people.cetak();

        people.addAudience(2); //tambah 2 penumpang
        people.cetak();

        people.addAudience(3); //tambah 3 penumpang
        people.cetak();
    }

    }