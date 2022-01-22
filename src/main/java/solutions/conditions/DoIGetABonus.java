package solutions.conditions;

public class DoIGetABonus {
        public static String bonusTime(final int salary, final boolean bonus) {
            return "\u00A3" + (bonus ? 10 : 1) * salary;
        }
}
