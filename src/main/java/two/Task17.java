package two;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task17 {

        private int width;

        private int length;

        private int height;

        public int getWidth() {
            return width;
        }

        public int getLength() {
            return length;
        }

        public int getHeight() {
            return height;
        }

        public Task17(int [] array) {
            this.width = array[0];
            this.length = array[1];
            this.height = array[2];
        }

        public int getVolume() {
            return width * length * height;
        }

        public int getSurfaceArea() {
            return 2 * (width * length + width * height + length * height);
        }

        public static void task17(BufferedReader reader){
            System.out.println("Volume and SurfaceArea of block");

            try {
                System.out.println("Enter width:");
                int w = Integer.parseInt(reader.readLine());
                System.out.println("Enter length:");
                int l = Integer.parseInt(reader.readLine());
                System.out.println("Enter height:");
                int h = Integer.parseInt(reader.readLine());

                int [] array2 = new int [] {w, l, h};
                two.Task17 b = new two.Task17(array2);

                b.getWidth();
                b.getLength();
                b.getHeight();

                 if(w>=0 && l>=0 && h>=0){
                System.out.println("Blok's Volume " + b.getVolume());
                System.out.println("Blok's SurfaceArea" + b.getSurfaceArea());}
                else{  System.out.println("Invalid values, it can not have negative values");
                }

            } catch (Exception e) {
                System.out.println("Invalid parameter!");
            }
        }
    }

