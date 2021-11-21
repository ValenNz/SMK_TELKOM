package UKL_XR7_27_smt1.Looping;

public class looping2 {
    // matrix 4 x 4 ( 3 baris 4 kolom)
    public static void main(String[] args) {
        // deklarasi suku pertama dan beda
        int a = 4, b = 9, total = 0;

        for (int i = 1; i <= 3; i++){ // untuk membuat baris
            for (int j = 1; j <= 4; j++){ // untuk membuat kolom
                total += a; // operasoi total
                System.out.print(a +"\t"); // untuk outout hasil aritmatika
                a = a + b; // untuk menghitung aritmatika
            }
            System.out.println(" "); // untuk mengenter kebawah jika baris yang diinginkan terpenuhi
        }
        System.out.println("\n" + total);
    }
}
