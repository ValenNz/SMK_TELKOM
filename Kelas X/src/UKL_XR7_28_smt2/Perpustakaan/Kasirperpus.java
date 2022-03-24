package UKL_XR7_28_smt2.Perpustakaan;

public class Kasirperpus {
    public static void main(String[] args) {
        try{
            Buku book = new Buku();
            Petugas officer =  new Petugas();
            Peminjaman loan = new Peminjaman();
            Siswa student = new Siswa();
            Laporan report = new Laporan();

            report.report(book);
            report.report(student);
            report.report(loan,book);

            loan.transactionProccess(student, loan, book);
            report.report(loan,book);
            report.report(book);
            report.report(student);
        } catch(Exception e){
            System.err.println("Terdpat Exception!!\n Info : " + e.getMessage());
        }
    }
}
