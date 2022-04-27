package UKL_XR7_28_smt2.ContohSoal;

/* Class Interface
   * maka method abstract
*/

    public interface User{
        void setNama(String nama);
        void setAlamat(String Alamt);
        void setTelepon(String Telepon);

       String getNama(int id);
       String getAlamat(int id);
       String getTelepon(int id);
    }