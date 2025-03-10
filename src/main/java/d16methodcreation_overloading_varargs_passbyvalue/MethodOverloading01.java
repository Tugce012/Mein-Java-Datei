package d16methodcreation_overloading_varargs_passbyvalue;

public class MethodOverloading01 {
    public static void main(String[] args) {

        /*
    Polymorphism:
    Method Overloading (static polymorphism) + Method Overriding(dynamic polymorphism)

    OOP'nin (Object Oriented Programming-Nesne yönelimli programlama) prensiplerinin biridir.
    Polymorphism (cok bicimlilik) demektir.
    Bir method'u, istedigimiz sonuclari alacak sekilde, farkli farkli sekilllerde calistirabilmek icin kullanilir.
    */

        /* i.Method Overloading : Java'da Method Overloading (Metot Aşırı Yükleme), aynı class içerisinde
    aynı isme sahip ancak farklı parametre listelerine sahip birden fazla metodun tanımlanması işlemidir.*/


        add(3,5);
        //---------------
        String s  ="Java";
        // s.substring(int beginIndex); ==>tek parametre almis
        // s.substring(int beginIndex, int endIndex); ==>iki parametre almis
        // s.substring() => bu methodu bir String objesi üzerinden cagiririz. Böyle methodlara non-static denir

        // Math.min() ==> bu methodu direk class adiyla cagirdik. Böyle metotlara static denir




    }//main disi

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void add(double a, double b) {
        System.out.println(a + b);
    }

    public static void add(double a, int b) {
        System.out.println(a + b);
    }

    public static void add(int a, double b) {
        System.out.println(a + b);
    }

    public static void add(int a, int b, int c) {
        System.out.println(a + b);
    }

    //-------------
    // String s  ="Java";
    // s.substring(int beginIndex); ==>tek parametre almis
    // s.substring(int beginIndex, int endIndex); ==>iki parametre almis

    //Method ismi + Parametre = Method Signature (metot imzasi) benzersiz olmalidir
    //---------------

    /* Method Overloading'de sadece parametreler degistirilir.
       Boylelikle method signature degismis olur ve Java bu methodu yeni bir method gibi kabul eder.

    Method Overloading icin;
    a) Parametre sayisini degistirebilirsiniz.
    b) Parametre data tiplerini degistirebilirsiniz.
    c) Parametre data tipleri farkli ise parametrelerin yerlerini degistirebilirsiniz.
    d)Method overloading olustururken return type'in, access modifier'in,
       static veya non-static olmasinin hicbir etkisi yoktur.
       */
//------------------
    /*
    Soru 1: private method'lar overload edilebilir mi?

    Cevap 1: private method'lar overload edilebilirler cunku;
    overload islemi tek class icinde yapilir, private methodlar ayni class'in icinden
    ulasilabilir oldugundan overload'a engel degildir.

    Soru 2: static method'lar overload edilebilir mi?
    Cevap 2: static method'lar overload edilebilir cunku esasinda overload'da biz yeni method'lar olustururuz.
    */
//------------------





}