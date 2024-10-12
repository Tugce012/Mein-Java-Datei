package d17constructors_datetime;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class DateTime03 {
    public static void main(String[] args) {
 //ornek 1: Kullanicidan aldiginiz tarih gecmise ait ise “Gecersiz tarih girdiniz” mesaji veriniz.
//Kullanicidan aldiginiz tarih gelecege ait ise “Zamani girebilirsiniz” deyiniz.

//Example 1: If the date you have received from the user is in the past, give the message “You have entered an invalid date”.
//If the date you have received from the user is in the future, say “You can enter the time”.

        Scanner input = new Scanner(System.in);
        LocalDate givenDate = null; //LocalDate givenDate;  de yazabilirdik

        while (true){

            System.out.println("Lütfen yili giriniz");
            int year = input.nextInt();

            System.out.println("Lütfen ayi giriniz");
            int month = input.nextInt();

            if (month<1 || month>12){
                System.out.println("Ay 1 ile 12 arasinda olmalidir. Tekrar deneyiniz");
                continue; //kullaniciyi dongunun basina yonlendirir
            }
            System.out.println("Lütfen günü giriniz");
            int day = input.nextInt();

            //Ayin kac cektigini bulalim.Yil ve ay icin YearMonth objesi olusturalim
            YearMonth yearMonth = YearMonth.of(year, month);

            //Ayin maksimum gün sayisini bulalim
           int daysInMonth = yearMonth.lengthOfMonth();

           if (day<1 || day>daysInMonth) {
               System.out.println("Girilen ay icin gecersiz gün. Tekrar dneyiniz");
               continue;
           }
           givenDate = LocalDate.of(year,month,day); //girilen bilgilerle tarih olusturduk.

            if (givenDate.isBefore(LocalDate.now())){
                System.out.println("Gecersiz, gecmis bir tarih girdiniz. Tekrar deneyiniz");
            }else{
                System.out.println("Zamani girebilirsiniz");
                break; //Gecerli tarih girildigi icin döngüyü kirdik
            }

        }

        //break'te buradaki kodlar calisir
        //return icinde bulundugu metodu sonlandirir. Burada main metodu sonlandirir ve
        //programin calismasi durur




    }
}
