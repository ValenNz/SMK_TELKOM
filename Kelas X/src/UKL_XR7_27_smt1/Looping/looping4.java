package UKL_XR7_27_smt1.Looping;

public class looping4 {
    public static void main(String[] args) {

        System.out.println("===== SEGITIGA KEKANAN =====");
        // deklarasi suku pertama dan beda
        int a = 4, b = 9;

        for (int i = 1; i <= 5; i++) { // untuk membuat baris
            for (int j = 1; j < i; j++) { // untuk membuat kolom
                System.out.print(a + "\t"); // untuk outout hasil aritmatika
                a = a + b; // untuk menghitung aritmatika
            }
            System.out.println(" "); // untuk mengenter kebawah jika baris yang diinginkan terpenuhi
        }

        for (int i = 5; i >= 1; i--) { // untuk membuat baris
            for (int j = 1; j <= i; j++) { // untuk membuat kolom
                System.out.print(a + "\t"); // untuk outout hasil aritmatika
                a = a + b; // untuk menghitung aritmatika
            }
            System.out.println(" "); // untuk mengenter kebawah jika baris yang diinginkan terpenuhi
        }


        System.out.println("\n SEGITIGA BAWAH ATAS");
        // deklarasi suku pertama dan beda
        int c = 4, d = 9;

        for (int i = 5; i >= 2; i--) { // untuk membuat baris
            for (int j = 1; j <= i; j++) { // untuk membuat kolom
                System.out.print(c + "\t"); // untuk outout hasil aritmatika
                c = c + d; // untuk menghitung aritmatika
            }
            System.out.println(" "); // untuk mengenter kebawah jika baris yang diinginkan terpenuhi
        }

        for (int i = 2; i <= 6; i++) { // untuk membuat baris
            for (int j = 1; j < i; j++) { // untuk membuat kolom
                System.out.print(c + "\t"); // untuk outout hasil aritmatika
                c = c + d; // untuk menghitung aritmatika
            }
            System.out.println(" "); // untuk mengenter kebawah jika baris yang diinginkan terpenuhi
        }
    }
}
