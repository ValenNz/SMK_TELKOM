package Tugas.Modul9;

import java.lang.Math;
import java.util.Scanner;


        public class Pertemuan2 {

                public static void max(int a, int b,int c) {
                int maks;
                System.out.print("nilai tertinggi :");
                maks = Math.max(a, b);
                if (c>maks){
                    maks = c;
                }
                System.out.println(maks);


            }

            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                int a,b,c;

                System.out.print("Masukan nilai a : ");
                a=input.nextInt();

                System.out.print("Masukan nilai b : ");
                b = input.nextInt();

                System.out.print("Masukan nilai c: ");
                c=input.nextInt();

                    max(a,b,c);



            }

        }
