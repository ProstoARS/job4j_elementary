package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static int max(int left, int right, int bottom) {
        return max(max(left, right), bottom);
    }

    public static int max(int left, int right, int bottom, int up) {
        return max(max(left, right, bottom), up);
    }
}
