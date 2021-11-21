package UKL_XR7_27_smt1.Array;

public class array2 {
    public static void main(String[] args) {
        // DEKLARASI
        int a[][] = {{6},{1},{4}}; // array 1 (3x1)
        int b[][] = {{1,2,1,3}}; // array 2 (1x4)
        int h[][] = {{0,0,0,0},{0,0,0,0},{0,0,0,0}}; // hasil array ( diambil dari baris dan kolom paling sedikit) = 2x2

        System.out.println("Hasil AxB");

        //proses perhitungan
        for (int i = 0; i < 3; i++) {  // sebagai pemanggilan baris matrix a
            for (int j = 0; j < 4; j++) { // sebagai pemanggilan kolom matrib b
                for (int k = 0; k < 1; k++) { // untuk pemanggilan kolom matrix a dan baris matrix b)
                    h[i][j] = h[i][j] + a[i][k] * b[k][j]; // operasi penjumlahan dan perkalian matrix
                }
            }
        }
        //menampilkan hasil
        for (int i = 0; i < 3; i++) { // untuk membuat baris
            for (int j = 0; j < 4; j++) { // untuk membuat kolom
                System.out.print(h[i][j] + "\t"); // untuk mengoutput hasil (
            }
            System.out.println(); // untuk mengenter jika kolom terpenuhi
        }
    }
}
