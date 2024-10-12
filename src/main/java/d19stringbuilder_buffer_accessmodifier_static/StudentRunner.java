package d19stringbuilder_buffer_accessmodifier_static;

public class StudentRunner {
    public static void main(String[] args) {

        //Student Class'tan bir instance olusturalim
        Student ali = new Student();
        System.out.println(ali.stdName); //Ali Can
        System.out.println(ali.email); //alican@gmail.com
        System.out.println(ali.adress); //Istanbul
        //tcKimlik'e baska class'tan ulasilamaz cünkü private.

        System.out.println(ali);





    }
}
