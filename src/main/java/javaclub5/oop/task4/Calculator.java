package javaclub5.oop.task4;

/**
 * Class that calculate the area of figure
 *
 * @author Rostyslav Ros
 */
public class Calculator {

    /**
     * method for calculation area of all figures
     * @param figure - object of specific figure
     */
    public static double getTotalArea(Figure ...  figure) {
        double totalArea = 0;
        for (int i = 0; i < figure.length; i++) {
            totalArea += figure[i].calculateArea();
        }
        return totalArea;
    }

}
