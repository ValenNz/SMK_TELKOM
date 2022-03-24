/* PARENT CLASS */

package UKL_XR7_28_smt2.Perpustakaan;

import java.util.ArrayList;

public class Siswa implements User{

    /* Deklarasi Array list */
    private ArrayList<String> name = new ArrayList<String>();
    private ArrayList<String> address = new ArrayList<String>();
    private ArrayList<String> telephone = new ArrayList<String>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();

    /* Constructor */
    public Siswa() {
        /* add() untuk menambahkan elements ke dalam Array List;*/

        /* Siswa 1 */
        this.name.add("Nuevalen Refitra Alswando");
        this.address.add("Jl Ontoseno 7 no 69");
        this.telephone.add("081230350677");
        this.status.add(true);

        /* Siswa 1 */
        this.name.add("Recha Audria Reamurti Elswinda");
        this.address.add("Jl Ontoseno 8 no 96");
        this.telephone.add("0812345698910");
        this.status.add(true);
    }

    /* Method */

    /* Add elements (baance) */
    public void setStatus(boolean status) {
        this.status.add(status);
    }

    /* Acces (elements) */
    public Boolean getStatus(int idStudent){
        return this.status.get(idStudent);
    }

    /* Changes elements (id & balance) */
    public void setStatus(int idStudent, boolean status){
        this.status.set(idStudent,status);
    }

    /* Many elements (balance) */
    public int getStudent(){
        return this.status.size();
    }

    /* Method untukmenimpa nilai pada indeks tertentu */
    public void editStatus(int idSiswa, Boolean status){
        this.status.set(idSiswa, status);
    }

    /* Override Method Setter */
            /* changes field value */
    public void setName (String name){
        this.name.add(name);
    }
    public void setAddress (String address){
        this.address.add(address);
    }
    public void setTelephone (String telephone){
        this.telephone.add(telephone);

    }

    /* Ovveriide Method Getter */
            /* take field value */

    public String getName(int idStudent){
        return this.name.get(idStudent);
    }
    public String getAddress (int idStudent){
        return this.address.get(idStudent);
    }
    public String getTelephone (int idStudent){
        return this.telephone.get(idStudent);
    }
}
