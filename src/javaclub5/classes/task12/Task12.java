package javaclub5.classes.task12;

import java.util.Objects;

public class Task12 {
        public static void start(){
            Encapsulation encapsulation = new Encapsulation();
            encapsulation.setNumber(3);
            System.out.println(encapsulation.getNumber());
        }
    public static class Encapsulation{
        private int number;
        private String stringValue;
        private Object anObject;

        public Encapsulation() {
        }

        public Encapsulation(int number, String stringValue, Object anObject) {
            this.number = number;
            this.stringValue = stringValue;
            this.anObject = anObject;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getStringValue() {
            return stringValue;
        }

        public void setStringValue(String stringValue) {
            this.stringValue = stringValue;
        }

        public Object getAnObject() {
            return anObject;
        }

        public void setAnObject(Object anObject) {
            this.anObject = anObject;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Encapsulation that = (Encapsulation) o;
            return number == that.number && stringValue.equals(that.stringValue) && anObject.equals(that.anObject);
        }

        @Override
        public int hashCode() {
            return Objects.hash(number, stringValue, anObject);
        }
    }
}
