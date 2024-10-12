package d21oop;

public class Dog extends Mammal {
    public void bark(){

        System.out.println("Dogs bark ...");
    }

    //Herkes Cat class'ta feedWithMilk() methodunu override etsin?
    @Override //Anotation
    public void eat (){

        System.out.println("Dogs eat...");
    }

    @Override
    public Animal create(){
        return new Dog(); //Upcasting //child parent'inin data tipini kullanabilir. Java upcasting'i otomatik olarak yapar.
                            //tam tersine downcasting denir- java otomatik yapmaz
    }

    @Override
    public int add(int a, int b){
        //primitive'ler arasinda paarent child iliskisi yoktur.
        //yani primitivelerde return type degistirilemez.
        return a + b;
    }


}
