package Tugas2.ExceptionHandling.Latihan2;

public class KeywordThrow {

    /* Method throws */
    public static void test(int n)
            throws NullPointerException, java.lang.ArithmeticException {
        if (n < 0) {
            throw new NullPointerException(
                    "KESALAHAN: null pointer");
        } else {
            throw new java.lang.ArithmeticException(
                    "KESALAHAN: arithmetic exception");
        }
    }

    public static void main(String[] args) {
        /* Try Catch */
        try {                                                                       // Mencoba program
            //test(-12); // menimbulkan eksepsi NullPointerException
            test(0); // menimbulkan eksepsi ArithmeticException
        } catch (java.lang.ArithmeticException | NullPointerException e) {          // Meangkap program
            System.out.println("Eksepsi ditangkap di sini...");
            System.out.println(e.getMessage());
        }
        System.out.println("Statemen setelah blok try-catch");
    }
}
