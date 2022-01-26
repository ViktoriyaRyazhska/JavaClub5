package javaclub5.oop.task2;

import static javaclub5.oop.task2.Dih4.*;

public class Dih4Identity {
    public static Dih4 identityMove(Dih4 dih4) {
        switch (dih4) {
            case REFLECT_FORWARD_DIAGONAL: {
                return REFLECT_FORWARD_DIAGONAL;
            }
            case ROTATE_90_ANTICLOCKWISE: {
                return ROTATE_90_ANTICLOCKWISE;
            }
            case ROTATE_180: {
                return ROTATE_180;
            }
            case ROTATE_90_CLOCKWISE: {
                return ROTATE_90_CLOCKWISE;
            }
            case REFLECT_VERTICAL: {
                return REFLECT_VERTICAL;
            }
            case IDENTITY: {
                return IDENTITY;
            }
            case REFLECT_HORIZONTAL: {
                return REFLECT_HORIZONTAL;
            }
            case REFLECT_REVERSE_DIAGONAL: {
                return REFLECT_REVERSE_DIAGONAL;
            }
        }
        return null;
    }
}
