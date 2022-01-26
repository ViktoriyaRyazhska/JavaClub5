package javaclub5.oop.task2;

import static javaclub5.oop.task2.Dih4.*;

public class Dih4Rotate180 {
    public static Dih4 rotate180Move(Dih4 dih4) {
        switch (dih4) {
            case REFLECT_FORWARD_DIAGONAL: {
                return REFLECT_REVERSE_DIAGONAL;
            }
            case ROTATE_90_ANTICLOCKWISE: {
                return ROTATE_90_CLOCKWISE;
            }
            case ROTATE_180: {
                return IDENTITY;
            }
            case ROTATE_90_CLOCKWISE: {
                return ROTATE_90_ANTICLOCKWISE;
            }
            case REFLECT_VERTICAL: {
                return REFLECT_HORIZONTAL;
            }
            case IDENTITY: {
                return ROTATE_180;
            }
            case REFLECT_HORIZONTAL: {
                return REFLECT_VERTICAL;
            }
            case REFLECT_REVERSE_DIAGONAL: {
                return REFLECT_FORWARD_DIAGONAL;
            }
        }
        return null;
    }
}
