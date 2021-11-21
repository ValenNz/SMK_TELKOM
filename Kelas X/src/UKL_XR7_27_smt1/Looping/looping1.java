package UKL_XR7_27_smt1.Looping;

public class looping1 {
    public static void main(String[] args) {
        // deklarasi a = nilai awal, b = beda, total = total semua angka aritmatika
       int a = 4, b = 9, total = 0;

       for (int n = 14; n < 31; n++ ){ // untuk membuat perulangan hingga suku ke n
           int x = a + (n-1) * b; // operasi aritmatika
           total += x; // operasi total semua angka aritmatika
           System.out.println(x); // mengoutput operasi aritmatika
       }
        System.out.print("hasil total deret aritmatika " + total); // mengoutput semua angka aritmatika
    }

}
