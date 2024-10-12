package d12loopsarrays;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        //Ornek 1: 0-100 arasi sayi tahmin etme oyununu do-while ile yaziniz.

        Scanner scanner= new Scanner(System.in);
        Random random = new Random(); //java rastgele sayi üretecek bu sekilde

        //0-100 arasinda rastgele bir sayi üretelim
        int rastgeleSayi = random.nextInt(101);//0 ile 100 arasi bir sayi üretir

        //kullanicinin kac kere tahmin yaptigini takip etmek icin bir sayac olusturalim
        int denemeSayisi = 0;

        //Kullanicinin yaptigi tahmini saklamak icin bir degisken olusturalim.
        int tahminEdilen; // int tahminEdilen = ""; calisir miydi?

        //kullanicinin sayiyi dogru tahmin edip etmedigini kontrol etmek icin bir boolean degisken olusturalim
        boolean tahminDogrumu = false;

        System.out.println("0-100 arasinda bir sayiyi tahmin etmeye calisin");

        do {
            //kullanicidan bir tahmin alalim
            System.out.println("tahmininizi yapiniz");
            tahminEdilen = scanner.nextInt();

            //sayaci bir artiralim
            denemeSayisi++;

            //tahmini kontrol edelim
            if (tahminEdilen < rastgeleSayi){
                System.out.println("sayi daha büyük");
            } else if (tahminEdilen > rastgeleSayi) {
                System.out.println("sayi daha kücük");
            }else {
                tahminDogrumu = true;
                System.out.println("Tebrikler, dogru tahmin!");
                System.out.println("Deneme sayisi : " + denemeSayisi);
            }

        }while (!tahminDogrumu);  //Döngü dogru tahmin yapincaya kadar devam edecek
        scanner.close();//random da kapatiliyor mu?

        //ODEV: 20(dahil) ile 100(dahil) arasında random sayi isteseydik?





    }
}
