package ru.job4j.condition;

import java.util.List;

public class HelloWorld {
    public static String checkNumber(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "Hello, World!!!";
        }
        if (number % 3 == 0) {
            return "Hello";
        }
        if (number % 5 == 0) {
            return "World";
        } else {
            return "Operation not support";
        }
    }

    public static String getElement(List<String> list) {
        if (list.isEmpty()) {
            return "";
        } else {
            return list.get(0);
        }
    }
}
