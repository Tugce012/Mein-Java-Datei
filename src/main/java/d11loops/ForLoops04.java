package d11loops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ForLoops04 {
    public static void main(String[] args) {
        /* Ornek 2:  Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz.
Example 2:  Create the code that prints the following figure to the console.

      X X X X X
      X X X X X
      X X X X X    */

        Scanner input = new Scanner(System.in);
        System.out.println("Satir sayisini giriniz");
        int row =input.nextInt();

        System.out.println("Sütun sayisini giriniz");
        int column =input.nextInt();

        // int row = 3;
        // int column = 5;

        for (int i = 1; i <=row ; i++) {
            for (int k = 1; k <=column; k++) {
                System.out.print("X ");
            }
            System.out.println(); //üstteki print yanyana yazdirir. pointer'i bir alta aldik bu sout ile
        }

        /*Odev : Asagidaki sekli for-loop kullanarak çizdiriniz.
Homework: Draw the following figure using for-loop.

	*
	* *
	* * *
	* * * *

*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Satir sayisini giriniz");
        int row2 = input.nextInt();
        System.out.println("sütun sayisini giriniz");
        int column2 = input.nextInt();

        for (int i = 1; i <=row2; i++){
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
