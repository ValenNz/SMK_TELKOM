package Tugas2.Polymorphysm.Latihan3;

class PembayaranGaji {
    public int hitungGaji(Pegawai peg){
        int uang = peg.gaji();

        /* Conditional Selection */
        if (peg instanceof Direktur)
            uang+=((Direktur)peg).tunjangan();

        if (peg instanceof Staf)
            uang+=((Staf)peg).Bonus();

        return uang; // return value uang
    }
    public static void main(String[] args) {

        /* Make new variebel */
        PembayaranGaji pg = new PembayaranGaji();
        Staf ali = new Staf();
        Direktur Tony = new Direktur();

        /* Output */
        System.out.println("gaji staf = "+pg.hitungGaji(ali));
        System.out.println("gaji direktur = "+pg.hitungGaji(Tony));
    }
}

