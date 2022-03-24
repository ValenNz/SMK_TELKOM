package UKL_XR7_28_smt2.ContohSoalPBO;

    public interface User{
        public void setNama(String nama);
        public void setAlamat(String Alamt);
        public void setTelepon(String Telepon);

       public String getNama(int id);
       public String getAlamat(int id);
       public String getTelepon(int id);
    }