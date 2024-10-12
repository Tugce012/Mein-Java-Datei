package d22oop;

public class StudentRunner {
    public static void main(String[] args) {

        Student s = new Student();
        System.out.println(s.name); //Ali Can

        System.out.println(s.getAge()); //13
        System.out.println(s.isSuccessful()); //true

        s.setAge(25);
        System.out.println(s.getAge());//25

        s.setSuccessful(false);
        System.out.println(s.isSuccessful()); //false
    }

    //ODEV: encapsulation da private ile gizlenen bir veri baska package’dan set method ile degistirilebilir mi?
   /* Evet, eğer bir sınıfta tanımlı private bir alan (field) varsa, bu alana doğrudan erişim mümkün değildir. Ancak, sınıf içerisinde tanımlanmış bir public setter metodu varsa, bu setter metodu başka bir paketten bile çağrılarak o private alanın değeri değiştirilebilir.
            Yani, encapsulation prensipleri gereği alanlar private olsa bile, eğer bir public set metodu varsa, başka bir paketten bu metoda erişip private alanın değeri değiştirilebilir.
            */

}



