package javaclub5.collections.task70;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sergiy Zapadenko on 25.01.2022 9:05
 */
public class Kata {
    public static List CreateList(int number) {
        List list = new ArrayList();

        for (int count = 1; count <= number; count++) {
            list.add(count);
        }

        return list;
    }
}
