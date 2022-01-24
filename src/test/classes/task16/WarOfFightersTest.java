package test.classes.task16;


import main.classes.task16.Fighter;
import main.classes.task16.WarOfFighters;
import org.junit.Assert;
import org.junit.Test;

public class WarOfFightersTest {

    @Test
    public void TestFirstFight() {
        Assert.assertEquals("Lew", WarOfFighters.declareWinner(new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Lew"));
    }
    @Test
    public void TestSecondFight() {
        Assert.assertEquals("Harry", WarOfFighters.declareWinner(new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Harry"));
  }
    @Test
    public void TestThirdFights() {
        Assert.assertEquals("Harald", WarOfFighters.declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harald"));
   }
    @Test
    public void TestFourthFights() {
        Assert.assertEquals("Harald", WarOfFighters.declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harry"));
      }
    @Test
    public void TestFifthFights() {
        Assert.assertEquals("Harald", WarOfFighters.declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Jerry"));
    }
    @Test
    public void TestSixthFights() {
        Assert.assertEquals("Harald", WarOfFighters.declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Harald"));
    }
}