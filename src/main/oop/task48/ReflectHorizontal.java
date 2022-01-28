package main.oop.task48;

import static main.oop.task48.Dih4.*;

public class ReflectHorizontal {
    public static Dih4 reflectHorizontal(Dih4 dih4) {
        switch (dih4) {
            case IDENTITY -> {
                return REFLECT_HORIZONTAL;
            }
            case REFLECT_FORWARD_DIAGONAL -> {
                return ROTATE_90_ANTICLOCKWISE;
            }
            case ROTATE_90_ANTICLOCKWISE -> {
                return REFLECT_FORWARD_DIAGONAL;
            }
            case ROTATE_180 -> {
                return REFLECT_VERTICAL;
            }
            case ROTATE_90_CLOCKWISE -> {
                return REFLECT_REVERSE_DIAGONAL;
            }
            case REFLECT_VERTICAL -> {
                return ROTATE_180;
            }
            case REFLECT_HORIZONTAL -> {
                return IDENTITY;
            }
            case REFLECT_REVERSE_DIAGONAL -> {
                return ROTATE_90_CLOCKWISE;
            }
        }
        return null;
    }
}