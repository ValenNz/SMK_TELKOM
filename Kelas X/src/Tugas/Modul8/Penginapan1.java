package Tugas.Modul8;

import java.util.Scanner;

public class Penginapan1 {

        public static void main(String[] args) {
            int jumlah_hari;
            double jumlah_bayar;
            String datapenginapan[][] = {
                    {"Durian", "3", "100000", "200000", "300000"},
                    {"Pisang", "2", "150000", "260000", "380000"},
                    {"Lombok", "1", "500000", "130000", "320000"},
            };
            Scanner input = new Scanner(System.in);
            System.out.println("Inputkan Jumlah Hari : ");
            jumlah_hari = input.nextInt();
            System.out.println("Inputkan cottage : ");
            String nama_room = input.next();
            System.out.println("INputkan Jenis hari");
            String hari = input.next();
            if (hari == "weekday") {
                System.out.println(datapenginapan[0][3]);

                for (int h = 0; h < datapenginapan.length; h++) {
                    for (int n = 0; n < datapenginapan[h].length; n++) {
                        if (datapenginapan[h][n].equals(nama_room)) {
                            jumlah_bayar = jumlah_hari * Double.parseDouble(datapenginapan[1][2]);
                            System.out.println("jumlah bayar" + jumlah_bayar);
                        }
                    }
                }
            }

        }
    }

