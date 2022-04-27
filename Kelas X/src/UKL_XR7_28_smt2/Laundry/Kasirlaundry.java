package UKL_XR7_28_smt2.Laundry;

import java.util.Scanner;

public class Kasirlaundry {
    public static void main(String[] args) {
        /* Deklarasi loop */
        boolean progres = true;

        /* Make Object */
        Transaksi transaksi = new Transaksi();
        JenisLaundry type = new JenisLaundry();
        Client client = new Client();
        Petugas petugas = new Petugas();
        TampilanChild report = new TampilanChild();
        Petugas name = new Petugas();

        /* Lopping Process */
        while (progres) {
            System.out.println("\n________________ Tampilan Aplikasi _______________");
            Scanner input = new Scanner(System.in);
            System.out.println("1. Pelanggan");
            System.out.println("2. Petugas");
            System.out.println("3. Exit");
            System.out.print("Masuk sebagai : ");
            int choice = input.nextInt();

            try {

                /* Conditional Pelangggan */
                if (choice == 1) {
                    transaksi.prosesInputTransaksi();
                    transaksi.prosesTransaksi(client, type);
                    transaksi.prosesAkhir(client, type);
                    report.report(name);
                    report.tampilanAkhir();

                }

                /* Conditional Petugas*/
                else if (choice == 2){
                    type.addLaundry(petugas,0,12345);
                    System.out.println("\n________________ Tampilan Aplikasi _______________");
                    System.out.println("1. Pelanggan");
                    System.out.println("2. Petugas");
                    System.out.println("3. Exit");
                    System.out.print("Masuk sebagai : ");
                    int pelanggan = input.nextInt();

                    if (pelanggan == 1) {
                        transaksi.prosesInputTransaksi();
                        transaksi.prosesTransaksi(client, type);
                        transaksi.prosesAkhir(client, type);
                        report.report(name);
                        report.tampilanAkhir();
                    }
                }

                /* Conditional Exit */
                else if (choice == 3) {
                    progres = false;


                    /* Conditional else */
                } else if ( choice > 3){
                    System.out.println("Maaf kami belum tersedia");
                }

            } catch (Exception e) { // nangkap error
                System.out.println("Terdpat Exception!!\n Info : " + e.getMessage());
            }
        }

    }
    }

