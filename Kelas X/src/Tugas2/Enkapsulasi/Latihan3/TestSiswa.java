package Tugas2.Enkapsulasi.Latihan3;


class encapsiswa{

    // Deklarasi Var
    private String name;
    private String address;
    private int age;

    // constructor umur
    public int getAge(){
        return age;
    }

    // constructor nama
    public String getName(){
        return name;
    }

    // constructor alamat
    public String getAddress(){
        return address;
    }

    // Method mengembalikan nilai umur
    public void setAge (int newAge){
        age=newAge;
    }

    // Method mengembalikan nilai nama
    public void setName (String newName){
        name=newName;
    }

    // Method mengembalikan nilai alamat
    public void setAddress (String newAddress){
        address=newAddress;
    }
}
public class TestSiswa {
    public static void main(String[] args) {

        // Membuat object
        encapsiswa siswa = new encapsiswa();

        // set nama + umur + alamat
        siswa.setName("agus");
        siswa.setAge(20);
        siswa.setAddress("Malang");

        // output hasil program dngena method yang terhubung ke constructor
        System.out.println("nama: "+siswa.getName() + " alamat "+siswa.getAddress()+ " berumur "+siswa.getAge()  + " tahun");

    }
}
