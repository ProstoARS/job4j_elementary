package ru.job4j.condition;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {
        return Math.sqrt(Math.pow((that.x - this.x), 2) + Math.pow((that.y - this.y), 2));
    }

    public double distance3d(Point that) {
        return Math.sqrt(Math.pow((that.x - this.x), 2)
                + Math.pow((that.y - this.y), 2)
                + Math.pow((that.z - this.z), 2));
    }

    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }

    public static void main(String[] args) {
        Point point1 = new Point(0, 2);
        Point point2 = new Point(0, 0);
        Point point3 = new Point(2, 2);
        Point point4 = new Point(1, 3);
        Point point5 = new Point(0, 1);
        Point point6 = new Point(5, 3);
        point1.info();
        point2.info();
        System.out.println(point1.distance(point2));
        point3.info();
        point4.info();
        System.out.println(point3.distance(point4));
        point5.info();
        point6.info();
        System.out.println(point5.distance(point6));
    }
}
