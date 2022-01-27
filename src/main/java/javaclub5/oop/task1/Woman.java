package javaclub5.oop.task1;

public class Woman extends Human{

    private String name;

    public Woman(String name) {
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
        return "Woman name is " + name + ".";
    }
}
