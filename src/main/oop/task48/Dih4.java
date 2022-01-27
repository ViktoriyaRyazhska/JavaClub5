package main.oop.task48;

import static main.oop.task48.Identity.identity;
import static main.oop.task48.ReflectForwardDiagonal.reflectForwardDiagonal;
import static main.oop.task48.ReflectHorizontal.reflectHorizontal;
import static main.oop.task48.ReflectReverseDiagonal.reflectReverseDiagonal;
import static main.oop.task48.ReflectVertical.reflectVertical;
import static main.oop.task48.Rotate180.rotate180;
import static main.oop.task48.Rotate90.rotate90;
import static main.oop.task48.Rotate90Anticlockwise.rotate90Anticlockwise;

public enum Dih4 {
    IDENTITY,
    ROTATE_90_ANTICLOCKWISE,
    ROTATE_180,
    ROTATE_90_CLOCKWISE,
    REFLECT_VERTICAL,
    REFLECT_FORWARD_DIAGONAL,
    REFLECT_HORIZONTAL,
    REFLECT_REVERSE_DIAGONAL;

    public Dih4 then(Dih4 dih4) {
        switch (this) {
            case IDENTITY -> {
                return identity(dih4);
            }
            case ROTATE_90_ANTICLOCKWISE -> {
                return rotate90Anticlockwise(dih4);
            }
            case ROTATE_180 -> {
                return rotate180(dih4);
            }
            case ROTATE_90_CLOCKWISE -> {
                return rotate90(dih4);
            }
            case REFLECT_VERTICAL -> {
                return reflectVertical(dih4);
            }
            case REFLECT_FORWARD_DIAGONAL -> {
                return reflectForwardDiagonal(dih4);
            }
            case REFLECT_HORIZONTAL -> {
                return reflectHorizontal(dih4);
            }
            case REFLECT_REVERSE_DIAGONAL -> {
                return reflectReverseDiagonal(dih4);
            }
        }
        return null;
    }


    public Dih4 inv() {
        switch (this) {
            case IDENTITY -> {
                return IDENTITY;
            }
            case ROTATE_90_ANTICLOCKWISE -> {
                return ROTATE_90_CLOCKWISE;
            }
            case ROTATE_180 -> {
                return ROTATE_180;
            }
            case ROTATE_90_CLOCKWISE -> {
                return ROTATE_90_ANTICLOCKWISE;
            }
            case REFLECT_VERTICAL -> {
                return REFLECT_VERTICAL;
            }
            case REFLECT_HORIZONTAL -> {
                return REFLECT_HORIZONTAL;
            }
            case REFLECT_FORWARD_DIAGONAL -> {
                return REFLECT_FORWARD_DIAGONAL;
            }
            case REFLECT_REVERSE_DIAGONAL -> {
                return REFLECT_REVERSE_DIAGONAL;
            }
        }
        return this;
    }

    public boolean is_rotation() {
        switch (this) {
            case IDENTITY, ROTATE_90_CLOCKWISE, ROTATE_180, ROTATE_90_ANTICLOCKWISE -> {
                return true;
            }
            case REFLECT_VERTICAL, REFLECT_REVERSE_DIAGONAL, REFLECT_FORWARD_DIAGONAL, REFLECT_HORIZONTAL -> {
                return false;
            }
        }
        return false;
    }

    public boolean is_reflection() {
        switch (this) {
            case IDENTITY, ROTATE_90_CLOCKWISE, ROTATE_180, ROTATE_90_ANTICLOCKWISE -> {
                return false;
            }
            case REFLECT_VERTICAL, REFLECT_REVERSE_DIAGONAL, REFLECT_FORWARD_DIAGONAL, REFLECT_HORIZONTAL -> {
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