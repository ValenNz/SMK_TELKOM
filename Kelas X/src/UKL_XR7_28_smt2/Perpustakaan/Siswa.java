/* PARENT CLASS */

package UKL_XR7_28_smt2.Perpustakaan;

import java.util.ArrayList;

public class Siswa implements User, Id{

    /* Deklarasi Array list */
    private ArrayList<String> name = new ArrayList<String>();
    private ArrayList<String> address = new ArrayList<String>();
    private ArrayList<String> telephone = new ArrayList<String>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();

    /* Constructor */
    public Siswa() {
        /* add() untuk menambahkan elements ke dalam Array List;*/

        addStudents(null,null,null);
        addStudents("Nuevalen Refitra A","Jl Ontoseno 7 no 69","081230350677");
        addStudents("Recha Audria R.E","Jl Ontoseno 8 no 96","0812345698910");
    }

    /* Method */
    public void addStudents(String name, String address, String telephone){
        setName(name);
        setAddress(address);
        setTelephone(telephone);
        setStatus(true);
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
    public void setStatus(boolean status) {
        this.status.add(status);
    }
    public void editStatus(int idSiswa, Boolean status){
        this.status.set(idSiswa, status);
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
    public Boolean getStatus(int idStudent){
        return this.status.get(idStudent);
    }
    public int getStudent(){
        return this.status.size();
    }
}
