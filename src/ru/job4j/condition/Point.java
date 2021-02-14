package ru.job4j.condition;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point that) {
        return Math.sqrt(Math.pow((that.x - this.x), 2) + Math.pow((that.y - this.y), 2));
    }

    public static void main(String[] args) {
        Point point1 = new Point(0, 2);
        Point point2 = new Point(0, 0);
        Point point3 = new Point(2, 2);
        Point point4 = new Point(1, 3);
        Point point5 = new Point(0, 1);
        Point point6 = new Point(5, 3);

        System.out.println(point1.distance(point2));
        System.out.println(point3.distance(point4));
        System.out.println(point5.distance(point6));
    }
}
