package Tugas2.Polymorphysm.Latihan1;

public class AeroPlan extends Vehicle {

    /* Ovveride Method */
    @Override
    public void walk() {
        System.out.println("Aeroplan Flying"); // fill method
    }

    @Override
    public void fuel(){
        System.out.println("Fuels");           // fill method
    }

    public static void main(String[] args) {
        /* Make Object */
        AeroPlan garuda = new AeroPlan();

        /* Call Method */
        garuda.function();
        garuda.fuel();
        garuda.walk();

    }
}
