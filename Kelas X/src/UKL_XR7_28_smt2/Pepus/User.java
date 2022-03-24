package UKL_XR7_28_smt2.Pepus;

public interface User {
    /* Deklarasi */

    /* mesetting field */
    public void setNama(String nama);
    public void setAlamat(String alamat);
    public void setTelepon(String telepon);

    /* mengambil field */
    public String getNama(int id);
    public String getAlamat(int id);
    public String getTelepon(int id);
}
