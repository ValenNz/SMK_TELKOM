package UKL_XR7_28_smt2.Perpustakaan;

import java.util.ArrayList;

public class Petugas implements User, Id{

    /* Deklarasi Array list */
    private ArrayList<String> name = new ArrayList<String>();
    private ArrayList<String> address = new ArrayList<String>();
    private ArrayList<String> telephone = new ArrayList<String>();

    /* Constructor */
    public Petugas(){
        /* add() untuk menambahkan elements ke dalam Array List;*/

        this.name.add("Lee Ji-eun");
        this.address.add("Jl korean 93");
        this.telephone.add("081298641281");
    }

    /* Method */

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

    public String getName (int idOfficer){
        return this.name.get(idOfficer);
    }
    public String getAddress (int idOfficer){
        return this.address.get(idOfficer);
    }
    public String getTelephone (int idOfficer){
        return this.telephone.get(idOfficer);
    }

}
