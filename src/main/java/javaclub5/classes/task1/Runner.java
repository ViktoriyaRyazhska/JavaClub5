package javaclub5.classes.task1;

import java.io.BufferedReader;

/**
 * Make class with Lombok library
 *
 * @author Popova Anna
 * <p>
 * checking is everything working
 */
public class Runner {

    public static void start() {
        System.out.println("Making class with Lombok library");
        System.out.println("@Getter\n" +
                "@Setter\n" +
                "@NoArgsConstructor\n" +
                "@AllArgsConstructor\n" +
                "@ToString(exclude = {\"anObject\"})\n" +
                "@EqualsAndHashCode\n" +
                "\n" +
                "@Data\n" +
                "public class EncapsulatedDemo {\n" +
                "    private int number;\n" +
                "    private String stringValue;\n" +
                "    private Object anObject;\n" +
                "}");

        EncapsulatedDemo encapsulatedDemo = new EncapsulatedDemo(10, "Lviv", null);
        EncapsulatedDemo encapsulatedDemo1 = new EncapsulatedDemo();
        System.out.println(encapsulatedDemo);
        System.out.println(encapsulatedDemo1);
    }


}
