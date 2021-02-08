package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int salary = 0;
        for (int i = 0; i < 7; i++) {
            if (i < 5) {
                if (hours[i] <= 8) {
                    salary += hours[i] * 10;
                } else if (hours[i] > 8) {
                    salary += (8 * 10) + (hours[i] - 8) * 15;
                }
            }
            if (i >= 5) {
                if (hours[i] <= 8) {
                    salary += (hours[i] * 10) * 2;
                } else if (hours[i] > 8) {
                    salary += ((8 * 10) + (hours[i] - 8) * 15) * 2;
                }
            }
        }
        return salary;
    }
}
