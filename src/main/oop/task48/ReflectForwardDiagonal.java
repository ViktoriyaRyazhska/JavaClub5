package main.oop.task48;

import static main.oop.task48.Dih4.*;

public class ReflectForwardDiagonal {
    public static Dih4 reflectForwardDiagonal(Dih4 dih4) {
        switch (dih4) {
            case REFLECT_FORWARD_DIAGONAL -> {
                return IDENTITY;
            }
            case ROTATE_90_ANTICLOCKWISE -> {
                return REFLECT_VERTICAL;
            }
            case ROTATE_180 -> {
                return REFLECT_REVERSE_DIAGONAL;
            }
            case ROTATE_90_CLOCKWISE -> {
                return REFLECT_HORIZONTAL;
            }
            case REFLECT_VERTICAL -> {
                return ROTATE_90_ANTICLOCKWISE;
            }
            case IDENTITY -> {
                return REFLECT_FORWARD_DIAGONAL;
            }
            case REFLECT_HORIZONTAL -> {
                return ROTATE_90_CLOCKWISE;
            }
            case REFLECT_REVERSE_DIAGONAL -> {
                return ROTATE_180;
            }
        }
        return null;
    }
}
