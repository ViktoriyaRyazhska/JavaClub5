package test.string.task66;

import main.string.task51.NumberToString;
import main.string.task66.CharacterRecognition;
import org.junit.Assert;
import org.junit.Test;

public class CharacterRecognitionTest {
    @Test
    public void Test() {
        Assert.assertEquals("IF-RUDYARD KIPLING", CharacterRecognition.correct(CharacterRecognition.correct("1F-RUDYARD K1PL1NG")));
        Assert.assertEquals("STEPHEN HAWKING - THE UNIVERSE IN A NUTSHELL", CharacterRecognition.correct(CharacterRecognition.correct("5TEPHEN HAWK1NG - THE UN1VER5E 1N A NUT5HELL")));
        Assert.assertEquals("J. K. ROWLING - HARRY POTTER AND THE DEATHLY HALLOWS", CharacterRecognition.correct(CharacterRecognition.correct("J. K. R0WL1NG - HARRY P0TTER AND THE DEATHLY HALL0W5")));

    }
}