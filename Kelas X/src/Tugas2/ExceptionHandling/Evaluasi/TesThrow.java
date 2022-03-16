package Tugas2.ExceptionHandling.Evaluasi;

import java.util.Scanner;

public class TesThrow {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Indonesian currency");
            String curency = input.next();

            if (curency.equalsIgnoreCase("Rupiah")) {
                System.out.println("Benar");
            } else throw new Exception("Come on bro!!! ");

        }catch(Exception e) {
            System.err.print(e);
        }
    }
}

