package Tugas.Modul9;

public class BuPasha_Materi {

    public static void cetak() {
        System.out.println("Kelas XR7");
    }

    // METHOD MENGEMBALIKAN NILAI
    public static int nilai() {
        int hasil = 100;
        return hasil; // untuk mencetak hasil
    }

    public static int hitung (int a, int b) {
        int jumlah = a+b;
        return jumlah;

    }

    public static void main(String[] args) {

        // cara mencetak tanpa return (mengembalikan nilai)
        cetak();
        nilai();
        int a = 10;
        int b = 20;
        hitung(a,b);
//        System.out.println(("Nilai Anda : " + nilai()));
//        System.out.println("Jumlah : " +hitung(10,20));
    }

}
