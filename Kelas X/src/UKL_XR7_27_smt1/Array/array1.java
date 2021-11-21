package UKL_XR7_27_smt1.Array;

public class array1 {
    public static void main(String[] args) {
        // DEKLARASI ARRAY
        int a[][]={{-7,5},{4,8}}; // array 1
        int b[][]={{1,1},{-4,9}}; // array 2

        System.out.println("Hasil A-B");

        for(int i=0;i<2;i++){ // untuk membuat baris
            for(int j=0;j<2;j++){ // untuk membuat kolom
                System.out.print(a[i][j]-b[i][j]+"\t"); // operasi perngurangan matrix
            }
            System.out.println(); // untuk mengenter kebawah jika kolom terpenuhi
        }
    }

}
