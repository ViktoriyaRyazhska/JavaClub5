package javaclub5.OOP.task50;

public class Circle extends Figure{
    public Circle(float radius){
        super.radius = radius;
    }
    @Override
    public float getArea(){
        return 3.14f * radius *radius;
    }
}
