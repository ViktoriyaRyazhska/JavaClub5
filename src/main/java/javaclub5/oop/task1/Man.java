package javaclub5.oop.task1;

public class Man extends Human{

    private String name;

    public Man(String name) {
        super();
        this.name = name;
    }

    @Override
    public String toString() {
        return "Man name is " + name;
    }


}
