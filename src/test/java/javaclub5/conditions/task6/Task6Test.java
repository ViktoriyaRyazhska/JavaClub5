package javaclub5.conditions.task6;

import org.junit.Assert;
import org.junit.Test;

public class Task6Test {

    @Test
    public void test1(){
        System.out.println("Fixed Test Player 1 won");
        Assert.assertEquals("Player 1 won!", Runner.rps("scissors", "paper"));
    }
    @Test
    public void test2(){
        System.out.println("Fixed Test Player 2 won!");
        Assert.assertEquals("Player 2 won!",Runner.rps("scissors","rock"));
    }

    @Test
    public void test3(){
        System.out.println("Fixed Test Draw!");
        Assert.assertEquals("Draw!",Runner.rps("paper","paper"));
    }
}
