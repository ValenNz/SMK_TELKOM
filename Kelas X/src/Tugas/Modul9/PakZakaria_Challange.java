package Tugas.Modul9;

public class PakZakaria_Challange {
    public static void main(String[] args) {
        String[][] data = {
                // "id" ,"name","bb", "tinggi"
                {"01", "Peter", "80", "1.85"},
                {"02", "John", "65", "1.65"},
                {"03", "Robert", "90", "1.98"},
                {"04", "Tyson", "70", "1.8"},
                {"05", "Mia", "60", "1.9"},
        };
        System.out.println(data[0][0] + "\t" + data[0][1] +  "\t" + hitungBMI(Double.parseDouble(data[0][2]),Double.parseDouble(data[0][3])));
        System.out.println(data[1][0] + "\t" + data[1][1] +  "\t" + hitungBMI(Double.parseDouble(data[1][2]), Double.parseDouble(data[1][3])));
        System.out.println(data[2][0] + "\t" + data[2][1] +  "\t" + hitungBMI(Double.parseDouble(data[2][2]), Double.parseDouble(data[2][3])));
        System.out.println(data[3][0] + "\t" + data[3][1] +  "\t" + hitungBMI(Double.parseDouble(data[3][2]), Double.parseDouble(data[3][3])));
        System.out.println(data[4][0] + "\t" + data[4][1] +  "\t" + hitungBMI(Double.parseDouble(data[4][2]), Double.parseDouble(data[4][3])));

    }

    public static double hitungBMI(double berat, double tinggi) {


         double bmi = (berat / (tinggi * tinggi));

        return bmi;
    }
}
