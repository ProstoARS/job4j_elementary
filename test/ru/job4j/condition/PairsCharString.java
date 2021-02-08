package ru.job4j.condition;

public class PairsCharString {
    public static boolean check(String l, String r) {
        boolean rsl = false;
        char[] signsL = l.toCharArray();
        char[] signsR = r.toCharArray();
        if (l.isEmpty() && r.isEmpty()) {
            return true;
        }
        if (signsL[0] == signsR[signsR.length - 1] && signsL[signsL.length - 1] == signsR[0]) {
            rsl =  true;
        } else {
            rsl = false;
        }
        return rsl;
    }
}
