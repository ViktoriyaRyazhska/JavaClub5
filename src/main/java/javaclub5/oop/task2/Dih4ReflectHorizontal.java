package javaclub5.oop.task2;

import static javaclub5.oop.task2.Dih4.*;

public class Dih4ReflectHorizontal {
    public static Dih4 reflectHorizontalMove(Dih4 dih4) {
        switch (dih4) {
            case REFLECT_FORWARD_DIAGONAL: {
                return ROTATE_90_ANTICLOCKWISE;
            }
            case ROTATE_90_ANTICLOCKWISE: {
                return REFLECT_FORWARD_DIAGONAL;
            }
            case ROTATE_180: {
                return REFLECT_VERTICAL;
            }
            case ROTATE_90_CLOCKWISE: {
                return REFLECT_REVERSE_DIAGONAL;
            }
            case REFLECT_VERTICAL: {
                return ROTATE_180;
            }
            case IDENTITY: {
                return REFLECT_HORIZONTAL;
            }
            case REFLECT_HORIZONTAL: {
                return IDENTITY;
            }
            case REFLECT_REVERSE_DIAGONAL: {
                return ROTATE_90_CLOCKWISE;
            }
        }
        return null;
    }
}
