package UKL_XR7_28_smt2.Perpustakaan;


public class Laporan {

    /* Method Nama Petugas */
    public void report(Petugas name){

        int i =0;
        System.out.println("\n_____ PETUGAS _____");
        System.out.println("\t" +name.getName(i));
        System.out.println("\t" +name.getAddress(i));
        System.out.println("\t" +name.getTelephone(i));
    }

    /* Method Tabel Buku */
    public void report(Buku book){

        System.out.println("\n------------------------------------------------------------------------------------------");
        System.out.println("\tNama Barang\t\t\t\t\tStok\t\t\t\tBiaya");
        System.out.println("------------------------------------------------------------------------------------------");

        int x=book.getStock();
        for (int i = 0; i < x; i++) {
            System.out.println("\t"+book.getBook(i)+" \t\t\t\t\t\t"+ book.getStock(i)+"\t\t\t\t\t"+book.getprice(i));
        }
        System.out.println("------------------------------------------------------------------------------------------");
    }

    /* Method Tabel Siswa */
    public void report(Siswa student){
        int x=student.getStudent();

        System.out.println("\n------------------------------------------------------------------------------------------");
        System.out.println("\tNama\t\t\t\t\t\tAlamat \t\t\t\t\t\tTelepon \t\t\tStatus");
        System.out.println("------------------------------------------------------------------------------------------");

        for (int i = 0; i < x; i++) {
            System.out.println("\t"+student.getName(i)+"\t\t\t"+ student.getAddress(i)+"\t\t\t"+student.getTelephone(i)+"\t\t"+student.getStatus(i));
        }
        System.out.println("------------------------------------------------------------------------------------------");
    }

}
