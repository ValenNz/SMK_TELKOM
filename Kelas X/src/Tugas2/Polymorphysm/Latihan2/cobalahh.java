package Tugas2.Polymorphysm.Latihan2;

public class cobalahh {
    public static void main(String[] args) {
        /* Fill Class and call method */
        Line coba = new Line(2.5,3,4,5);
        Line pertama = new Line(3,4,5,6);
        coba.getLength();
        coba.isGreater(coba, pertama);
        System.out.println(coba.isGreater(coba, pertama));
    }
}
