package javaclub5.oop.task2;

import static javaclub5.oop.task2.Dih4.*;

public class Dih4Rotate90 {
    public static Dih4 rotate90Move(Dih4 dih4) {
        switch (dih4) {
            case REFLECT_FORWARD_DIAGONAL: {
                return REFLECT_VERTICAL;
            }
            case ROTATE_90_ANTICLOCKWISE: {
                return IDENTITY;
            }
            case ROTATE_180: {
                return ROTATE_90_ANTICLOCKWISE;
            }
            case ROTATE_90_CLOCKWISE: {
                return ROTATE_180;
            }
            case REFLECT_VERTICAL: {
                return REFLECT_REVERSE_DIAGONAL;
            }
            case IDENTITY: {
                return ROTATE_90_CLOCKWISE;
            }
            case REFLECT_HORIZONTAL: {
                return REFLECT_FORWARD_DIAGONAL;
            }
            case REFLECT_REVERSE_DIAGONAL: {
                return REFLECT_HORIZONTAL;
            }
        }
        return null;
    }
}
