package d20staticblock_instanceblock_oop;

public class InstanceBlock3Runner {
    public static void main(String[] args) {

        InstanceBlock3 car = new InstanceBlock3(); //Araba rengi: Siyah
                                                   // Araba yakit türü: Benzin

        InstanceBlock3 car2 = new InstanceBlock3(); //Araba rengi: Siyah
                                                    //Araba yakit türü: Benzin

        //Bir veya daha cok objeckt (instance) daha üretsem,  o da siyah ve benzin olur

        //Ancak constructor'larla özellestirilebilir

        InstanceBlock3 car3 = new InstanceBlock3("Kirmizi","Dizel");
        System.out.println("Araba rengi: " + car3.color); //Araba rengi: Kirmizi
        System.out.println("Araba yakit türü: " + car3.fuelType); //Araba yakit türü: Dizel

        InstanceBlock3 car4 = new InstanceBlock3(); //Araba rengi: Siyah
                                                    //Araba yakit türü: Benzin






    }
}
