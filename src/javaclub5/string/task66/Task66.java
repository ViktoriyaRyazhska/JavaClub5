package javaclub5.string.task66;

import java.util.Scanner;

/**
 * Created by Sergiy Zapadenko on 25.01.2022 9:35
 */
public class Task66 {
    /**
     * task is correct the errors in the digitised text. You only have to handle the following mistakes:
     * 5->S
     * 0->O
     * 1->I
     */

    public static void main(String[] args) {
        start();
    }
    public static void start(){
        System.out.println("Task  corrects the errors in the digitised text \n");
        String[] lines = {"1F-RUDYARD K1PL1NG",
                "R0BERT MERLE - THE DAY 0F THE D0LPH1N",
                "R1CHARD P. FEYNMAN - THE FEYNMAN LECTURE5 0N PHY51C5",
                "R1CHARD P. FEYNMAN - 5TAT15T1CAL MECHAN1C5",
                "5TEPHEN HAWK1NG - A BR1EF H15T0RY 0F T1ME",
                "5TEPHEN HAWK1NG - THE UN1VER5E 1N A NUT5HELL",
                "ERNE5T HEM1NGWAY - A FARWELL T0 ARM5",
                "ERNE5T HEM1NGWAY - F0R WH0M THE BELL T0LL5",
                "ERNE5T HEM1NGWAY - THE 0LD MAN AND THE 5EA",
                "J. R. R. T0LK1EN - THE L0RD 0F THE R1NG5",
                "J. D. 5AL1NGER - THE CATCHER 1N THE RYE",
                "J. K. R0WL1NG - HARRY P0TTER AND THE PH1L050PHER'5 5T0NE",
                "J. K. R0WL1NG - HARRY P0TTER AND THE CHAMBER 0F 5ECRET5",
                "J. K. R0WL1NG - HARRY P0TTER AND THE PR150NER 0F Azkaban",
                "J. K. R0WL1NG - HARRY P0TTER AND THE G0BLET 0F F1RE"};
        Correct corrector = new Correct();
        for (String l : lines) {
            System.out.printf("%-60s :-> %-60s\n", l, corrector.correct(l));
        }
    }
}
