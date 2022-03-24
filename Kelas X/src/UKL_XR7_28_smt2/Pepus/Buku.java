package UKL_XR7_28_smt2.Pepus;

import java.util.ArrayList;

public class Buku {
    /* Membuat array list */
    private ArrayList<String> namaBuku = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();

    /* menambah elemen baru pada array list */
    public Buku() {
        /* Buku 1 */
        this.namaBuku.add("Danur");
        this.stok.add(10);
        this.harga.add(1000);

        /* Buku 2 */
        this.namaBuku.add("Janur");
        this.stok.add(20);
        this.harga.add(2000);

        /* Buku 3 */
        this.namaBuku.add("Banur");
        this.stok.add(30);
        this.harga.add(3000);
    }

    /* Getter mengambil jumlah buku dari panjang array list */
    public int getJmlBuku(){
        return this.namaBuku.size();
    }
    /* setter mengisi nama buku dari penambahan elemen baru pada array list*/
    public void setNamaBuku(String namaBuku){
        this.namaBuku.add(namaBuku);
    }
    /* getter mengambil nama buku dari elemen array list*/
    public String getNamaBuku(int idBuku){
        return this.namaBuku.get(idBuku);
    }
    /* setter mengisi stock buku dari penambahan elemen baru pada array list*/
    public void setStok(int stok ){
        this.stok.add(stok);
    }
    /* getter mengambil stock buku dari elemen array list*/
    public int getStok(int idBuku){
        return this.stok.get(idBuku);
    }
    /* Method untuk menimpa stock buku pada indeks tertentu */
    public void editStok(int idBuku, int stok){
        this.stok.set(idBuku, stok);
    }
    public void setHarga(int harga ){
        this.harga.add(harga);
    }
    public int getHarga(int idBuku){
        return this.harga.get(idBuku);
    }
}
