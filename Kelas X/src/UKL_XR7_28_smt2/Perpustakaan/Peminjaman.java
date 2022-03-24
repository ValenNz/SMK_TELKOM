package UKL_XR7_28_smt2.Perpustakaan;

import java.util.ArrayList;
import java.util.Scanner;

public class Peminjaman {
    /* Deklarasi Array list */
    private ArrayList<Integer> idBook = new ArrayList<Integer>();
    private ArrayList<Integer> many = new ArrayList<Integer>();
    private ArrayList<Integer> idStudent = new ArrayList<Integer>();

    public Peminjaman(){
        this.idStudent.add(0);
        this.idBook.add(0);
        this.many.add(1);

        this.idStudent.add(0);
        this.idBook.add(0);
        this.many.add(2);
    }

    public void transactionProccess(Siswa student, Peminjaman loan, Buku book){

        /* Deklarasi */
        int temp;
        int idStudents;

        Scanner input  = new Scanner(System.in);
        System.out.println("Silahkan Meminjam Buku Di Gramedia");


        do{
            System.out.println("Masukkan ID Siswa");
            idStudents = input.nextInt();
            System.out.println("Selamat datang "+student.getName(idStudents));

            ArrayList<Integer> idBook = new ArrayList<Integer>();
            ArrayList<Integer> many = new ArrayList<Integer>();

            int i = 0;
            temp = 0;


            System.out.println("Masukkan kode Buku :");
            temp = input.nextInt();

            if (temp != 99 && student.getStatus(idStudents) == false){
                idBook.add(temp);
                System.out.print(book.getBook(idBook.get(i))+ " sebanyak : ");
                many.add(input.nextInt());
                i++;
                student.editStatus(idStudents, true);
            }else if(student.getStatus(idStudents) == true){
                System.out.print("Siswa Telah meminjam!");
                break;
            }
        }while (temp!=99);

        System.out.println("Transaksi belanja "+student.getName(idStudents)+" sebagai berikut");
        System.out.println("Nama Buku \tQty \tHarga \tJumlah \t");

        int total=0;
        int x = idBook.size();
        for (int j = 0; j < x; j++){
            int jumlah=many.get(j) * book.getprice(idBook.get(j));
            total+=jumlah;
            System.out.println(book.getBook(idBook.get(j))+"\t"+
                    many.get(j)+"\t"+
                   book.getprice(idBook.get(j))+"\t"+ jumlah);
            loan.setLoan(book, idStudents, idBook.get(j),
                    many.get(j));
        }

        System.out.println("Total Belanja : "+total);
        //siswa.editSaldo(idSiswa, siswa.getSaldo(idSiswa)-total);
    }
    public void setLoan(Buku book, int idStudent, int idBook, int many){
        this.idStudent.add(idStudent);
        this.idBook.add(idBook);
        this.many.add(many);
        book.editStock(idBook, book.getStock(idBook)-many);
    }
    public int getIdBook(int id){
        return this.idBook.get(id);
    }
    public int getMany(int id){
        return this.many.get(id);
    }
    public int getIdStudent(int id){
        return this.idStudent.get(id);
    }
    public int getLoan(){
        return this.idStudent.size();
    }
}


