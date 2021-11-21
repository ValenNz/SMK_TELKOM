package UKL_XR7_27_smt1.Looping;

public class looping3 {
    public static void main(String[] args) {

        System.out.println("===== Besar Ke kecil =====");
        // deklarasi suku pertama dan beda
        int a = 4, b = 9;

        for (int i = 1; i <= 6; i++) { // untuk membuat baris
            for (int j = 1; j < i; j++) { // untuk membuat kolom
                System.out.print(a + "\t"); // untuk outout hasil aritmatika
                a = a + b; // untuk menghitung aritmatika
            }
            System.out.println(" "); // untuk mengenter kebawah jika baris yang diinginkan terpenuhi
        }

        System.out.println("\n===== Besar Ke kecil =====");
        // deklarasi suku pertama dan beda
        int c = 4, d = 9;

        for (int i = 1; i <= 6; i++) { // untuk membuat baris
            for (int j = 6; j > i; j--) { // untuk membuat kolom
                System.out.print(c + "\t"); // untuk outout hasil aritmatika
                c = c + d; // untuk menghitung aritmatika
            }
            System.out.println(" "); // untuk mengenter kebawah jika baris yang diinginkan terpenuhi
        }

        System.out.println("\n===== SEGITIGA =====");
        for (int i = 0; i < 5; i++) { // untuk membuat baris

            for (int j = 1; j < 5-i; j++) {  // untuk membuat spasi kanan kiri
                System.out.print(" ");
            }
            for (int k = 0; k < i+1; k++) { // untuk print *
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
