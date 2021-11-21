package Tugas.Modul7;

public class Pertemuan2 {

    public static void main (String[]args) {
        String nama = "Salsabila rahmawati ningsih";

        char[] charArray = nama.toCharArray();
        int n = charArray.length;
        int counter = 0;

        for (int i = 0; i < n; i++) {
            if (charArray[i] == 'i') counter++;
        }

        System.out.print("i ada sebanyak " + counter);
    }
}
