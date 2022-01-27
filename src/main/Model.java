package main;

public class Model {
    private int value;
    private String proceed;
    Database database;

    public Model(Database database) {
        this.database = database;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getProceed() {
        return proceed;
    }

    public void setProceed(String proceed) {
        this.proceed = proceed;
    }

    public void selectorMenu(int value) {
        database.getPosition().get(value).execute();
    }
}
