package Tugas.Modul8;

public class PakZakaria_Toko {
    public static void main(String[] args) {

        String barang[][] = {
                {"Supreme Mie", "5", "10000"},
                {"Mie Sedap", "3", "50000"},
                {"Selera Rakyat", "10", "45000"},
                {"Live boy", "20", "3000"},
        };

        int jumlahitem=0;


        int totalHarga = 0;
                for (int i = 0; i< barang.length; i++) {
                    jumlahitem = jumlahitem +
                            Integer.parseInt(barang[i][1]);

                   int jumlah = Integer.parseInt(barang[i][1]);
                   int harga = Integer.parseInt(barang[i][1]);

                   if(jumlah > 5){
                       harga = harga - 1000;
                   }
                    totalHarga = totalHarga + (jumlah * harga);
                }
        System.out.println("jumlah item seluruhnya adalah " + jumlahitem);
        System.out.println("Total harga seluruhnya adalah " + totalHarga);


        }
    }

