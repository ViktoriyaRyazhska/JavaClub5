package javaclub5.classes.task1;

public class Runner {
    public static void main(String[] args) {
        EncapsulatedDemo encapsulatedDemo = new EncapsulatedDemo(10, "Lviv", null);
        EncapsulatedDemo encapsulatedDemo1 = new EncapsulatedDemo();
        System.out.println("EncapsulatedDemo as a string: " + new EncapsulatedDemo(5, "dollars", null));
        System.out.println(encapsulatedDemo);
        System.out.println(encapsulatedDemo1);
    }

}
