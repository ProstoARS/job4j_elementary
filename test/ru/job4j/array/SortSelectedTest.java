package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenLong() {
        int[] input = {3, 4, 2, 7, 45, 3, 23, 45, 65, 76, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = {2, 3, 3, 4, 5, 7, 23, 45, 45, 65, 76};
        assertThat(result, is(expect));
    }

    @Test
    public void whenVeryShort() {
        int[] input = {45, 23, 65};
        int[] result = SortSelected.sort(input);
        int[] expect = {23, 45, 65};
        assertThat(result, is(expect));
    }
}