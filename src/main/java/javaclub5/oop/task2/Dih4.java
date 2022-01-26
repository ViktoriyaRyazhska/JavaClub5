package javaclub5.oop.task2;

public enum Dih4 {
    IDENTITY,
    ROTATE_90_ANTICLOCKWISE,
    ROTATE_180,
    ROTATE_90_CLOCKWISE,
    REFLECT_VERTICAL,
    REFLECT_FORWARD_DIAGONAL,
    REFLECT_HORIZONTAL,
    REFLECT_REVERSE_DIAGONAL;

    public static Dih4 then(Dih4 dih4) {
        return null;
    }

    public Dih4 inv() {
        switch (this) {
            case IDENTITY: {
                return IDENTITY;
            }
            case ROTATE_90_ANTICLOCKWISE: {
                return ROTATE_90_CLOCKWISE;
            }
            case ROTATE_180: {
                return ROTATE_180;
            }
            case ROTATE_90_CLOCKWISE: {
                return ROTATE_90_ANTICLOCKWISE;
            }
            case REFLECT_VERTICAL: {
                return REFLECT_VERTICAL;
            }
            case REFLECT_HORIZONTAL: {
                return REFLECT_HORIZONTAL;
            }
            case REFLECT_FORWARD_DIAGONAL: {
                return REFLECT_FORWARD_DIAGONAL;
            }
            case REFLECT_REVERSE_DIAGONAL: {
                return REFLECT_REVERSE_DIAGONAL;
            }
        }
        return this;
    }

    public boolean is_rotation() {
        switch (this) {
            case IDENTITY:
            case ROTATE_90_CLOCKWISE:
            case ROTATE_180:
            case ROTATE_90_ANTICLOCKWISE: {
                return true;
            }
            case REFLECT_VERTICAL:
            case REFLECT_REVERSE_DIAGONAL:
            case REFLECT_FORWARD_DIAGONAL:
            case REFLECT_HORIZONTAL: {
                return false;
            }
        }
        return false;
    }

    public boolean is_reflection() {
        switch (this) {
            case IDENTITY:
            case ROTATE_90_CLOCKWISE:
            case ROTATE_180:
            case ROTATE_90_ANTICLOCKWISE: {
                return false;
            }
            case REFLECT_VERTICAL:
            case REFLECT_REVERSE_DIAGONAL:
            case REFLECT_FORWARD_DIAGONAL:
            case REFLECT_HORIZONTAL: {
                return true;
            }
        }
        return false;
    }





    @Override
    public String toString() {
        return this.equals(IDENTITY) ? "identity transformation"
                : this.equals(ROTATE_90_ANTICLOCKWISE) ? "rotation 90 degrees anticlockwise"
                : this.equals(ROTATE_180) ? "rotation 180 degrees"
                : this.equals(ROTATE_90_CLOCKWISE) ? "rotation 90 degrees clockwise"
                : this.equals(REFLECT_VERTICAL) ? "reflection in vertical line"
                : this.equals(REFLECT_FORWARD_DIAGONAL) ? "reflection in forward-diagonal line"
                : this.equals(REFLECT_HORIZONTAL) ? "reflection in horizontal line"
                : this.equals(REFLECT_REVERSE_DIAGONAL) ? "reflection in reverse-diagonal line"
                : "unknown Dih4 value";
    }
}
