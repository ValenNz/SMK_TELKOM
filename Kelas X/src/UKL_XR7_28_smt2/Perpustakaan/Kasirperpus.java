package UKL_XR7_28_smt2.Perpustakaan;

import java.util.Scanner;

public class Kasirperpus {
    public static void main(String[] args) {

        /* Deklarasi looping */
        boolean progres = true;

        /* Process Looping */
        while(progres) {
            Scanner input = new Scanner(System.in);
            ChildMassage pesan = new ChildMassage();
            pesan.pesan();
            int operator = input.nextInt();

            try {
                /* Make Object*/
                Buku book = new Buku();
                Petugas officer = new Petugas();
                Peminjaman loan = new Peminjaman();
                Siswa student = new Siswa();
                Laporan report = new Laporan();

                /* Conditional Meminjam Buku */
                if (operator == 1) {
                    report.report(book);
                    loan.transactionProccess(student, loan, book);
                    report.report(officer);

                    /* Conditional Mengembalikan Buku*/
                } else if (operator == 2) {
                    report.report(book);
                    loan.returnBook(student, loan, book);
                    report.report(officer);

                    /* Conditional Exit */
                } else if (operator == 3){
                    progres = false;

                    /* Conditional else */
                } else if ( operator > 3){
                    System.out.println("Maaf kami belum tersedia");
                }

            } catch (Exception e) { // nangkap error
                System.err.println("Terdpat Exception!!\n Info : " + e.getMessage());
            }
        }
    }
}
