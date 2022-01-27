package main.oop.task48;

import static main.oop.task48.Dih4.*;

public class ReflectVertical {
    public static Dih4 reflectVertical(Dih4 dih4) {
        switch (dih4) {
            case IDENTITY -> {
                return REFLECT_VERTICAL;
            }
            case REFLECT_FORWARD_DIAGONAL -> {
                return ROTATE_90_CLOCKWISE;
            }
            case ROTATE_90_ANTICLOCKWISE -> {
                return REFLECT_REVERSE_DIAGONAL;
            }
            case ROTATE_180 -> {
                return REFLECT_HORIZONTAL;
            }
            case ROTATE_90_CLOCKWISE -> {
                return REFLECT_FORWARD_DIAGONAL;
            }
            case REFLECT_VERTICAL -> {
                return IDENTITY;
            }
            case REFLECT_HORIZONTAL -> {
                return ROTATE_180;
            }
            case REFLECT_REVERSE_DIAGONAL -> {
                return ROTATE_90_ANTICLOCKWISE;
            }
        }
        return null;
    }
}
