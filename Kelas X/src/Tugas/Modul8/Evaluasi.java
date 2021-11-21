package Tugas.Modul8;

public class Evaluasi {
    public static void main(String[] args) {
        String[][] data = {{"Arif", "SMK Tadika Mesra", "X"},
                {"Sindu", "SMK Telkom", "X"},
                {"Monica", "SMK Baru", "X"},
                {"Wulan", "SMK Kartika", "IX"},
                {"Sari", "SMK Lama", "XI"},
        };

        for (int x = 0; x < data.length; x++) {
            System.out.println("Nama :" + data[x][0]);
            System.out.println("Sekolah :" + data[x][1]);
            System.out.println("Kelas :" + data[x][2]);
            System.out.println("==================");
        }
    }
}
