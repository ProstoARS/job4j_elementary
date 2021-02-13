package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] sumames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива sumames равен: " + sumames.length);
        System.out.println("Размер массива prices равен: " + prices.length);
        System.out.println();
        String[] names = new String[4];
        names[0] = "Arseniy Sudakov";
        names[1] = "Vladimir Budaev";
        names[2] = "Pablo Escobar";
        names[3] = "Staruha Shipoklyak";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
