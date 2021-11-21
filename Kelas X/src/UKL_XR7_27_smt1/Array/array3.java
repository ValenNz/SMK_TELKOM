package UKL_XR7_27_smt1.Array;

public class array3 {
    public static void main(String[] args) {
        int a[][]={{6,3,2},{4,2,3}};
        int b[][]={{1,2},{2,3},{3,1}};
        int h[][]={{0,0},{0,0}}; // hasil array ( diambil dari baris dan kolom paling sedikit) = 2x2
        System.out.println("Hasil AxB");
        //proses perhitungan
        for(int i=0;i<2;i++){ // sebagai pemanggilan baris matrix a
            for(int j=0;j<2;j++){ // sebagai pemanggilan kolom matrib b
                for(int k=0;k<3;k++){ // untuk pemanggilan kolom matrix a dan baris matrix b)
                    h[i][j]=h[i][j]+a[i][k]*b[k][j]; // operasi penjumlahan dan perkalian matrix
                }
            }
        }
        //menampilkan hasil
        for(int i=0;i<2;i++){ // untuk membuat baris
            for(int j=0;j<2;j++){ // untuk memmbuat kolom
                System.out.print(h[i][j]+"\t"); // untuk output hasil
            }
            System.out.println(); // untuk enter jika kolom terpenuhi
        }
    }
}
