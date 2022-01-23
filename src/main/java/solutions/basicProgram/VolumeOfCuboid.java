package solutions.basicProgram;
import program.helper.Helper;
import solutions.Executable;

import java.util.Scanner;

public class VolumeOfCuboid implements Executable {

        double length;
        double width;
        double height;

        double getVolumeOfCuboid(double length, double width, double height) {
            return length * width * height;
        }

        void readData() {
            while (true) {
                System.out.println("Enter length , width and height:");
                length = Helper.getDouble(1000.0);
                width = Helper.getDouble(1000.0);
                height = Helper.getDouble(1000.0);
                if(length<0||width<0||height<0){
                    System.out.println("Enter variables higher than 0!");
                }
                else break;
            }
        }

    @Override
    public void execute() {
        readData();
        System.out.println(getVolumeOfCuboid(length,width,height));
    }
}
