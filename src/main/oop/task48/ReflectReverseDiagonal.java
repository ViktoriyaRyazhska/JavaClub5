package main.oop.task48;

import static main.oop.task48.Dih4.*;

public class ReflectReverseDiagonal {
    public static Dih4 reflectReverseDiagonal(Dih4 dih4) {
        switch (dih4) {
            case IDENTITY -> {
                return REFLECT_REVERSE_DIAGONAL;
            }
            case REFLECT_FORWARD_DIAGONAL -> {
                return ROTATE_180;
            }
            case ROTATE_90_ANTICLOCKWISE -> {
                return REFLECT_HORIZONTAL;
            }
            case ROTATE_180 -> {
                return REFLECT_FORWARD_DIAGONAL;
            }
            case ROTATE_90_CLOCKWISE -> {
                return REFLECT_VERTICAL;
            }
            case REFLECT_VERTICAL -> {
                return ROTATE_90_CLOCKWISE;
            }
            case REFLECT_HORIZONTAL -> {
                return ROTATE_90_ANTICLOCKWISE;
            }
            case REFLECT_REVERSE_DIAGONAL -> {
                return IDENTITY;
            }
        }
        return null;
    }
}
