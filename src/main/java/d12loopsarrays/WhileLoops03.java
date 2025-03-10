package d12loopsarrays;

public class WhileLoops03 {
    public static void main(String[] args) {
        //Ornek 1:  Belirli bir tamsayının palindrome olup olmadığını kontrol eden kodu yazın.
        //Example 1: Write the code to check if a given integer is a palindrome.
        //           Palindrome: 121 <==> 121        123321 <==> 123321


        int k = 312;
        String original = String.valueOf(k); //"312"
        String reversed = ""; //ters cevirilmis olani bunun icinde saklayacagiz

        int index = original.length() - 1; //son index her zaman length()-1'dir
        while (index >= 0) {
            reversed = reversed + original.charAt(index);
            index--;
        }
        System.out.println(reversed); //"213"

        if (original.equals(reversed)){
            System.out.println("palindromdur");
        }else {
            System.out.println("palindrom degildir"); //palindrom degildir
        }


    }
}
