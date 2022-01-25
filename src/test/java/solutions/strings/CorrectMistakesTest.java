package solutions.strings;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CorrectMistakesTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void correct(String expected , String str) {
      assertEquals(expected,CorrectMistakes.correct(str));
    }
    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("IF-RUDYARD KIPLING", "1F-RUDYARD K1PL1NG"),
        Arguments.of("ROBERT MERLE - THE DAY OF THE DOLPHIN","R0BERT MERLE - THE DAY 0F THE D0LPH1N"),
        Arguments.of("RICHARD P. FEYNMAN - THE FEYNMAN LECTURES ON PHYSICS", "R1CHARD P. FEYNMAN - THE FEYNMAN LECTURE5 0N PHY51C5"),
        Arguments.of("RICHARD P. FEYNMAN - STATISTICAL MECHANICS", "R1CHARD P. FEYNMAN - 5TAT15T1CAL MECHAN1C5"),
        Arguments.of("STEPHEN HAWKING - A BRIEF HISTORY OF TIME", "5TEPHEN HAWK1NG - A BR1EF H15T0RY 0F T1ME"),
        Arguments.of("STEPHEN HAWKING - THE UNIVERSE IN A NUTSHELL", "5TEPHEN HAWK1NG - THE UN1VER5E 1N A NUT5HELL"),
        Arguments.of("ERNEST HEMINGWAY - A FARWELL TO ARMS", "ERNE5T HEM1NGWAY - A FARWELL T0 ARM5"),
        Arguments.of("ERNEST HEMINGWAY - FOR WHOM THE BELL TOLLS", "ERNE5T HEM1NGWAY - F0R WH0M THE BELL T0LL5"),
        Arguments.of("ERNEST HEMINGWAY - THE OLD MAN AND THE SEA", "ERNE5T HEM1NGWAY - THE 0LD MAN AND THE 5EA"),
        Arguments.of("J. R. R. TOLKIEN - THE LORD OF THE RINGS", "J. R. R. T0LK1EN - THE L0RD 0F THE R1NG5"),
        Arguments.of("J. D. SALINGER - THE CATCHER IN THE RYE", "J. D. 5AL1NGER - THE CATCHER 1N THE RYE"),
        Arguments.of("J. K. ROWLING - HARRY POTTER AND THE PHILOSOPHER'S STONE", "J. K. R0WL1NG - HARRY P0TTER AND THE PH1L050PHER'5 5T0NE"),
        Arguments.of("J. K. ROWLING - HARRY POTTER AND THE CHAMBER OF SECRETS", "J. K. R0WL1NG - HARRY P0TTER AND THE CHAMBER 0F 5ECRET5"),
        Arguments.of("J. K. ROWLING - HARRY POTTER AND THE PRISONER OF Azkaban","J. K. R0WL1NG - HARRY P0TTER AND THE PR150NER 0F Azkaban"),
        Arguments.of("J. K. ROWLING - HARRY POTTER AND THE GOBLET OF FIRE", "J. K. R0WL1NG - HARRY P0TTER AND THE G0BLET 0F F1RE"),
        Arguments.of("J. K. ROWLING - HARRY POTTER AND THE ORDER OF PHOENIX", "J. K. R0WL1NG - HARRY P0TTER AND THE 0RDER 0F PH0EN1X"),
        Arguments.of("J. K. ROWLING - HARRY POTTER AND THE HALF-BLOOD PRINCE", "J. K. R0WL1NG - HARRY P0TTER AND THE HALF-BL00D PR1NCE"),
        Arguments.of("J. K. ROWLING - HARRY POTTER AND THE DEATHLY HALLOWS", "J. K. R0WL1NG - HARRY P0TTER AND THE DEATHLY HALL0W5"),
        Arguments.of("URSULA K. LE GUIN - A WIZARD OF EARTHSEA", "UR5ULA K. LE GU1N - A W1ZARD 0F EARTH5EA"),
        Arguments.of("URSULA K. LE GUIN - THE TOMBS OF ATUAN", "UR5ULA K. LE GU1N - THE T0MB5 0F ATUAN"),
        Arguments.of("URSULA K. LE GUIN - THE FARTHEST SHORE", "UR5ULA K. LE GU1N - THE FARTHE5T 5H0RE"),
        Arguments.of("URSULA K. LE GUIN - TALES FROM EARTHSEA", "UR5ULA K. LE GU1N - TALE5 FR0M EARTH5EA")
        );
    }
}