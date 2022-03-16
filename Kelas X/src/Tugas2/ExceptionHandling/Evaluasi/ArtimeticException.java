package Tugas2.ExceptionHandling.Evaluasi;
/* Import Scanner*/
import java.util.Scanner;

public class ArtimeticException {
    public static void main(String args[])
    {
        /* Memasukan value var a */
        Scanner input = new Scanner(System.in); // console = input

        /* OUTPUT MENU APP */
        System.out.println("===== Welcom to my APP ======");

        System.out.println("Select Arithmetic Operation !!");
        System.out.println("+ (Addition)");
        System.out.println("- (Subtraction)");
        System.out.println("* (multiplication)");
        System.out.println("/ (division)");
        System.out.println("% (Modulus)");
        System.out.print("Input in here :");
        String select = input.nextLine(); // input choose operation

        /* Inpt memasukan nilai */
        System.out.println("Input the value a :");
        int a = input.nextInt();
        System.out.println("Input the value b :");
        int b = input.nextInt();

        try{ // melakukan pemrograman + melempar error ke catch
            switch(select){
                case "+" :
                    int result = a + b;
                    System.out.println("The result is : " + result );
                    break;
                case "-" :
                    int result1 = a - b;
                    System.out.println("The result is : " + result1 );
                    break;
                case "*" :
                    int result2 = a * b;
                    System.out.println("The result is : " + result2 );
                    break;
                case "/" :
                    int result3 = a / b;
                    System.out.println("The result is : " + result3 );
                    break;
                case "%" :
                    int result4 = a % b;
                    System.out.println("The result is : " + result4 );
                    break;
                default:
                    System.out.println ("Your operation doesn't exist");
            }

        }catch (Exception e){ // untuk menangani error / menangkap kode program try
            System.err.println("Cannot divide by zero ");
            System.err.println("Detail : " + e); // e = exception (penjelasan error)
            System.out.println("Program Selesai");

        }
    }
}