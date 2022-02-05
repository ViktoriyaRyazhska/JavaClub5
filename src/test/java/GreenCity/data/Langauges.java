package GreenCity.data;

public enum Langauges {
    UKRAINIAN("Укр"),
    RUSSIAN ("Рус"),
    ENGLISH("Eng");

    private String name;

    private Langauges(String name){
        this.name=name;
    }

    @Override
    public String toString(){
        return name;
    }
}
