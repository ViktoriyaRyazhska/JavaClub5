package javaclub5.oop.task2;

import static javaclub5.oop.task2.Dih4.*;

public class Dih4ReflectVertical {
    public static Dih4 reflectVerticalMove(Dih4 dih4) {
        switch (dih4) {
            case REFLECT_FORWARD_DIAGONAL: {
                return ROTATE_90_CLOCKWISE;
            }
            case ROTATE_90_ANTICLOCKWISE: {
                return REFLECT_REVERSE_DIAGONAL;
            }
            case ROTATE_180: {
                return REFLECT_HORIZONTAL;
            }
            case ROTATE_90_CLOCKWISE: {
                return REFLECT_FORWARD_DIAGONAL;
            }
            case REFLECT_VERTICAL: {
                return IDENTITY;
            }
            case IDENTITY: {
                return REFLECT_VERTICAL;
            }
            case REFLECT_HORIZONTAL: {
                return ROTATE_180;
            }
            case REFLECT_REVERSE_DIAGONAL: {
                return ROTATE_90_ANTICLOCKWISE;
            }
        }
        return null;
    }
}
