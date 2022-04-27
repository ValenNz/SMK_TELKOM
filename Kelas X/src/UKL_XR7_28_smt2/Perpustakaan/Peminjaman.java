package UKL_XR7_28_smt2.Perpustakaan;

import java.util.ArrayList;
import java.util.Scanner;

public class Peminjaman {
    /* Deklarasi Array list */
    private ArrayList<Integer> idBook = new ArrayList<Integer>();
    private ArrayList<Integer> many = new ArrayList<Integer>();
    private ArrayList<Integer> idStudent = new ArrayList<Integer>();

    /* Constructor */
    public Peminjaman(){
        this.idStudent.add(0);
        this.idBook.add(0);
        this.many.add(10);

        this.idStudent.add(0);
        this.idBook.add(0);
        this.many.add(12);

        this.idStudent.add(0);
        this.idBook.add(0);
        this.many.add(18);


    }

    /* Method */
    public void transactionProccess(Siswa student, Peminjaman loan, Buku book){

        /* Deklarasi */
        int temp;
        int idStudents;
        ArrayList<Integer> idBook = new ArrayList<Integer>();
        ArrayList<Integer> many = new ArrayList<Integer>();

        Scanner input  = new Scanner(System.in);
        System.out.print("\n\t\t\t\t ***** Silahkan Meminjam Buku di Nezuko Library ***** \n");

        System.out.print("Masukkan ID Siswa  : ");
        idStudents = input.nextInt();
        System.out.println("Selamat Datang     : "+student.getName(idStudents));

        do{
            System.out.print("Masukkan kode Buku : ");
            temp = input.nextInt();

            if ((temp >= 1) && (student.getStatus(idStudents) == true)){
                idBook.add(temp);
                System.out.print(book.getBook(idBook.get(0))+ " sebanyak     : ");
                many.add(input.nextInt());
                student.editStatus(idStudents, false);
                break;

            } else if((temp == 2) && (student.getStatus(idStudents) == true)){
                idBook.add(temp);
                System.out.print(book.getBook(idBook.get(0))+ " sebanyak : ");
                many.add(input.nextInt());
                student.editStatus(idStudents, false);
                break;
            }else if((temp == 3) && student.getStatus(idStudents) == true) {
                idBook.add(temp);
                System.out.print(book.getBook(idBook.get(0)) + " sebanyak : ");
                many.add(input.nextInt());
                student.editStatus(idStudents, false);
                break;
            } else if(0 <= temp || temp >= 3){
                System.err.println("Anda salah memasukan kode buku");
            }

        }while (temp!=99);

        System.out.println("\nPeminjaman Buku "+student.getName(idStudents)+" sebagai berikut");
        System.out.println("Nama Buku \t\t\tJumlah \t\t\t\tBiaya");

        int total=0;
            int jumlah=many.get(0) * book.getprice(idBook.get(0));
            total = total + jumlah;
            System.out.println(book.getBook(idBook.get(0))+"\t\t\t\t"+many.get(0)+"\t\t\t\t\t"+book.getprice(idBook.get(0)));
            loan.setLoan(book, idStudents, idBook.get(0), many.get(0));


        System.out.println("Total Biaya : "+total);
        System.out.println(" \t\t\t\t\t\t\t\t INFORMATION !!! " + "\n Siswa tidak boleh meminjam buku lagi sebelum bukunya dikembalikan !!!");
    }

    public void returnBook(Siswa student, Peminjaman loan, Buku book) {

        /* Deklarasi */
        int temp;
        int idStudents;

        Scanner input  = new Scanner(System.in);
        System.out.print("\n\t\t\t\t ***** Silahkan Mengembalikan Buku di Nezuko Library ***** \n");

        System.out.print("Masukkan ID Siswa  : ");
        idStudents = input.nextInt();

        System.out.println("Selamat Datang     : "+student.getName(idStudents));

        ArrayList<Integer> idBook = new ArrayList<Integer>();
        ArrayList<Integer> many = new ArrayList<Integer>();

        do{
            System.out.print("Masukkan kode Buku : ");
            temp = input.nextInt();

            if (( 1 <= temp && temp <= 3 ) && (student.getStatus(idStudents) == true)){
                idBook.add(temp);
                System.out.print(book.getBook(idBook.get(0))+ " sebanyak     : ");
                many.add(input.nextInt());
                student.editStatus(idStudents, true);
                break;


            } else if(0 < temp || temp >= 3){
                System.err.println("Anda salah memasukan kode buku");
            }

        }while (temp!=99);
        System.out.println("\nPengembalian Buku "+student.getName(idStudents)+" sebagai berikut");
        System.out.println("Nama Buku \t\t\tJumlah \t\t\t\tBiaya");

        int total=0;
        int jumlah=many.get(0) * book.getprice(idBook.get(0));
        total = total + jumlah;
        System.out.println(book.getBook(idBook.get(0))+"\t\t\t\t"+many.get(0)+"\t\t\t\t\t"+book.getprice(idBook.get(0)));
        loan.setLoanReturn(book, idStudents, idBook.get(0), many.get(0));


        System.out.println("Total Biaaya : "+total);
        System.out.println(" \t\t\t\t\t\t\t\t INFORMATION !!! " + "\n Siswa boleh meminjam buku lagi setelah bukunya dikembalikan !!!");

    }

    public void setLoan(Buku book, int idStudent, int idBook, int many){
        this.idStudent.add(idStudent);
        this.idBook.add(idBook);
        this.many.add(many);
        book.editStock(idBook, book.getStock(idBook)-many);

    }

    public void setLoanReturn(Buku book, int idStudent, int idBook, int many){
        this.idStudent.add(idStudent);
        this.idBook.add(idBook);
        this.many.add(many);
        book.editStock(idBook, book.getStock(idBook)+many);

    }

}


