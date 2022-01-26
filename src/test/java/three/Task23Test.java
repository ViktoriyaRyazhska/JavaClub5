package three;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task23Test {

    @Test
    public void test1() {
        System.out.println("Fixed Tests Player 1 won!");
        assertEquals("Player 1 won!", Task23.rps("rock", "scissors"));
        assertEquals("Player 1 won!", Task23.rps("scissors", "paper"));
        assertEquals("Player 1 won!", Task23.rps("paper", "rock"));
    }
    @Test
    public void test2() {
        System.out.println("Fixed Tests Player 2 won!");
        assertEquals("Player 2 won!", Task23.rps("scissors", "rock"));
        assertEquals("Player 2 won!", Task23.rps("paper", "scissors"));
        assertEquals("Player 2 won!", Task23.rps("rock", "paper"));
    }
    @Test
    public void test3() {
        System.out.println("Fixed Tests Draw!");
        assertEquals("Draw!", Task23.rps("scissors", "scissors"));
        assertEquals("Draw!", Task23.rps("paper", "paper"));
        assertEquals("Draw!", Task23.rps("rock", "rock"));
    }
}