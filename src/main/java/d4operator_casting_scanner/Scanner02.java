package d4operator_casting_scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        /*Ornek 1:
    Kullanıcıdan;
    i)Adini ve Soyadini
    ii)Yaşını
    iii)Boyunu
    iv)Kilosunu
    v)Medeni durumunu girmesini isteyin.

    Ardından bunları bir etiketle konsolda farklı satırlarda yazdırın
    Example 1:
    From the user;
    i) Name and Surname
    ii) Age
    iii)Height
    iv) Weight
    v) Ask him to enter his marital status.

    Then print them on separate lines in the console with a label*/

        Scanner input = new Scanner(System.in);
        System.out.println("Adinizi ve Soyadinizi giriniz");
        String fullName = input.nextLine();//nextLine() methodu ile birden fazla kelime girisi alabilirsiniz

        System.out.println("Yasinizi giriniz");
        byte age = input.nextByte();

        System.out.println("Boyunuzu giriniz");
        float height = input.nextFloat();

        System.out.println("Kilonuzu giriniz");
        short weight = input.nextShort();

        System.out.println("Medeni durumunu giriniz");
        String maritalStatus = input.next();//next() methodu ile tek kelimeli String girisi alabilirsiniz

        //Kullanici girdilerini konsola yazdiralim
        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("height = " + height);
        System.out.println("weight = " + weight);
        System.out.println("maritalStatus = " + maritalStatus);








    }
}
