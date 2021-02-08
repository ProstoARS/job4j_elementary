package ru.job4j.condition;

public class AttackRook {
    public static boolean check(String left, String right) {
        boolean rsl = false;
        char[] sign1 = left.toCharArray();
        char[] sign2 = right.toCharArray();
        if (sign1[0] == sign2[0]) {
            rsl = true;
        } else if (sign1[1] == sign2[1]) {
             rsl = true;
        } else {
            rsl = false;
        }
        return rsl;
    }
}
