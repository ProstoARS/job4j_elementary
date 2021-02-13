package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int j = 0, k = 0;
        for (int i = 0; i < rsl.length; i++) {
                if (j < left.length  && left[j] <= right[k]) {
                    rsl[i] = left[j];
                    j++;
                } else {
                    rsl[i] = right[k];
                    k++;
                }
            }
        return rsl;
    }
}
