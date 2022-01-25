package solutions.basicProgram;
import program.helper.Helper;
import solutions.Executable;

import java.util.Scanner;

public class VolumeOfCuboid implements Executable {

        double length;
        double width;
        double height;

        double getVolumeOfCuboid(double length, double width, double height) {
            if(length<0||width<0||height<0){
                throw new IllegalArgumentException("Enter variables higher than 0!");
            }
            return length * width * height;
        }

        void readData() {

                System.out.println("Enter length , width and height:");
                length = Helper.getDouble(1000.0);
                width = Helper.getDouble(1000.0);
                height = Helper.getDouble(1000.0);


        }

    @Override
    public void execute() {
        readData();
        System.out.println(getVolumeOfCuboid(length,width,height));
    }
}
