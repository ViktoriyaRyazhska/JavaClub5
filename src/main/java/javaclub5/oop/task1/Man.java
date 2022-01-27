package javaclub5.oop.task1;

public class Man extends Human{

    private String name;

    public Man(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Man name is " + name;
    }
}
