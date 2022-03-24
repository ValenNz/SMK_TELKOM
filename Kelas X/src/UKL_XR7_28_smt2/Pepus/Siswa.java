package UKL_XR7_28_smt2.Pepus;

import java.util.ArrayList;

public class Siswa implements User {
    // ==> Jika Status False berarti Siswa dengan id x dalam keadaan belum meminjam
    private ArrayList<String> namaSiswa = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();

    /* menambah elemen baru pada array list */
    public Siswa() {
        /* siswa 1 */
        this.namaSiswa.add("Valen");
        this.alamat.add("Malang");
        this.telepon.add("081216012735");
        this.status.add(false);

        /* siswa 2 */
        this.namaSiswa.add("Puan");
        this.alamat.add("Wakanda");
        this.telepon.add("110923243252");
        this.status.add(true);
    }

    /* Getter mengambil jumlah siswa dari panjang array list */
    public int getJmlSiswa(){
        return this.namaSiswa.size();
    }
    /* setter mengisi status siswa dari penambahan elemen baru pada array list*/
    public void setStatus(boolean status){
        this.status.add(status);
    }
    /* getter mengambli status siswa dari elemen array list*/
    public boolean getStatus(int idSiswa){
        return this.status.get(idSiswa);
    }
    /* Method untukmenimpa nilai pada indeks tertentu */
    public void editStatus(int idSiswa, Boolean status){
        this.status.set(idSiswa, status);
    }

    /* Method Setter override */
    @Override
    public void setNama(String namaMember ){
        this.namaSiswa.add(namaMember); // menambah nama pada element array list
    }

    @Override
    public void setAlamat(String alamat ){
        this.alamat.add(alamat); // menambah alamat pada element array list
    }
    @Override
    public void setTelepon(String telepon ){
        this.telepon.add(telepon); // menambah telepom pada element array list
    }

    /* Method Getter overide */
    @Override
    public String getNama(int idMember){
        return this.namaSiswa.get(idMember); // mengambil element name pada array list yang di isi ke idMember
    }

    @Override
    public String getAlamat(int idMember){
        return this.alamat.get(idMember); // mengambil element adress pada array list yang di isi ke idMember
    }

    @Override
    public String getTelepon(int idMember){
        return this.telepon.get(idMember); // mengambil element phonenumber pada array list yang di isi ke idMember
    }
}
