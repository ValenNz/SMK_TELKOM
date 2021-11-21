package Tugas.Modul7;

public class BuPasha_Materi {
    // For (inisialisasi;kondisi;increment/dicrement)
    // for (besar;kecil; intcrement)
    // for (kecil; besar; dicrement)
    public static void main(String[] args) {

        // menampilkan tulisan smk telkom malang 10 X
        System.out.println("===== INCREMENT =====");
        for (int a = 0; a < 10; a++)
            System.out.println(a);


        // menampilkan tulisan smk telkom malang 10 X
        System.out.println("\n===== DIKREMENT =====");
        for (int j = 10; j > 0; j--)
            System.out.println(j);

        System.out.println("\n");
        for (int a = 10; a < 60; a += 10)
            System.out.println(a);

        System.out.println("\n");
        for (int a = 10; a <= 50; a += 10)
            System.out.println(a);

        // FOR EACH
        System.out.println("\n");
        // cara 1
        int[] nilai = {1, 2, 3, 4, 5};

        for (int x = 0; x < 5; x++) {
            System.out.println(nilai[x]);

            System.out.println("\n");
            //cara 2
            int[] angka = {1,2,3,4,5};
            for (int i :angka)
                System.out.println(i);
        }

    }
}
