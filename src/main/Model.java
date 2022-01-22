package main;

public class Model {
    private int value;

    Database database = new Database();

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void selectorMenu(int value){
        database.getPosition().get(value).execute();
    }
}
