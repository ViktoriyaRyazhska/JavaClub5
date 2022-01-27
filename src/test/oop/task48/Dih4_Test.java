package test.oop.task48;

import main.oop.task48.Dih4;
import org.junit.Test;

import java.util.Objects;

import static main.oop.task48.Dih4.*;
import static org.junit.Assert.*;

public class Dih4_Test
{
    @Test
    public void Example_Tests()
    {
        assertTrue(ROTATE_180.is_rotation());
        assertTrue(REFLECT_VERTICAL.is_reflection());

        assert_Dih4_equal( ROTATE_90_ANTICLOCKWISE, ROTATE_90_CLOCKWISE.inv() );
        assert_Dih4_equal( REFLECT_REVERSE_DIAGONAL, ROTATE_90_CLOCKWISE.then(REFLECT_VERTICAL) );

        Dih4 r = ROTATE_90_ANTICLOCKWISE;
        Dih4 f = REFLECT_HORIZONTAL;
        assert_Dih4_equal( r.inv(), Objects.requireNonNull(r.then(r)).then(r) );
        assert_Dih4_equal( f.then(r), r.inv().then(f) );

        assertEquals(ROTATE_90_CLOCKWISE, ROTATE_90_CLOCKWISE);
        assertFalse(false);
    }


    public static void assert_Dih4_equal(Dih4 expected, Dih4 actual)
    {
        assertEquals(Dih4_to_String(expected), Dih4_to_String(actual));
    }

    public static String Dih4_to_String(Dih4 r)
    {
        return r.equals(IDENTITY)                 ? "identity transformation"
                : r.equals(ROTATE_90_ANTICLOCKWISE)  ? "rotation 90 degrees anticlockwise"
                : r.equals(ROTATE_180)               ? "rotation 180 degrees"
                : r.equals(ROTATE_90_CLOCKWISE)      ? "rotation 90 degrees clockwise"
                : r.equals(REFLECT_VERTICAL)         ? "reflection in vertical line"
                : r.equals(REFLECT_FORWARD_DIAGONAL) ? "reflection in forward-diagonal line"
                : r.equals(REFLECT_HORIZONTAL)       ? "reflection in horizontal line"
                : r.equals(REFLECT_REVERSE_DIAGONAL) ? "reflection in reverse-diagonal line"
                :                                      "unknown Dih4 value";
    }
}

