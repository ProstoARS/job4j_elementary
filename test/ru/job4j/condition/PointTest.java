package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point point1 = new Point(0, 2);
        Point point2 = new Point(0, 0);
        double out = point1.distance(point2);
        double expected = 2;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when02to20then283() {
        double expected = 2.83;
        Point point1 = new Point(0, 2);
        Point point2 = new Point(2, 0);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when03to21then283() {
        double expected = 2.83;
        Point point1 = new Point(0, 3);
        Point point2 = new Point(2, 1);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22to22then0() {
        double expected = 0;
        Point point1 = new Point(2, 2);
        Point point2 = new Point(2, 2);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when222to111then() {
        double expected = 1.73;
        Point point1 = new Point(2, 2, 2);
        Point point2 = new Point(1, 1, 1);
        double out = point1.distance3d(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when201to021then() {
        double expected = 2.82;
        Point point1 = new Point(2, 0, 1);
        Point point2 = new Point(0, 2, 1);
        double out = point1.distance3d(point2);
        Assert.assertEquals(expected, out, 0.01);
    }
}