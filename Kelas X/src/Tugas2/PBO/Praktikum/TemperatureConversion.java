package Tugas2.PBO.Praktikum;

public class TemperatureConversion {
    public static void main(String[] args) {
        float celcius = 78, reamur, farenheit, kelvin;

        reamur = celcius * 4 / 5;
        farenheit = ((celcius * 9/5) + 32);
        kelvin = celcius + 273;

        System.out.println("***** Temperature Conversion *****");
        System.out.println(" Suhu Celcius : " + celcius + 'C');
        System.out.println(" Suhu Reamur : " + reamur + 'R');
        System.out.println(" Suhu Farwenhait : " + farenheit + 'F');
        System.out.println("Suhu Kelvin : " + kelvin + 'K');
    }
}
