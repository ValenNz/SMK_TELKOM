package UKL_XR7_28_smt2.Perpustakaan;


public class Laporan {
    public void report(Buku book){
        int x=book.getStock();

        System.out.println();
        System.out.println("Tabel Barang");
        System.out.println();
        System.out.println("Nama Barang \tStok \tHarga");
        for (int i = 0; i < x; i++) {
            System.out.println(book.getBook(i)+"\t"+
                    book.getStock(i)+"\t"+book.getprice(i));
        }
    }
    public void report(Siswa student){
        int x=student.getStudent();

        System.out.println();
        System.out.println("Tabel Siswa");
        System.out.println();
        System.out.println("Nama \tAlamat \t\t\tTelepon \tStatus");
        for (int i = 0; i < x; i++) {
            System.out.println(student.getName(i)+"\t"+
                    student.getAddress(i)+"\t"+student.getTelephone(i)+"\t"+student.getStatus(i));
        }
    }

    public void report(Peminjaman loan, Buku book){
        int x=loan.getLoan();

        System.out.println();
        System.out.println("Laporan Transaksi");
        System.out.println();
        System.out.println("Nama Barang\tQty \tHarga \tJumlah");

        int total=0;
        for (int i = 0; i < x; i++) {
            int jumlah=loan.getMany(i)*book.getprice(loan.getIdBook(i));
            total+=jumlah;

            System.out.println(book.getBook(loan.getIdBook(i))+"\t"+

                    loan.getMany(i)+"\t"+book.getprice(loan.getIdBook(i))+"\t" + jumlah);
        }
        System.out.println("Total Omset ="+total);
    }
}
