package main.java.com.softserve.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void reverseWords1() {
        String expected = "Andriy";
        String words = Task2.reverseWords("yirdnA");
        assertEquals(expected, words);
    }

    @Test
    void reverseWords2() {
        String expected = "Igor";
        String words = Task2.reverseWords("rogI");
        assertEquals(expected, words);
    }

    @Test
    void reverseWords3() {
        String expected = "avaj gninrael ekil I";
        String words = Task2.reverseWords("I like learning java");
        assertEquals(expected, words);
    }


}