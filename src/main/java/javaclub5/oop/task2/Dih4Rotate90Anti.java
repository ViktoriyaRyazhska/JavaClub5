package javaclub5.oop.task2;

import static javaclub5.oop.task2.Dih4.*;

public class Dih4Rotate90Anti {
    public static Dih4 rotate90AntiMove(Dih4 dih4) {
        switch (dih4) {
            case REFLECT_FORWARD_DIAGONAL: {
                return REFLECT_HORIZONTAL;
            }
            case ROTATE_90_ANTICLOCKWISE: {
                return ROTATE_180;
            }
            case ROTATE_180: {
                return ROTATE_90_CLOCKWISE;
            }
            case ROTATE_90_CLOCKWISE: {
                return IDENTITY;
            }
            case REFLECT_VERTICAL: {
                return REFLECT_FORWARD_DIAGONAL;
            }
            case IDENTITY: {
                return ROTATE_90_ANTICLOCKWISE;
            }
            case REFLECT_HORIZONTAL: {
                return REFLECT_REVERSE_DIAGONAL;
            }
            case REFLECT_REVERSE_DIAGONAL: {
                return REFLECT_VERTICAL;
            }
        }
        return null;
    }
}
