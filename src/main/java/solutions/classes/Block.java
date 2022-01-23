package solutions.classes;

import program.helper.Helper;
import solutions.Executable;

public class Block implements Executable {
    private int width;
    private int length;
    private int height;

    public Block(int[] array) {
        this.width = array[0];
        this.length = array[1];
        this.height = array[2];
    }

    public Block() {}

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getVolume(){
        return width*length*height;
    }

    public int getSurfaceArea(){
        return width*length*2+width*height*2+length*height*2;
    }

    @Override
    public void execute() {
        System.out.println("Enter width, length and height of the Block. Maximum value is 1290 " +
                "Program will return surface area and volume");
        System.out.println("Enter width: ");
        width =  Helper.getInt(1290);
        System.out.println("Enter length: ");
        length = Helper.getInt(1290);
        System.out.println("Enter height: ");
        height = Helper.getInt(1290);
        System.out.println("The surface area is: " + getSurfaceArea());
        System.out.println("The volume is: " + getVolume());
        Helper.promptEnterKey();
    }
}
