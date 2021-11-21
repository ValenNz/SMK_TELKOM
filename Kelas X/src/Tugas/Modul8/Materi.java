package Tugas.Modul8;

public class Materi {
    public static void main(String[] args) {


        double matriks [][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9},

        };
        for (int i = 0; i< matriks.length; i++) {
            for (int j = 0; j<matriks[i].length; j++) {
                System.out.println(matriks[i][j]);
            }
        }
    }
}
