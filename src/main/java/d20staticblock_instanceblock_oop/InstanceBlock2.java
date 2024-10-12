package d20staticblock_instanceblock_oop;

public class InstanceBlock2 {

    public int year; //instance variable ürettim

    //instance block
    {
        System.out.println("Herkese selam");
    }

    public InstanceBlock2() {  // parametresiz constructor ürettim
        //buradaki sout'u silip instance block icine aldik
    }


    public InstanceBlock2(int year) { //parametreli contructor ürettim
        //buradaki sout'u silip instance block icine aldik
        this.year = year;
    }



}
