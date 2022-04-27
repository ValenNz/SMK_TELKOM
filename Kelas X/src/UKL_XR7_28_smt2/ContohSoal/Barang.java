package UKL_XR7_28_smt2.ContohSoal;

import java.util.ArrayList;

public class Barang {

    /* Deklarasi Array List*/
    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();

    /* Constructor */
    public Barang() {
        this.namaBarang.add("Cokelat enak");
        this.stok.add(15);
        this.harga.add(10000);

        this.namaBarang.add("Sabun Beri");
        this.stok.add(30);
        this.harga.add(5000);

        this.namaBarang.add("Odol SIWAK");
        this.stok.add(20);
        this.harga.add(15000);
    }

    /* Method setter */
    public void setNamaBarang(String namaBarang ){
        this.namaBarang.add(namaBarang);
    }
    public void setHarga(int harga ){
        this.harga.add(harga);
    }
    public void setStok(int stok ){
        this.stok.add(stok);
    }
    public void editStok(int idBarang, int stok){
        this.stok.set(idBarang, stok);;
    }

    /* Method Getter */
    public String getNamaBarang(int idBarang){
        return this.namaBarang.get(idBarang);
    }
    public int getHarga(int idBarang){
        return this.harga.get(idBarang);
    }
    public int getJmlBarang(){
        return this.namaBarang.size();
    }
    public int getStok(int idBarang){
        return this.stok.get(idBarang);
    }
}

